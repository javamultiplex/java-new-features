package com.javamultiplex.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 27/02/22 5:38 PM
 * @copyright www.javamultiplex.com
 */
public class SurrogatePairsUtilTest {

    @Test
    public void shouldGetMinValueOfHighSurrogate() {
        assertEquals('\uD800', SurrogatePairsUtil.getMinValueOfHighSurrogate());
    }

    @Test
    public void shouldGetMaxValueOfHighSurrogate() {
        assertEquals('\uDBFF', SurrogatePairsUtil.getMaxValueOfHighSurrogate());
    }

    @Test
    public void shouldGetMinValueOfLowSurrogate() {
        assertEquals('\uDC00', SurrogatePairsUtil.getMinValueOfLowSurrogate());
    }

    @Test
    public void shouldGetMaxValueOfLowSurrogate() {
        assertEquals('\uDFFF', SurrogatePairsUtil.getMaxValueOfLowSurrogate());
    }

    @Test
    public void shouldGetCodePointsAtIndex0(){
        String input1="\uD800\uDBFF";
        assertEquals(55296, SurrogatePairsUtil.codePointAt(input1,0));
        String input2="\uDC00\uDFFF";
        assertEquals(56320, SurrogatePairsUtil.codePointAt(input2,0));
    }

    @Test
    public void shouldGetCodePointAtsIndex1(){
        String input1="\uD800\uDBFF";
        assertEquals(56319, SurrogatePairsUtil.codePointAt(input1,1));
        String input2="\uDC00\uDFFF";
        assertEquals(57343, SurrogatePairsUtil.codePointAt(input2,1));
    }

    @Test
    public void shouldGetCodePointOfSurrogatePairs(){
        String input1="\uD800\uDC00";
        assertEquals(65536, SurrogatePairsUtil.codePointAt(input1,0));
        String input2="\uD800\uDC01 ";
        assertEquals(65537, SurrogatePairsUtil.codePointAt(input2,0));

    }

}
