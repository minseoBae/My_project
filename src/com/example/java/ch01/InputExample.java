package com.example.java.ch01;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 입력받기
        System.out.print("정수를 입력하세요.");
        int number = scanner.nextInt();
        // scanner.nextBoolean();
        // scanner.nextDouble();

        //입력 버퍼 비우기(줄바꿈 문자 제거
        //scanner.nextLine();

        System.out.println("문자열을 입력하세요: ");
        String text = scanner.next();

        System.out.println("입력받은 정수: "+number);
        System.out.println("입력받은 문자열: " + text);

        // Scanner 객체 닫기
        scanner.close();
    }
}

