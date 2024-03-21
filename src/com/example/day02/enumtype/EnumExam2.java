package com.example.day02.enumtype;

import java.util.EnumMap;

public class EnumExam2 {

    public enum PizzaSize {
        SMALL(10, 5000),
        MEDIUM(12, 7000),
        LARGE(14, 9000);

        private final int diameter;
        private final int price;

        private PizzaSize(int diameter, int price) {
            this.diameter = diameter;
            this.price = price;
        }

        public int getDiameter() {
            return diameter;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return String.format("%s (직경: %dcm, 가격: ₩%d)", name(), diameter, price);
        }
    }

    public static void main(String[] args) {
        // 피자 주문 정보를 저장할 EnumMap 생성 (키: 피자 종류, 값: 주문 개수)
        EnumMap<PizzaSize, Integer> orderMap = new EnumMap<>(PizzaSize.class);

        // 피자 주문 (MEDIUM 피자 2개, LARGE 피자 1개)
        orderMap.put(PizzaSize.MEDIUM, 2);
        orderMap.put(PizzaSize.LARGE, 1);

        // 주문 정보 출력
        System.out.println("피자 주문내역:");
        for (PizzaSize size : orderMap.keySet()) {
            System.out.printf("%s 피자: %d개\n", size, orderMap.get(size));
        }

        // 총 주문 금액 계산
        int totalPrice = 0;
        for (PizzaSize size : orderMap.keySet()) {
            totalPrice += orderMap.get(size) * size.getPrice();
        }
        System.out.println("총 주문 금액: " + totalPrice + "₩");
    }
}