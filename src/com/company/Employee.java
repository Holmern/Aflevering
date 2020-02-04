package com.company;

public class Employee extends Person{
    private int hours;
    private int salary;
    private int vacation;

    public Employee(String name, String CPR, int hours) {
        super(name, CPR);
        this.hours = hours;
        this.salary = 456;
        this.vacation = 0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary * hours;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getVacation() {
        return vacation;
    }
}
