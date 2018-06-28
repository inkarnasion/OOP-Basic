package definingClasses_exercises.CompanyRoster_04;

import java.text.DecimalFormat;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String departmen;
    private String email;
    private int age;

    Employee(String name,double salary,String position,String departmen){
        this (name,salary,position,departmen,"n/a", -1);
    }
    Employee(String name,double salary,String position,String departmen,int age){
        this (name,salary,position,departmen,"n/a",age);
    }
    Employee(String name,double salary,String position,String departmen,String email){
        this (name,salary,position,departmen,email,-1);
    }
     Employee(String name, double salary, String position, String departmen, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.departmen = departmen;
        this.email = email;
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getPosition() {
        return this.position;
    }

    public String getDepartment() {
        return this.departmen;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", this.name,this.salary,this.email,this.age);
    }
}
