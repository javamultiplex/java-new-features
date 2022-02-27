package com.javamultiplex.util;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        final String input = "\uD800\uDC00";
        final IntStream intStream = input.chars();
        intStream.forEach(System.out::println);
    }

    /**
     * Java 9
     */
    @Test
    public void shouldStreamToCodePoints() {
        final String input = "\uD800\uDC00";
        final IntStream intStream = input.codePoints();
        intStream.forEach(System.out::println);
    }

    /**
     * Java 11
     */
    @Test
    public void shouldValidateBlankString(){
        String input=" ";
        assertTrue(input.isBlank());
        assertFalse(input.isEmpty());
    }

    /**
     * Java 11
     */
    @Test
    public void shouldStreamStringInMultipleLines(){
        String input="Hello\nWorld";
        final List<String> list = input.lines().toList();
        assertEquals(2,list.size());
        assertEquals("Hello",list.get(0));
        assertEquals("World",list.get(1));
    }


    /**
     * Java 11
     */
    @Test
    public void shouldRepeatString3Times(){
        String input="hello";
        final String output = input.repeat(3);
        assertEquals("hellohellohello",output);
    }


    /**
     * Java 11
     */
    @Test
    public void shouldStripAndTrimString(){
        String input="    hello    ";
        assertEquals("hello",input.strip());
        assertEquals("hello",input.trim());
    }

    /**
     * Java 11
     * https://stackoverflow.com/questions/51266582/difference-between-string-trim-and-strip-methods-in-java-11
     */
    @Test
    public void shouldStripStringButNotTrim(){
        String input="\u2000hello    ";
        assertEquals("hello",input.strip());
        assertEquals("\u2000hello",input.trim());
    }

    /**
     * Java 11
     */
    @Test
    public void shouldStripLeadingSpaces(){
        String input="  hello  ";
        assertEquals("hello  ",input.stripLeading());
    }

    /**
     * Java 11
     */
    @Test
    public void shouldStripTrailingSpaces(){
        String input="  hello  ";
        assertEquals("  hello",input.stripTrailing());
    }

    /**
     * Java 12
     */
    @Test
    public void shouldIndentString() {
        String input = "hello\nworld";
        final String output = input.indent(4);
        assertNotNull(output);
        assertEquals("    hello\n    world\n", output);
    }

    /**
     * Java 12
     */
    @Test
    public void shouldTransformString() {
        String input = "hello";
        final Object output = input.transform(String::toUpperCase);
        assertNotNull(output);
        assertEquals("HELLO", output);
    }
}
