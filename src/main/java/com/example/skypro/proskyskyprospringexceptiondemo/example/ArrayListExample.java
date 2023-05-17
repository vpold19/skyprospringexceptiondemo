package com.example.skypro.proskyskyprospringexceptiondemo.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //Объявление массива и листа
        Integer[] numbersArray = {1, 2, 3,};
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(69, 2, 3, 4)); //1)List<Integer> numbersList = List.of(69, 2, 3,4);2)List<Integer> numbersList = new ArrayList<>(List.of(69, 2, 3,4)) добавили new ArrayList<>(),чтобы можно применять изменения

        //Получение значения элемента
        /*numbersArray[0];*/ numbersList.get(0);
        System.out.println(numbersArray[0]); System.out.println(numbersList.get(0));

        System.out.println();

        //Запись значения элемента
        numbersArray[1] = 10;
        numbersList.set(1, 22);


        //Получения размера
        System.out.println(numbersArray.length);
        System.out.println(numbersList.size());

        System.out.println();

        //Получение строки с содержимым коллекции
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(numbersList);

        System.out.println();

        /*-----------------*/ ; numbersList.add(56);
        System.out.println(numbersList);
    }
}
