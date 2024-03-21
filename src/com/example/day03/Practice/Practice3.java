package com.example.day03.Practice;

public class Practice3 {
    // 실습 문제 3: 구구단 출력기
    // while 루프를 사용하여 2단부터 9단까지의 구구단을 출력하는 프로그램을 작성하세요. 각 단은 한 줄에 하나씩 출력되어야 합니다.
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            System.out.print(i + "단 : ");
            for(int j = 1; j < 10; j++) {
                System.out.print(i + " * " + j + " = " + i*j + "  ");
            }
            System.out.println();
        }
    }
}
