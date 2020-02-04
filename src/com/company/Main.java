package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        getAllFitnessPeople();
        getAllMembers();
        getAllEmployees();
    }

        public static void getAllFitnessPeople() {
            ArrayList<Person> allFitnessPeople = new ArrayList<>();

            allFitnessPeople.add(new Person("Camille", "1206567890"));
            allFitnessPeople.add(new Person("Camilla", "1205567812"));
            allFitnessPeople.add( new Person("Kimmy", "1204567123"));
            allFitnessPeople.add( new Person("Paris", "1203561234"));
            allFitnessPeople.add(new Person("Peach", "1202512345"));
            allFitnessPeople.add(new Person("LaQuisha", "12011234567"));
            System.out.println("Name        CPR" + '\n' + allFitnessPeople);
        }



    //Liste af alle medlemmer
    public static void getAllMembers() {
        ArrayList<Member> allMembers = new ArrayList<>();

        allMembers.add(new Member("Camille", "1206567890", true));
        allMembers.add(new Member("Camilla", "1205567812", false));
        allMembers.add(new Member("Kimmy", "1204567123", true));

        for (Member member : allMembers) {
            System.out.println(member.getName() + " " + member.getCPR() + " " + member.monthlyFee() + " " + member.getMemberType());
        }
        System.out.println("===============================================");
    }
    //Liste over alle employees
        public static void getAllEmployees(){
        ArrayList<Employee> AllEmployees = new ArrayList<>();

            AllEmployees.add(new Instructor("Paris", "1203561234", 10));
            AllEmployees.add(new Administration("Peach", "1202512345", 37));
            AllEmployees.add(new Administration("LaQuisha", "12011234567", 37));

            for (Employee employee : AllEmployees){
                System.out.println(employee.getName() + " " + employee.getCPR() + " " + employee.getHours() + " " + employee.getSalary() + " " + employee.getVacation());
            }

        }

    }

