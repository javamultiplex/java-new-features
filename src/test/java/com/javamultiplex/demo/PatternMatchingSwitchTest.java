package com.javamultiplex.demo;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/**
 * @author Rohit Agarwal on 15/04/22 7:10 PM
 * @copyright www.javamultiplex.com
 */
public class PatternMatchingSwitchTest {

    sealed class Vehicle permits Car, Bus, Truck {

    }

    final class Car extends Vehicle {
    }

    final class Bus extends Vehicle {
    }

    final class Truck extends Vehicle {
    }


    @Test
    public void example1() {
        Stream.of(1, null, "hello", true, 1.4)
                .map(PatternMatchingSwitchTest::process1)
                .forEach(System.out::println);
    }

    @Test
    public void example2() {
        System.out.println(process2(new Car()));
        System.out.println(process2(new Bus()));
        System.out.println(process2(new Truck()));
    }

    private static String process1(Object object) {
        return switch (object) {
            case null -> "NULL";
            case Integer i -> "Integer";
            case Number n -> "Number";
            case String str -> "String";
            case Boolean b -> "Boolean";
            default -> "Unknown";
        };
    }

    private static String process2(Object object) {
        return switch (object) {
            case Car c -> "Car";
            case Bus b -> "Bus";
            case Truck t -> "Truck";
            default -> "Unknown";
        };
    }
}