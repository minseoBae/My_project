package com.example.day02;

public class Book {
    /*
        title
        price를 필드로 선언하였습니다.
    */
        private String title;
        private int price; // field price

        //필드의 값을 수정하고 얻기 위한 메소드를 만든다 setter, getter
        //setter, getter - 프로퍼티(property) - price 프로퍼티
        //메소드
        //접근 제한자 리턴타입 메소드명(매개변수들...){ 구현 }
        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
        this.title = title;
        }

        public int getPrice() {
        return price;
        }

        public void setPrice(int price) {
        this.price = price;
        }
}
