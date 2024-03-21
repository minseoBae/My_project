package com.example.java.ch01;

import java.util.Scanner;

public class Median {
    static int center(int a, int b, int c) {
        if(a >= b)
            if(b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if(a > c)
            return a;
        else if(b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println(center(1, 3, 2));
    }
}
