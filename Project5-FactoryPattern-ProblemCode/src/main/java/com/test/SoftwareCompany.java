package com.test;

import com.problem.Employee;
import com.problem.Food;

public class SoftwareCompany {
    public static void main(String[] args) {

        Food food = new Food();

        Employee emp = new Employee(food);
        emp.work();

    }
}
