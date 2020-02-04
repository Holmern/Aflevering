package com.company;

public class Administration extends Employee {
        private int vacation;
        private int salary;

    public Administration(String name, String CPR, int hours) {
            super(name, CPR, hours);
            this.salary=23000;
            this.vacation=5;


        }

        public int getVacation() {
            return vacation;
        }

        public void setVacation(int vacation) {
            this.vacation = vacation;
        }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
