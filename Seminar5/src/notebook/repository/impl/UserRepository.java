package notebook.repository.impl;

import notebook.mapper.impl.UserMapper;
import notebook.model.User;
import notebook.repository.GBRepository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GBRepository<User, Long> {
    private final UserMapper mapper;
    private String fileName;

    public UserRepository(String fileName) {
        this.mapper = new UserMapper();
        this.fileName = fileName;

    }

    @Override
    public List<User> findAll() {
        List<String> lines = readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public User create(User user) {
        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id) {
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
        List<User> lines = new ArrayList<>(users);
        saveAll(lines);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        List<User> users = findAll();
        for (User user : users) {
            if (user.getId().equals(id)) {
                System.out.println(user);
            }
            else{
                System.out.println("User not found!");
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> update(Long id, User user) {
        List<User> users = findAll();
        User editUser = users.stream()
                .filter(u -> u.getId()
                        .equals(id))
                .findFirst().orElseThrow(() -> new RuntimeException("User not found"));
        editUser.setId(id);
        editUser.setFirstName(user.getFirstName());
        editUser.setLastName(user.getLastName());
        editUser.setPhone(user.getPhone());
        write(users);
        return Optional.empty();
    }


    private void write(List<User> users) {
        List<User> lines = new ArrayList<>(users);
        saveAll(lines);
    }

    @Override
    public boolean delete(Long id) {
        List<User> users = findAll();
        for (User user : users) {
            if (user.getId().equals(id)) {
                users.remove(user);
                write(users);
                System.out.printf("User with ID%d is deleted!\n", id);
                return true;
            }
        }
        System.out.printf("User with ID%d not found!\n", id);
        return false;
    }

    
    private List<String> readAll() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            //Создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //Создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // Считываем сначала первую строку
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                // Считываем остальные строки в цикле
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    @Override
    public void saveAll(List<User> data) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (User u : data) {
                // запись всей строки
                writer.write(u.getString());
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    };
    }

