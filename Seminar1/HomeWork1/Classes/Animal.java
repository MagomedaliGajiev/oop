package Seminar1.HomeWork1.Classes;

public class Animal {
    protected String name;
    protected int age;
    protected boolean vaccination;
    protected String color;
    protected String species;
    protected Owner owner;
    protected int legsCount;
    protected boolean swim;
    protected boolean fly;
    protected boolean run;
    protected boolean go;

    public Animal(String name, int age, boolean vaccination, String color, String species, Owner owner, int legsCount,
            boolean swim, boolean fly, boolean run, boolean go) {
        this.name = name;
        this.age = age;
        this.vaccination = vaccination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
    }

    public Animal(String color, String species, int legsCount) {
        this(null, 0, false, color, species, null, legsCount, false, false, false, false);
    }

    public Animal() {
        this(null, null, 0);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void toGo() {
        if (this.go) {
            System.out.println("I'm going!");
        }else{
            System.out.println("I can't go");
        }
    }

    public void swim() {
        if (this.swim) {
            System.out.println("I'm swimming");
        } else {
            System.out.println("I can't swim");
        }
    }

    public void fly() {
        if (fly) {
            System.out.println("I'm flying!");
        } else {
            System.out.println("Unfortunately I can't fly");
        }
    }

    public void run(){
        if (run) {
            System.out.println("I like to run");
        }else{
            System.out.println("I can't run");
        }
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }

}