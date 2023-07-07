package Seminar2.Task2_1.core.clients.wild.impl;

import Seminar2.Task2_1.core.clients.RunAble;
import Seminar2.Task2_1.core.clients.SoundAble;
import Seminar2.Task2_1.core.clients.SwimAble;
import Seminar2.Task2_1.core.clients.owners.Owner;
import Seminar2.Task2_1.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements RunAble, SoundAble, SwimAble {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " is running at speed 40 km/h");
        return 40;
    }

    @Override
    public void sound() {
        System.out.println(CLASS_NAME + " is meowing");
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " is swimming 30 km/h");
        return 30;
    }
}
