package Seminar1.HomeWork1.Classes;

public class Whale extends Animal {
    private int weight;

    public Whale(int weight) {
        this.weight = weight;
        super.swim = true;
        super.fly = false;
        super.run = false;
        super.go = false;
    }

    public Whale() {
        this(-1);
    }
}
