package Seminar2.Task2_1.core.clients.owners;

import Seminar2.Task2_1.core.clients.Animal;
import Seminar2.Task2_1.core.clients.Human;

import java.util.ArrayList;
import java.util.List;

/**
 Хозяин животного, пациента клиники
 */
public class Owner extends Human {

    private final List<Animal> pets; //питомцы, которых человек принес в клинику

    public Owner(String fullName) {
        super(fullName);
        this.pets = new ArrayList<>();
    }

    public List<Animal> getPets() {
        return pets;
    }
}
