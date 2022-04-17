package com.github.javamultiplex.demo;

import lombok.Getter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 15/04/22 12:26 PM
 * @copyright github.com/javamultiplex
 */
public class LocalMethodTest {

    @Test
    public void shouldCreateRecordInsideMethod() {
        record Employee(String name) {
        }
        Employee employee = new Employee("Rohit");
        assertEquals("Rohit", employee.name());
    }

    @Test
    public void shouldCreateClassInsideMethod() {
        @Getter
        class Employee {
            private final String name;

            public Employee(String name) {
                this.name = name;
            }
        }
        Employee employee = new Employee("Rohit");
        assertEquals("Rohit", employee.getName());
    }

    @Test
    public void shouldCreateInterfaceInsideMethod() {
        interface Eatable {
            void eat();
        }
        Eatable eatable = () -> System.out.println("Eat Burger");
        eatable.eat();
    }

    @Test
    public void shouldCreateEnumInsideMethod() {
        enum Month {
            JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
        }
        for (Month month : Month.values()) {
            System.out.println(month);
        }
    }

}
