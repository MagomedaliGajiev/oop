package Seminar3.Task3_1.core.personal;

import Seminar2.Task2_1.core.clients.Human;

public abstract class Paramedic extends Human {
    protected Integer experience;
    protected Integer age;
    protected String address;
    
    public Paramedic(String fullname) {
        super(fullname);
    }

    public Paramedic(String fullname, int experience, int age, String address) {
        super(fullname);
        this.experience =experience;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getExperience() {
        return experience;
    }

}
