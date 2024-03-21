package com.example.day03;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        //객체. 입출력을 좀 더 편하게 해줌
        int i;
        i = 10;
        boolean b;
        b = true;

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int value = keyboard.nextInt();

        System.out.println(value);
    }
}
