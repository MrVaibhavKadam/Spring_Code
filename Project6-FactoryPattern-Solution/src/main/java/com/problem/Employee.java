package com.problem;

public class Employee extends Person{

    private String desg;
    private  float salary;

    public Employee(Food food) {
        System.out.println("Employee: one param constructor.");

        this.food = food;
    }

    private  Food food;



    @Override
    public void work() {
        System.out.println("Employee is working on S/W Development."+ food);
    }
}
