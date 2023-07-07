package Seminar2.Task2_1.core.clients.home.impl;

import java.time.LocalDate;

import Seminar2.Task2_1.core.clients.FlyAble;
import Seminar2.Task2_1.core.clients.SoundAble;
import Seminar2.Task2_1.core.clients.home.Pet;
import Seminar2.Task2_1.core.clients.owners.Owner;

public class Parrot extends Pet implements FlyAble, SoundAble {

    public Parrot() {
    }

    public Parrot(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " is flying 120 km/h");
        return 120;
    }

    @Override
    public void sound() {
        System.out.println(CLASS_NAME + " is repeating your speech");
    }
    
}
