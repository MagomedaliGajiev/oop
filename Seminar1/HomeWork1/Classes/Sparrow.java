package Seminar1.HomeWork1.Classes;

public class Sparrow extends Animal{
    private int beakSize;

    public Sparrow(int size) {
        this.beakSize = size;
        super.swim = true;
        super.fly = true;
        super.run = false;
        super.go = true;
    }

    public Sparrow() {
        this(-1);
    }
}
