package com.company;

public class Person {
    private String name;
    private String CPR;

    public Person() {
    }

    public Person(String name, String CPR) {
        this.name = name;
        this.CPR = CPR;
    }

    public String getName() {
        return name;
    }

    public String getCPR() {
        return CPR;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCPR(String CPR) {
        this.CPR = CPR;
    }

    @Override
    public String toString() {
        return  name + ',' + ' '  +
                 CPR +
        '\n';
    }
}
