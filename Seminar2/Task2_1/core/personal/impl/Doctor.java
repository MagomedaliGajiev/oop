package Seminar2.Task2_1.core.personal.impl;

import Seminar2.Task2_1.core.personal.HealAble;
import Seminar2.Task2_1.core.personal.OperateAble;
import Seminar2.Task2_1.core.personal.Paramedic;

public class Doctor extends Paramedic implements HealAble, OperateAble {

    private String category;

    public Doctor(String name) {
        super(name);
    }

    public Doctor(String name, String category) {
        super(name);
        this.category = category;
    }

    @Override
    public void operate() {
        System.out.println(CLASS_NAME + " is doing surgery");
    }

    @Override
    public void heal() {
        System.out.println(CLASS_NAME + " is healing");
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
