package Seminar1.Task1_1;

public class Animal {
    protected String name;
    private int age;
    private boolean vaccination;
    private String color;
    private String species;
    private Owner owner;
    private int legsCount;


    public Animal(String name, int age, boolean vaccination, String color, String species, Owner owner, int legsCount) {
        this.name = name;
        this.age = age;
        this.vaccination = vaccination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
    }

    public Animal(String color, String species, int legsCount) {
        this(null, 0, false, color, species, null, legsCount);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString(){
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }

    
}