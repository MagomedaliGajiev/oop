package Seminar1.HomeWork1;

import java.util.ArrayList;
import java.util.List;

import Seminar1.HomeWork1.Classes.Horse;
import Seminar1.HomeWork1.Classes.Pterosaur;
import Seminar1.HomeWork1.Classes.Shark;
import Seminar1.HomeWork1.Classes.Sparrow;
import Seminar1.HomeWork1.Classes.Tiger;
import Seminar1.HomeWork1.Classes.Whale;

public class Program {
    public static void main(String[] args) {
        Shark shark1 = new Shark();
        shark1.setName("Shark");
        System.out.printf("Hi my name is %s\n", shark1.getName());
        shark1.toGo();
        shark1.swim();
        shark1.run();
        shark1.fly();
        System.out.println();


        Whale whale = new Whale();
        whale.setName("Whale");
        System.out.printf("Hi my name is %s\n", whale.getName());
        whale.toGo();
        whale.swim();
        whale.run();
        whale.fly();
        System.out.println();

        Tiger tiger = new Tiger();
        tiger.setName("Tiger");
        System.out.printf("Hi my name is %s\n", tiger.getName());
        tiger.toGo();
        tiger.swim();
        tiger.run();
        tiger.fly();
        System.out.println();

        Horse horse = new Horse();
        horse.setName("Horse");
        System.out.printf("Hi my name is %s\n", horse.getName());
        horse.toGo();
        horse.swim();
        horse.run();
        horse.fly();
        System.out.println();

        Pterosaur pterosaur = new Pterosaur();
        pterosaur.setName("Pterosaur");
        System.out.printf("Hi my name is %s\n", pterosaur.getName());
        pterosaur.toGo();
        pterosaur.swim();
        pterosaur.run();
        pterosaur.fly();
        System.out.println();

        Sparrow sparrow = new Sparrow();
        sparrow.setName("Sparrow");
        System.out.printf("Hi my name is %s\n", sparrow.getName());
        sparrow.toGo();
        sparrow.swim();
        sparrow.run();
        sparrow.fly();
        System.out.println();

    }
}
