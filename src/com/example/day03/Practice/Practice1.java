package com.example.day03.Practice;

import java.util.Scanner;

public class Practice1 {
    //실습 문제  1: 온도 변환기
    //사용자로부터 섭씨 온도를 입력받아 화씨 온도로 변환하는 프로그램을 작성하세요. 변환 공식은 F = C * 9/5 + 32 입니다. 변환된 화씨 온도를 출력하세요.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("온도를 입력하세요");
        double d = s.nextDouble();
        double f = d * 9/5 + 32;
        System.out.printf("해당 온도의 화씨 온도는 " + f + "입니다.");
    }
}
