package com.example.day03;

public class WhileExam1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while(true) {
            if(num == 101)
                break;
            if(num % 2 == 0) {
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
    }
}
