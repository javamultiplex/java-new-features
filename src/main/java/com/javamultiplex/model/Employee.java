package com.javamultiplex.model;

import lombok.Getter;
import lombok.ToString;

import java.util.Set;

/**
 * @author Rohit Agarwal on 01/02/22 12:33 PM
 * @copyright www.javamultiplex.com
 */
@Getter
@ToString
public class Employee {
    private final long id;
    private final String name;
    private final int age;
    private final String department;
    private final long salary;
    private final Set<String> courses;

    public Employee(long id, String name, int age, String department, long salary, Set<String> courses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.courses = courses;
    }
}