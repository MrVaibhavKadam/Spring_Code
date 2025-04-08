package com.factory;

import com.problem.Employee;
import com.problem.Food;
import com.problem.Person;
import com.problem.Student;

public class PersonFactory {
    //Static factory method(having logic of factory pattern)
    public static Person getPerson(String type){

        //Create dependent class object
        Food food = new Food();
        //creaate target class obj
        Person per = null;
        if (type.equalsIgnoreCase("emp"))
            per = new Employee(food);
        else if (type.equalsIgnoreCase("std"))
            per = new Student(food);
        else
            throw new IllegalArgumentException("Invalid Type");

        return per;

    }
}
