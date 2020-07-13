package com.javamultiplex.impl;

import com.javamultiplex.interfaces.Calculator;

/**
 * @author Rohit Agarwal on 13/07/20 8:59 pm
 * @copyright www.javamultiplex.com
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        int a = 10;
        int b = 20;
        System.out.printf("Sum of %d and %d is : %d", a, b, calculator.add(a, b));
    }
}
