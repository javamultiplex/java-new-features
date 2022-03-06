package com.javamultiplex.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 06/03/22 11:28 PM
 * @copyright www.javamultiplex.com
 */

public class JavaRecordTest {

    public record Student(String name, int age) {

    }

    @Test
    public void shouldCreateStudentRecord(){
        var student = new Student("Rohit",28);
        assertEquals("Rohit",student.name());
        assertEquals(28,student.age());
    }
}
