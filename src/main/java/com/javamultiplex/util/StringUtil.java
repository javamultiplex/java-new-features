package com.javamultiplex.util;

import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * @author Rohit Agarwal on 27/02/22 5:18 PM
 * @copyright www.javamultiplex.com
 */
public final class StringUtil {


    public static IntStream streamToCharsInJava9(String input) {
        return input.chars();
    }

    public static IntStream streamToCodePointsInJava9(String input){
        return input.codePoints();
    }

    public static String indentInJava12(String input, int size) {
        return input.indent(size);
    }

    public static Object transformInJava12(String input, Function<String, Object> function) {
        return input.transform(function);
    }

}
