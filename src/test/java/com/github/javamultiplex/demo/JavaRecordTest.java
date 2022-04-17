package com.github.javamultiplex.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 06/03/22 11:28 PM
 * @copyright github.com/javamultiplex
 */

public class JavaRecordTest {

    public sealed interface Human permits Student {

    }

    public record Student(String name, int age) implements Human {
    }

    public record StudentV2(String name, int age) {
        //Compact Constructor
        public StudentV2 {
        }
    }


    public record StudentV3(String name, int age) {
        //Canonical Constructor
        public StudentV3(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public record StudentV4(String name, int age){
        public StudentV4(String name) {
            this(name, 0);
        }
    }

    @Test
    public void shouldCreateStudentRecord() {
        var student = new Student("Rohit", 28);
        assertEquals("Rohit", student.name());
        assertEquals(28, student.age());
    }
}

