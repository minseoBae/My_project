package com.example.day02.enumtype;

public class TodayTest {
    public static void main(String[] args) {
        Today today = new Today();
        today.setDay(Day.FRIDAY);

        System.out.println(today.getDay());
    }
}
