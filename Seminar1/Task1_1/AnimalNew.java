package Seminar1.Task1_1;

public class AnimalNew extends Animal {

    private int eyesCount;

    public AnimalNew(String name, int age, boolean vaccination, String color, String species, Owner owner,
            int legsCount) {
        super(name, age, vaccination, color, species, owner, legsCount);
        this.eyesCount = 2;
        
    }

    public AnimalNew() {
        this(null, 0, false, null, null, null, 4);
    }
    

    public int getEyesCount() {
        return eyesCount;
    }

    @Override
    public String toString(){
        return "I'm AnimalNew";
    }
    
}
