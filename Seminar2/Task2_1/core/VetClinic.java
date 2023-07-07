package Seminar2.Task2_1.core;

import java.util.ArrayList;
import java.util.List;

import Seminar2.Task2_1.core.clients.Animal;
import Seminar2.Task2_1.core.clients.Animals;
import Seminar2.Task2_1.core.clients.FlyAble;
import Seminar2.Task2_1.core.clients.Human;
import Seminar2.Task2_1.core.clients.RunAble;
import Seminar2.Task2_1.core.clients.SoundAble;
import Seminar2.Task2_1.core.clients.SwimAble;
import Seminar2.Task2_1.core.clients.home.impl.Cat;
import Seminar2.Task2_1.core.clients.home.impl.Dog;
import Seminar2.Task2_1.core.clients.home.impl.Parrot;
import Seminar2.Task2_1.core.clients.wild.WildAnimal;
import Seminar2.Task2_1.core.clients.wild.impl.Duck;
import Seminar2.Task2_1.core.clients.wild.impl.WildCat;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>();

    public static void main(String[] args) {
        // Human human = new Human("Magomedali");
        Cat cat = new Cat(0, null, 0, null, null);
        Parrot parrot = new Parrot();
        Duck duck = new Duck();
        Dog dog = new Dog();
        WildCat wildCat = new WildCat();
        
        // animals.add(human);
        animals.add(cat);
        animals.add(duck);
        animals.add(parrot);
        animals.add(dog);
        animals.add(wildCat);
        // for (Animals iteAnimal : animals) {
        //     heal(iteAnimal); 
        // }

        System.out.println(getFlying(animals));
        System.out.println(getRunning(animals));
        System.out.println(getSwimming(animals));
        System.out.println(getSound(animals));

        duck.run();
    }

    // private void heal(Animals patient){
    //     System.out.println(patient.getCLASS_NAME() + " is cured");
    // }

    public static List<Animals> getFlying(List<Animals> col){
        ArrayList<Animals> flyingAnimals = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof FlyAble){
                flyingAnimals.add(animal);
            }
        }
        return flyingAnimals;
    }

    public static List<Animals> getRunning(List<Animals> col){
        ArrayList<Animals> runningAnimals = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof RunAble){
                runningAnimals.add(animal);
            }
        }
        return runningAnimals;
    }

    public static List<Animals> getSwimming(List<Animals> col){
        ArrayList<Animals> swimmingnimals = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof SwimAble){
                swimmingnimals.add(animal);
            }
        }
        return swimmingnimals;
    }

    public static List<Animals> getSound(List<Animals> col){
        ArrayList<Animals> soundAnimals = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof SoundAble){
                soundAnimals.add(animal);
            }
        }
        return soundAnimals;
    }

}
