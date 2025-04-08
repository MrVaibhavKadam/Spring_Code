package com.problem;

public class Student extends Person{

    private int rollNo;
    private String course;
    private Food food;

    public Student(Food food) {
        System.out.println("Student:one param constructor.");
        this.food = food;
    }

    @Override
    public void work() {
        System.out.println("Student is studying MCA."+ food);
    }
}
