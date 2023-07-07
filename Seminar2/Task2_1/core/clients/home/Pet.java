package Seminar2.Task2_1.core.clients.home;

import Seminar2.Task2_1.core.clients.Animal;
import Seminar2.Task2_1.core.clients.Animals;
import Seminar2.Task2_1.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Абстракция домашнего животного
 */
public class Pet extends Animal implements Animals{
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
