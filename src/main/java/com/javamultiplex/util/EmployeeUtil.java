package com.javamultiplex.util;

import com.javamultiplex.model.DepartmentDetails;
import com.javamultiplex.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Rohit Agarwal on 01/02/22 12:36 PM
 * @copyright www.javamultiplex.com
 */

//https://javadevcentral.com/collectors-new-methods-jdk-9-to-11
public class EmployeeUtil {

    /**
     * @param employeeList
     * @return
     */
    public static Map<String, List<Employee>> getEmployeeListByDepartment(final List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.toUnmodifiableList()));
    }

    /**
     * @param employeeList
     * @return
     */
    public static Map<String, List<Long>> getEmployeeSalaryListByDepartment(final List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary,
                                Collectors.toUnmodifiableList())));
    }


    /**
     * @param employeeList
     * @param salary
     * @return
     */
    public static Map<String, List<Long>> getEmployeeSalaryListByDepartment(final List<Employee> employeeList, final long salary) {
        return employeeList.stream()
                .filter(employee -> employee.getSalary() > salary)
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary,
                                Collectors.toUnmodifiableList())));
    }

    /**
     * @param employeeList
     * @param salary
     * @return
     */
    public static Map<String, List<Long>> getEmployeeSalaryListByDepartmentInJava9(final List<Employee> employeeList, final long salary) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.filtering(employee -> employee.getSalary() > salary,
                                Collectors.mapping(Employee::getSalary,
                                        Collectors.toUnmodifiableList()))));
    }


    /**
     * @param employeeList
     * @return
     */
    public static Map<String, Set<Set<String>>> getEmployeeCoursesByDepartment(final List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getCourses,
                                Collectors.toUnmodifiableSet())));
    }


    /**
     * @param employeeList
     * @return
     */
    public static Map<String, Set<String>> getEmployeeCoursesByDepartmentInJava9(final List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.flatMapping(employee -> employee.getCourses().stream(),
                                Collectors.toUnmodifiableSet())));
    }

    /**
     *
     * @param employeeList
     * @return
     */
    public static List<DepartmentDetails> mapEmployeeListToDepartmentDetailsList(final List<Employee> employeeList) {
        final var departmentToAverageSalaryMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingLong(Employee::getSalary)));

        final var departmentToAverageAgeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingLong(Employee::getAge)));

        return departmentToAverageSalaryMap.entrySet()
                .stream()
                .map(departmentToAverageSalary ->
                        new DepartmentDetails(departmentToAverageSalary.getKey(),
                                departmentToAverageSalary.getValue(),
                                departmentToAverageAgeMap.get(departmentToAverageSalary.getKey())))
                .collect(Collectors.toUnmodifiableList());
    }

    /**
     *
     * @param employeeList
     * @return
     */
    public static List<DepartmentDetails> mapEmployeeListToDepartmentDetailsListInJava12(final List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.teeing(
                        Collectors.groupingBy(Employee::getDepartment, Collectors.averagingLong(Employee::getSalary)),
                        Collectors.groupingBy(Employee::getDepartment, Collectors.averagingLong(Employee::getAge)),
                        (map1, map2) -> map1.entrySet().stream().map(m-> new DepartmentDetails(m.getKey(), m.getValue(),map2.get(m.getKey())))))
                .collect(Collectors.toUnmodifiableList());
    }

}
