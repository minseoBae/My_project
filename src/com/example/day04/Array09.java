package com.example.day04;

public class Array09 {
    public static void main(String[] args) {
        int[] copyForm = {1, 2, 3};

        int[] copyTo = java.util.Arrays.copyOf(copyForm, copyForm.length);

        for(int c : copyTo) {
            System.out.println(c);
        }
        System.out.println("--------------------------------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyForm, 5);

        for(int c : copyTo2) {
            System.out.println(c);
        }
    }
}
