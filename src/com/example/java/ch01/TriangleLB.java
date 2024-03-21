package com.example.java.ch01;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형 그리기");

        System.out.println("삼각형의 단 수 입력:");
        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
