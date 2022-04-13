package com.javamultiplex.demo;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

/**
 * @author Rohit Agarwal on 12/03/22 6:42 PM
 * @copyright www.javamultiplex.com
 */
public class ParallelStreamsTest {

    @Test
    public void shouldCreateParallelStreamAndPrintInOrder() {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.parallelStream()
                .filter(ParallelStreamsTest::isEven)
                .forEachOrdered(System.out::println);
    }

    @Test
    public void shouldCreateParallelStreamAndNotPrintInOrder() {
        var set = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        set.parallelStream()
                .filter(ParallelStreamsTest::isEven)
                .forEachOrdered(System.out::println);
    }

    public static boolean isEven(int element) {
        sleep(1000);
        System.out.println(Thread.currentThread());
        return element % 2 == 0;
    }

    private static void sleep(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
