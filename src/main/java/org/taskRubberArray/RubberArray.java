package org.taskRubberArray;

import java.util.Arrays;

public class RubberArray {
    private int size;
    private int[] array;

    public RubberArray() {
        this.size = 0;
        this.array = new int[this.size];
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        return "[" + result.trim() + "]";
    }
}
