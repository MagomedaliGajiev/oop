package Seminar2.Task2_1.core.clients.home.impl;

import Seminar2.Task2_1.core.clients.RunAble;
import Seminar2.Task2_1.core.clients.SoundAble;
import Seminar2.Task2_1.core.clients.SwimAble;
import Seminar2.Task2_1.core.clients.home.Pet;
import Seminar2.Task2_1.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements RunAble, SwimAble, SoundAble {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public void sound() {
        System.out.println(CLASS_NAME + " is barking");
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " is swimming 16 km/h");
        return 16;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " is running at speed 31 km/h");
        return 31;
    }
}
