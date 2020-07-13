package com.javamultiplex.impl;

import com.javamultiplex.interfaces.StringOperation;

/**
 * @author Rohit Agarwal on 13/07/20 9:03 pm
 * @copyright www.javamultiplex.com
 */
public class StringOperationDemo {
    public static void main(String[] args) {
        StringOperation stringOperation = s->s.length();
        String input = "Javamultiplex";
        System.out.printf("Length of %s is : %d", input,stringOperation.length(input));
    }
}
