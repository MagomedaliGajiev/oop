package Seminar1.HomeWork1.Classes;

public class Shark extends Animal {

    private int fin;
    private String kindShark;
    public Shark(int fin, String kind) {
        this.fin = fin;
        this.kindShark = kind;
        super.swim = true;
        super.fly = false;
        super.run = false;
        super.go = false;
    }

    public Shark() {
        this(2, "undefined");
    }
}
