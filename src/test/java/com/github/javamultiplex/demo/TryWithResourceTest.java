package com.github.javamultiplex.demo;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 01/03/22 12:23 AM
 * @copyright github.com/javamultiplex
 */
public class TryWithResourceTest {

    class R implements AutoCloseable {

        @Override
        public void close() {
            System.out.println("closing...");
        }
    }

    @Test
    public void shouldUseTryWithResourceWithJava7() {
        try (R r1 = new R();
             R r2 = new R()) {

        }
    }

    @Test
    public void shouldUseTryWithResourceWithJava9() {
        R r1 = new R();
        R r2 = new R();
        try (r1;r2) {

        }
    }


}
