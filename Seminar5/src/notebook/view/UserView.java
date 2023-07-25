package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = prompt("Enter the command: ");
            command =command.toUpperCase();
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    String firstName = prompt("Name: ");
                    String lastName = prompt("Surname: ");
                    String phone = prompt("Phone number: ");
                    userController.saveUser(new User(firstName, lastName, phone));
                    break;
                case READ:
                    String id = prompt("user ID: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    try {
                        List<User> users = userController.readAllUsers();
                        System.out.println(users);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    try {
                        Long userID = Long.parseLong(prompt("Enter UserID you want to update: "));
                        String newName = prompt("Enter new Name: ");
                        String newSurname = prompt("Enter new Surname: ");
                        String newPhonenumber = prompt("Enter new Phone number: ");
                        User updated = new User(newName, newSurname, newPhonenumber);
                        userController.updateUser(userID, updated);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case DELETE:
                    try {
                        Long userID = Long.parseLong(prompt("Enter UserID you want to delete: "));
                        userController.deletUser(userID);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case NONE:
                    continue;
                    
            }       
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
        
    }
}
