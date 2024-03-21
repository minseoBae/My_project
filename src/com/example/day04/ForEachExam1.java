package com.example.day04;

public class ForEachExam1 {
    public static void main(String[] args) {
        int[] iarr = {10, 20, 30, 40};

        // for each 문

        for(int i: iarr) {
            System.out.println(i);
        }

        for(int i = 0; i < iarr.length; i++) {
            int v = iarr[i];
            System.out.println(v);
        }

        ItemForArray[] items = new  ItemForArray[4];
        items[0] = new ItemForArray(3000,"cup");
        for(ItemForArray item: items) {
            if(item != null) {
                System.out.println(item.getName());
            } else System.out.println("더 이상 아이템이 없습니다.");

        }
    }
}
