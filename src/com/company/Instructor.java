package com.company;

public class Instructor extends Employee{


    public Instructor(String name, String CPR, int hours) {
        super(name, CPR, hours);
    }

    @Override
    public int getHours() {
        return super.getHours();
    }
}
