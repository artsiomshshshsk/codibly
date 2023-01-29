package org.artsiom.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedWordsCounterTest {

    BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
    @Test
    public void testCount_GivenInput_ShouldReturn28() {
        String input = "aabbabcccba";
        int expected = 28;
        int actual = balancedWordsCounter.count(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCount_GivenInputEmptyString_ShouldReturn0() {
        String input = "";
        int expected = 0;
        int actual = balancedWordsCounter.count(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCount_GivenInputContainsNumbers_ShouldThrowException() {
        assertThrows(RuntimeException.class, () -> balancedWordsCounter.count("abababa1"));
    }

    @Test
    public void testCount_GivenInputIsNull_ShouldThrowException() {
        assertThrows(RuntimeException.class, () -> balancedWordsCounter.count(null));
    }
}