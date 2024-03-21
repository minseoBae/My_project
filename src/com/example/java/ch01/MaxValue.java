package com.example.java.ch01;

public class MaxValue {
    //메소드
    //접근제한자 리턴타입 메소드명 ( 매개변수들... ) { 구현 }
    public static int max(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    //main
    public static void main(String[] args) {
        MaxValue maxValue = new MaxValue();
        maxValue.max(1, 3, 4);
        System.out.println(MaxValue.max(7,89,6));

        //학생 5명의 점수를 입력 받습니다.
        //5명의 점수를 출력해라.
        //5명의 점수에 +30 해서 출력해라

    }
}
