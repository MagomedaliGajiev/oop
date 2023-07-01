package Seminar1.Task1_1;

import java.util.Arrays;

public class Cat extends Animal{

    public Cat(String color, String species, int legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }

    private void findFood(){
        System.out.println("Cat has found food");
        super.name = name;
    }

    private void findFood(int... foodCount){
        System.out.println("Cat has found food, count = " + Arrays.toString(foodCount));
    }

    private void wakeUp(){
        System.out.println("Cat has already woken up");
    }
    
    private void sleep(){
        System.out.println("Cat has already slept");
    }

    private void eat(){
        System.out.println("Cat has already eaten");
    }

    public void hunt(int... args){
        wakeUp();
        findFood();
        findFood(args);
        eat();
        sleep();
    }
    
}
