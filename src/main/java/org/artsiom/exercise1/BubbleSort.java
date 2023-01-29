package org.artsiom.exercise1;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public List<Comparable> sort(List<Comparable> input) {
        if (input == null) {
            throw new RuntimeException("Input list is null");
        }

        List<Comparable> output = new ArrayList<>();
        input.forEach(item -> {
            if (item != null) {
                output.add(item);
            }
        });

        int n = output.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    Comparable temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }
        return output;
    }
}
