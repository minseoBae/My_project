package com.example.day04;

public class Array11 {
    public static void main(String[] args) {
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', '!'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 3);
        for(char c : copyTo){
            System.out.println(c);
        }
    }
}