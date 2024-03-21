package com.example.day02;

public class OpExam3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = a > b ? a : b;

        System.out.println(result);
        Book book = new Book();
        if(book instanceof Object) {
            System.out.println("Book은 객체 입니다. ");
        }
    }


}
