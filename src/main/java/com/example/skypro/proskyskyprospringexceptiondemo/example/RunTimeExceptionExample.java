package com.example.skypro.proskyskyprospringexceptiondemo.example;

public class RunTimeExceptionExample {
    public static void main(String[] args) {
        int number = 3;
        if (number != 2) {
            throw new RuntimeException("Число не 2");
        } else {
            System.out.println("Все верно, число 2");
        }
    }
}
