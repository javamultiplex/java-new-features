package com.javamultiplex.demo;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 06/03/22 11:31 PM
 * @copyright www.javamultiplex.com
 */
public class PatternMatchingInstanceOfTest {

    @Test
    public void shouldTestInstanceOfOperator() {
        process(10);
        process(3.4);
    }

    public static void process(Object object) {
        if (object instanceof Integer i) {
            System.out.println("Integer");
        } else if (object instanceof Number n) {
            System.out.println("Number");
        }
    }
}
