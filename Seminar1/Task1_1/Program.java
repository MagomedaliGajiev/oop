package Seminar1.Task1_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Barsik", 4, true, "black", "Cat", new Owner("Magomedali"), 4);
        Animal animal2 = new Animal("white", "Tiger", 4);

         System.out.println(animal1);

         AnimalNew animalNew = new AnimalNew(null, 3, true, "red", "dog", null, 4);
         System.out.println(animalNew);

         Animal cat = new AnimalNew();

         List<Animal> animals = new ArrayList<>();
         animals.add(new Dog(null, null, 0));
         animals.add(new Cat(null, null, 0));
         animals.add(cat);
         animals.add(animal1);
         animals.add(animal2);
         System.out.println(animals);
        for (Animal item : animals) {
            if (item instanceof AnimalNew) {
                System.out.println(((AnimalNew)item).getEyesCount());
            }
            // if (item instanceof Cat) {
            //     ((Cat)item).findFood(3);
            //     ((Cat)item).findFood();
            // }
        }
        Cat barsik = new Cat(null, null, 0);
        barsik.hunt(3);
    }
}
