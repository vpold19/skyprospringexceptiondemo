package com.example.skypro.proskyskyprospringexceptiondemo.example;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = numbers[10];
        System.out.println(num);
    }
}
