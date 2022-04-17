package com.github.javamultiplex.util;

import com.github.javamultiplex.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 01/02/22 12:50 PM
 * @copyright github.com/javamultiplex
 */
public class EmployeeUtilTest {

    private List<Employee> employeeList;

    @BeforeEach
    void setUp() {
        employeeList = List.of(
                new Employee(1, "Rohit", 25, "IT", 10000, Set.of("Java", "Docker")),
                new Employee(2, "Ram", 27, "HR", 20000, Set.of("MBA")),
                new Employee(3, "Shyam", 25, "IT", 15000, Set.of("Java", "Docker", "SpringBoot")),
                new Employee(4, "Sumit", 28, "Finance", 60000, Set.of("Finance"))
        );

    }

    @Test
    public void shouldReturnEmployeeListByDepartment() {
        final var map = EmployeeUtil.getEmployeeListByDepartment(employeeList);
        System.out.println(map);
        assertEquals(3, map.size());
    }

    @Test
    public void shouldReturnEmployeeSalaryListByDepartment() {
        final var map = EmployeeUtil.getEmployeeSalaryListByDepartment(employeeList);
        System.out.println(map);
        assertEquals(3, map.size());
    }

    @Test
    public void shouldReturnEmployeeSalaryListByDepartment_ifEmployeeSalaryGreaterThan15000() {
        final var map = EmployeeUtil.getEmployeeSalaryListByDepartment(employeeList, 15000);
        System.out.println(map);
        assertEquals(2, map.size());
    }

    @Test
    public void shouldReturnEmployeeSalaryListByDepartmentInJava9_ifEmployeeSalaryGreaterThan15000() {
        final var map = EmployeeUtil.getEmployeeSalaryListByDepartmentInJava9(employeeList, 15000);
        System.out.println(map);
        assertEquals(3, map.size());
    }


    @Test
    public void shouldReturnEmployeeCoursesByDepartment() {
        final var map = EmployeeUtil.getEmployeeCoursesByDepartment(employeeList);
        System.out.println(map);
        assertEquals(3, map.size());
    }

    @Test
    public void shouldReturnEmployeeCoursesByDepartmentInJava9() {
        final var map = EmployeeUtil.getEmployeeCoursesByDepartmentInJava9(employeeList);
        System.out.println(map);
        assertEquals(3, map.size());
    }

    @Test
    public void shouldMapEmployeeListToDepartmentDetailsList() {
        final var departmentDetailsList = EmployeeUtil.mapEmployeeListToDepartmentDetailsList(employeeList);
        System.out.println(departmentDetailsList);
    }

    @Test
    public void shouldMapEmployeeListToDepartmentDetailsListInJava12() {
        final var departmentDetailsList = EmployeeUtil.mapEmployeeListToDepartmentDetailsListInJava12(employeeList);
        System.out.println(departmentDetailsList);
    }
}
