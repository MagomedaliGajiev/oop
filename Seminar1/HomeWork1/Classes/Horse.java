package Seminar1.HomeWork1.Classes;

public class Horse extends Animal {
    private int maxSpeed;

    public Horse(int speed) {
        this.maxSpeed = speed;
        super.swim = false;
        super.fly = false;
        super.run = true;
        super.go = true;
    }

    public Horse() {
        this(88);
    }


}
