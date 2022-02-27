package com.javamultiplex.util;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Rohit Agarwal on 27/02/22 5:20 PM
 * @copyright www.javamultiplex.com
 */
public class StringUtilTest {


    @Test
    public void shouldStreamToChars() {
        final String input = "\uD800\uDC00";
        final IntStream intStream = StringUtil.streamToCharsInJava9(input);
        intStream.forEach(System.out::println);
    }


    @Test
    public void shouldStreamToCodePoints() {
        final String input = "\uD800\uDC00";
        final IntStream intStream = StringUtil.streamToCodePointsInJava9(input);
        intStream.forEach(System.out::println);
    }

    @Test
    public void shouldIndentString() {
        String input = "hello\nworld";
        final String output = StringUtil.indentInJava12(input, 4);
        assertNotNull(output);
        assertEquals("    hello\n    world\n", output);
    }

    @Test
    public void shouldTransformString() {
        String input = "hello";
        final Object output = StringUtil.transformInJava12(input, String::toUpperCase);
        assertNotNull(output);
        assertEquals("HELLO", output);
    }
}
