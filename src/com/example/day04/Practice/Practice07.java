package com.example.day04.Practice;

public class Practice07 {
    //int 타입의 배열 numbers가 주어졌을 때, 배열의 요소를 역순으로 출력하는 코드를 작성하세요.
    //int[] numbers = {3, 6, 9, 12, 15};

    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12, 15};

        for(int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
