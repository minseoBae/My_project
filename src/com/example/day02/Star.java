package com.example.day02;

public class Star {
    public static void main(String[] args) {
        /* for (int i = 0; i < 8; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } */
        int i = 0;
        int j = 0;
        while(i <= 5){
            while(j < i) {
                System.out.print("*");
                j = j + 1;
            }
            System.out.println();
            j = 0;
            i = i + 1;
        }
        int num = 1;
        while(num <= 100) {
            System.out.println(num);
            num += 1;
        }

    }
}
