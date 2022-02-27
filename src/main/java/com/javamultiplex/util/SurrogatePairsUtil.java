package com.javamultiplex.util;

/**
 * @author Rohit Agarwal on 27/02/22 5:35 PM
 * @copyright www.javamultiplex.com
 */
public final class SurrogatePairsUtil {

    public static char getMinValueOfHighSurrogate(){
        return Character.MIN_HIGH_SURROGATE;
    }


    public static char getMaxValueOfHighSurrogate() {
        return Character.MAX_HIGH_SURROGATE;
    }


    public static char getMinValueOfLowSurrogate(){
        return Character.MIN_LOW_SURROGATE;
    }

    public static char getMaxValueOfLowSurrogate() {
        return Character.MAX_LOW_SURROGATE;
    }

    public static int codePointAt(String input, int index){
        return input.codePointAt(index);
    }
}
