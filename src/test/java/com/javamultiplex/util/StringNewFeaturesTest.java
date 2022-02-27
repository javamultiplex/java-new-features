package com.javamultiplex.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 27/02/22 5:20 PM
 * @copyright www.javamultiplex.com
 */
public class StringNewFeaturesTest {

    /**
     * Java 9
     */
    @Test
    public void shouldStreamToChars() {
        var input = "\uD800\uDC00";
        var intStream = input.chars();
        intStream.forEach(System.out::println);
    }

    /**
     * Java 9
     */
    @Test
    public void shouldStreamToCodePoints() {
        var input = "\uD800\uDC00";
        var intStream = input.codePoints();
        intStream.forEach(System.out::println);
    }

    /**
     * Java 11
     */
    @Test
    public void shouldValidateBlankString() {
        var input = " ";
        assertTrue(input.isBlank());
        assertFalse(input.isEmpty());
    }

    /**
     * Java 11
     */
    @Test
    public void shouldStreamStringInMultipleLines() {
        var input = "Hello\nWorld";
        var list = input.lines().toList();
        assertEquals(2, list.size());
        assertEquals("Hello", list.get(0));
        assertEquals("World", list.get(1));
    }


    /**
     * Java 11
     */
    @Test
    public void shouldRepeatString3Times() {
        var input = "hello";
        var output = input.repeat(3);
        assertEquals("hellohellohello", output);
    }


    /**
     * Java 11
     */
    @Test
    public void shouldStripAndTrimString() {
        var input = "    hello    ";
        assertEquals("hello", input.strip());
        assertEquals("hello", input.trim());
    }

    /**
     * Java 11
     * https://stackoverflow.com/questions/51266582/difference-between-string-trim-and-strip-methods-in-java-11
     */
    @Test
    public void shouldStripStringButNotTrim() {
        var input = "\u2000hello    ";
        assertEquals("hello", input.strip());
        assertEquals("\u2000hello", input.trim());
    }

    /**
     * Java 11
     */
    @Test
    public void shouldStripLeadingSpaces() {
        var input = "  hello  ";
        assertEquals("hello  ", input.stripLeading());
    }

    /**
     * Java 11
     */
    @Test
    public void shouldStripTrailingSpaces() {
        var input = "  hello  ";
        assertEquals("  hello", input.stripTrailing());
    }

    /**
     * Java 12
     */
    @Test
    public void shouldIndentString() {
        var input = "hello\nworld";
        var output = input.indent(4);
        assertNotNull(output);
        assertEquals("    hello\n    world\n", output);
    }

    /**
     * Java 12
     */
    @Test
    public void shouldTransformString() {
        var input = "hello";
        var output = input.transform(String::toUpperCase);
        assertNotNull(output);
        assertEquals("HELLO", output);
    }
}
