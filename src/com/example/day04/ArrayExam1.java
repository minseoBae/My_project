package com.example.day04;

public class ArrayExam1 {
    public static void main(String[] args) {
        // 선언
        int[] iarr;

        int iarr2[];

        String[] iarr3;

        // 생성
        iarr = new int[3];
        iarr2 = new int[5];
        iarr3 = new String[3];

        // 이용
        iarr[0] = 10;
        iarr[1] = 20;
        iarr3[0] = "Hello";
        iarr3[1] = "hi";

        int i = iarr[0];

        System.out.println(i);
        System.out.println(iarr[0]);
        System.out.println(iarr3[0] + ", " + iarr3[1]);


        int[] array1, array2;

        int array3[], array4;

        int[] arr2 = new int[]{10, 20, 30};
    }
}
