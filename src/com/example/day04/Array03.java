package com.example.day04;

public class Array03 {
    public static void main(String[] args) {
        ItemForArray[] array1 = new ItemForArray[5];
        // ItemForArray array2[];
        // array2 = new ItemForArray[5];

        array1[0] = new ItemForArray(500, "사과");
        array1[1] = new ItemForArray(300, "바나나");
        array1[2] = new ItemForArray(900, "수박");
        array1[3] = new ItemForArray(200, "복숭아");
        array1[4] = new ItemForArray(400, "키위");


        ItemForArray[] array2 = new ItemForArray[]{new ItemForArray(500, "사과")};
        ItemForArray[] array3 = {new ItemForArray(500, "사과"), new ItemForArray(300, "바나나")};

        for(int i = 0; i < array1.length; i++) {
            System.out.println("1번 " + array1[i].getName() + "는 "+ array1[i].getPrice() + "원");
        }
        for(int j = 0; j < array2.length; j++) {
            System.out.println("2번 " + array2[j].getName() + "는 "+ array2[j].getPrice() + "원");
        }
        for(int k = 0; k < array3.length; k++) {
            System.out.println("3번 " + array3[k].getName() + "는 "+ array3[k].getPrice() + "원");
        }
    }
}
