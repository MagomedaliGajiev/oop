package Seminar1.HomeWork1.Classes;

public class Pterosaur extends Animal {
    private int wingspan;

    public Pterosaur(int wingspan) {
        this.wingspan = wingspan;
        super.swim = true;
        super.fly = true;
        super.run = true;
        super.go = true;
    }

    public Pterosaur() {
        this(500);
    }
}
