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
public class Cat extends Pet implements SoundAble, SwimAble, RunAble {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public void sound() {
        System.out.println(CLASS_NAME + " is meowing");
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " is swimming 15 km/h");
        return 15;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " is running at speed 30 km/h");
        return 30;
    }
}
