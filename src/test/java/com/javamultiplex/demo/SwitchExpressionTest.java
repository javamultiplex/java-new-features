package com.javamultiplex.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 01/03/22 12:12 AM
 * @copyright www.javamultiplex.com
 */
public class SwitchExpressionTest {

    @Test
    public void shouldUseSwitchExpression() {
        int a = 10;
        String output = switch (a) {
            case 1, 2, 3 -> "hello";
            case 5, 6, 7 -> "world";
            default -> "fun";
        };
        assertEquals("fun", output);
    }

    @Test
    public void shouldUseSwitchExpressionWithArrowAndYield() {
        int a = 2;
        String output = switch (a) {
            case 1, 2, 3 -> {
                System.out.println("hello");
                yield "hello";
            }
            case 5, 6, 7 -> "world";
            default -> "fun";
        };
        assertEquals("hello", output);
        int b = 3;
        int result = switch (b) {
            case 1, 2, 3 -> 100;
            case 5, 6, 7 -> 200;
            default -> 300;
        };
        assertEquals(100, result);
    }

    @Test
    public void shouldUseSwitchExpressionWithColonAndYield() {
        int a = 7;
        String output = switch (a) {
            case 1, 2, 3:
                yield "hello";
            case 5, 6, 7:
                yield "world";
            default:
                yield "fun";
        };
        assertEquals("world", output);
        int b = 3;
        int result = switch (b) {
            case 1, 2, 3 -> 100;
            case 5, 6, 7 -> 200;
            default -> 300;
        };
        assertEquals(100, result);
    }
}
