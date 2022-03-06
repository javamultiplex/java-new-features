package com.javamultiplex.demo;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 06/03/22 11:31 PM
 * @copyright www.javamultiplex.com
 */
public class InstanceOfOperatorTest {

    @Test
    public void shouldTestInstanceOfOperator(){
        Number number = 10;
        if (number instanceof Integer num){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
