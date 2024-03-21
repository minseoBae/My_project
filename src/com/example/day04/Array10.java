package com.example.day04;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 6};

        int compare = Arrays.compare(array1, array2); // 같으면 0 아니면 -1

        System.out.println(compare);
    }
}
