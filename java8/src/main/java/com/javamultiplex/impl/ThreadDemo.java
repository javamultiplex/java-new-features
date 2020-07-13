package com.javamultiplex.impl;

/**
 * @author Rohit Agarwal on 13/07/20 9:07 pm
 * @copyright www.javamultiplex.com
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread : " + i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread : " + i);
        }
    }
}
