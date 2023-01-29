package org.artsiom.exercise1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSort_Input1_ExpectSorted() {
        List<Comparable> input = new ArrayList<>(List.of(1, 4, 5, 6, 8, 3, 8));
        List<Comparable> expected = new ArrayList<>(List.of(1, 3, 4, 5, 6, 8, 8));

        List<Comparable> result = bubbleSort.sort(input);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void testSort_Input2_ExpectSorted() {
        List<Comparable> input = new ArrayList<>(List.of(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0));
        List<Comparable> expected = new ArrayList<>(List.of(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0));

        List<Comparable> result = bubbleSort.sort(input);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void testSort_InputEmpty_ExpectEmpty() {
        List<Comparable> input = new ArrayList<>();
        List<Comparable> expected = new ArrayList<>();

        List<Comparable> result = bubbleSort.sort(input);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void testSort_InputWithNull_ExpectWithoutNull() {
        List<Double> doubles = new ArrayList<>();
        doubles.add(null);
        doubles.add(5.0001);
        List<Comparable> input = new ArrayList<>(doubles);
        List<Comparable> expected = new ArrayList<>(List.of(5.0001));

        List<Comparable> result = bubbleSort.sort(input);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void testSort_InputNull_ExpectException() {
        assertThrows(RuntimeException.class, () -> bubbleSort.sort(null));
    }


}