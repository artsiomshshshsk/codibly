package org.artsiom.exercise2;

import java.util.*;

public class BalancedWordsCounter {
public int count(String input) throws IllegalArgumentException {
    if (input == null) {
        throw new RuntimeException("Input cannot be null");
    }
    if (input.isEmpty()) {
        return 0;
    }
    if (!input.matches("[a-zA-Z]+")) {
        throw new RuntimeException("Input can only contain letters");
    }

    int count = 0;
    for (int i = 0; i < input.length(); i++) {
        for (int j = i + 1; j <= input.length(); j++) {
            String subword = input.substring(i, j);
            if (isBalanced(subword)) {
                count++;
            }
        }
    }
    return count;
}

    private boolean isBalanced(String word) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : word.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        return count.values().stream().distinct().count() <= 1;
    }
}