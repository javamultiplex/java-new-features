package com.github.javamultiplex.model;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Rohit Agarwal on 02/02/22 11:17 PM
 * @copyright github.com/javamultiplex
 */
@Getter
@ToString
public class DepartmentDetails {
    private final String departmentName;
    private final double averageSalary;
    private final double averageAgeOfEmployee;

    public DepartmentDetails(String departmentName, double averageSalary, double averageAgeOfEmployee) {
        this.departmentName = departmentName;
        this.averageSalary = averageSalary;
        this.averageAgeOfEmployee = averageAgeOfEmployee;
    }
}
