package com.test;

import com.factory.PersonFactory;
import com.problem.Food;
import com.problem.Person;
import com.problem.Student;

public class Collage {
    public static void main(String[] args) {
        //Code using factory pattern solution

        Person per = PersonFactory.getPerson("std");
        per.work();

    }
}
