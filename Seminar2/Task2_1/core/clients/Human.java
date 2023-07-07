package Seminar2.Task2_1.core.clients;

/**
 Абстракция человека
 */
public abstract class Human extends Animal { // todo на семинаре, в учебных целях, сделать extends Animal
    protected final String fullName;

    public Human(String fullName) {
        this.fullName = fullName;
    }




    public String getFullName() {
        return fullName;
    }
}