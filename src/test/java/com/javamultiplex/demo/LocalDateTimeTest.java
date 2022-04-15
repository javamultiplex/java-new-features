package com.javamultiplex.demo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Rohit Agarwal on 15/04/22 2:26 PM
 * @copyright www.javamultiplex.com
 */
public class LocalDateTimeTest {

    @Test
    public void shouldFormatCurrentDate() {
        System.out.println(DateTimeFormatter
                .ofPattern("B")
                .format(LocalDateTime.now()));
    }

    @Test
    public void shouldFormatAnotherDate() {
        System.out.println(DateTimeFormatter
                .ofPattern("B")
                .format(LocalTime.of(10, 0)));
    }
}
