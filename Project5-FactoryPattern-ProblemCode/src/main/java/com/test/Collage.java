package com.test;

import com.problem.Employee;
import com.problem.Food;
import com.problem.Student;

public class Collage {
    public static void main(String[] args) {
        //Code without using Factory Pattern
        Food food = new Food();

        Student std = new Student(food);
        std.work();

    }
}
