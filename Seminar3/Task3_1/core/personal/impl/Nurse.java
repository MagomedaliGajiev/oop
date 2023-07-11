package Seminar3.Task3_1.core.personal.impl;

import Seminar2.Task2_1.core.personal.BandageAble;
import Seminar2.Task2_1.core.personal.MakeInjection;
import Seminar2.Task2_1.core.personal.Paramedic;

public class Nurse extends Paramedic implements BandageAble, MakeInjection {
    private int height;

    public Nurse(String fullname) {
        super(fullname);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void MakeInjection() {
        System.out.println(CLASS_NAME + " is making an injection");
    }

    @Override
    public void bandage() {
        System.out.println(CLASS_NAME + "is doing bandage");
    }
}
