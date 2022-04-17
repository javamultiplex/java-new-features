package com.github.javamultiplex.demo;

import com.github.javamultiplex.model.Employee;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 27/02/22 11:05 PM
 * @copyright github.com/javamultiplex
 */
public class StringJoinerTest {

    @Test
    public void shouldJoinTwoStringsWithStringJoiner() {
        var joiner = new StringJoiner("-", "p-", "-s");
        joiner.add("rohit");
        joiner.add("bhavna");
        joiner.add("shivani");
        assertEquals("p-rohit-bhavna-shivani-s", joiner.toString());
    }

    @Test
    public void shouldJoinTwoStringsWithStringJoinMethod() {
        var string1 = String.join("-", "rohit", "bhavna", "shivani");
        assertEquals("rohit-bhavna-shivani", string1);
        var string2 = String.join(",", List.of("rohit", "bhavna", "shivani"));
        assertEquals("rohit,bhavna,shivani", string2);
    }

    @Test
    public void shouldJoinCollectors() {
        var employees = List.of(new Employee("Rohit", 18),
                new Employee("Bhavna", 15),
                new Employee("Shivani", 12));
        var output = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(","));
        assertEquals("Rohit,Bhavna,Shivani",output);
    }

    @Test
    public void shouldReturnEmptyValue_defaultEmptyValueNotSet(){
        var joiner=new StringJoiner(",");
        assertEquals("",joiner.toString());
    }

    @Test
    public void shouldReturnDefaultEmptyValue_defaultEmptyValueSet(){
        var joiner=new StringJoiner(",");
        joiner.setEmptyValue("default");
        assertEquals("default",joiner.toString());
    }

    @Test
    public void shouldNotReturnDefaultEmptyValue_defaultEmptyValueSet(){
        var joiner=new StringJoiner(",");
        joiner.setEmptyValue("default");
        joiner.add("rohit");
        joiner.add("bhavna");
        assertEquals("rohit,bhavna",joiner.toString());
    }
}
