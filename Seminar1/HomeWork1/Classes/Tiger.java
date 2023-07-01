package Seminar1.HomeWork1.Classes;

public class Tiger extends Animal {
    private int power;

    public Tiger(int power) {
        this.power = power;
        super.swim = true;
        super.fly = false;
        super.run = true;
        super.go = true;
    }

    public Tiger() {
        this(100);
    }
}
