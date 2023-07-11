package Seminar3.Task3_1.core.clients.wild.impl;

import java.time.LocalDate;

import Seminar2.Task2_1.core.clients.FlyAble;
import Seminar2.Task2_1.core.clients.RunAble;
import Seminar2.Task2_1.core.clients.SoundAble;
import Seminar2.Task2_1.core.clients.SwimAble;
import Seminar2.Task2_1.core.clients.owners.Owner;
import Seminar2.Task2_1.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements FlyAble, RunAble, SwimAble, SoundAble {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "is flying at speed 150 km/h");
        return 150;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " is running at speed 5 km/h");
        return 15;
    }

    @Override
    public void sound() {
        System.out.println(CLASS_NAME + " is quacking");
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " is swiming 50 km/h");
        return 10;
    }
}
