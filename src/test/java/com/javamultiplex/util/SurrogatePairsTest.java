package com.javamultiplex.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 27/02/22 5:38 PM
 * @copyright www.javamultiplex.com
 */
public class SurrogatePairsTest {

    @Test
    public void shouldGetMinValueOfHighSurrogate() {
        assertEquals('\uD800', Character.MIN_HIGH_SURROGATE);
    }

    @Test
    public void shouldGetMaxValueOfHighSurrogate() {
        assertEquals('\uDBFF', Character.MAX_HIGH_SURROGATE);
    }

    @Test
    public void shouldGetMinValueOfLowSurrogate() {
        assertEquals('\uDC00', Character.MIN_LOW_SURROGATE);
    }

    @Test
    public void shouldGetMaxValueOfLowSurrogate() {
        assertEquals('\uDFFF', Character.MAX_LOW_SURROGATE);
    }

    @Test
    public void shouldGetCodePointsAtIndex0(){
        var input1="\uD800\uDBFF";
        assertEquals(55296, input1.codePointAt(0));
        var input2="\uDC00\uDFFF";
        assertEquals(56320, input2.codePointAt(0));
    }

    @Test
    public void shouldGetCodePointAtsIndex1(){
        var input1="\uD800\uDBFF";
        assertEquals(56319, input1.codePointAt(1));
        var input2="\uDC00\uDFFF";
        assertEquals(57343, input2.codePointAt(1));
    }

    @Test
    public void shouldGetCodePointOfSurrogatePairs(){
        var input1="\uD800\uDC00";
        assertEquals(65536, input1.codePointAt(0));
        var input2="\uD800\uDC01 ";
        assertEquals(65537, input2.codePointAt(0));

    }

}
