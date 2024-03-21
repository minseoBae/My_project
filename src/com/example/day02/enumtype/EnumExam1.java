package com.example.day02.enumtype;

public class EnumExam1 {
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

        public void print(){
            System.out.println("피자의 직경, 가격 : " + diameter + ", " + price);
        }
    }

    public static void main(String[] args) {
        EnumExam1.PizzaSize size = EnumExam1.PizzaSize.MEDIUM;
        System.out.println(size); // MEDIUM (직경: 12cm, 가격: ₩7000)

        System.out.println("직경: " + size.getDiameter() + "cm");
        System.out.println("가격: " + size.getPrice() + "₩");

        size.print();
    }
}
