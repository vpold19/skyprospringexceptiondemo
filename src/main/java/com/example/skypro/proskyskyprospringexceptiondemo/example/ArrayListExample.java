package com.example.skypro.proskyskyprospringexceptiondemo.example;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        //Объявление массива и листа
        Integer[] numbersArray = {1, 2, 3,};
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(69, 2, 3, 4)); //1)List<Integer> numbersList = List.of(69, 2, 3,4);2)List<Integer> numbersList = new ArrayList<>(List.of(69, 2, 3,4)) добавили new ArrayList<>(),чтобы можно применять изменения
        Map<String,Integer> numbersMap = new HashMap<>(Map.of("four",4,"five",5));
        Map<String,Integer> numbers1Map = Map.of("eleven", 11,"twelve",12);
        numbersMap.put("two", 2);
        Set<Integer> numbersSet = new HashSet<>(List.of(1,2,40,12));

        //Получение значения элемента
        /*numbersArray[0];*/ numbersList.get(0); numbersMap.get("two"); /*----------*/
        //System.out.println(numbersArray[0]); System.out.println(numbersList.get(0));

        System.out.println();

        //Запись значения элемента
        numbersArray[1] = 10;
        numbersList.set(1, 22);
        numbersMap.put("one", 1);
        /*----------*/


        //Получения размера
        System.out.println(numbersArray.length);
        System.out.println(numbersList.size());
        System.out.println(numbersMap.size());
        System.out.println(numbersSet.size());

        System.out.println();

        //Получение строки с содержимым коллекции
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(numbersList);//numbersList.toString();
        System.out.println(numbersMap); //numbersMap.toString();
        System.out.println(numbersSet); //numbersSet.toString();

        System.out.println();

        /*Добавление*/
        /*-----------------*/ ; numbersList.add(56);numbersMap.put("three", 3); numbersSet.add(256);

        /*Проверить, есть ли элемент в коллекции*/
        /*----------*/; numbersList.contains(12); numbersMap.containsValue(123); numbersSet.contains(24);

        System.out.println(numbersList);


        System.out.println(numbersMap);


        System.out.println(numbersSet);
    }
}
