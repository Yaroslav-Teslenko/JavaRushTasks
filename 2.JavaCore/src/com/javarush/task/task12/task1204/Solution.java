package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампаНапиши метод, который определяет, объект какого класса ему передали,
и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        if (o instanceof Cat) System.out.println("Кошка");
        if (o instanceof Dog) System.out.println("Собака");
        if (o instanceof Bird) System.out.println("Птица");
        if (o instanceof Lamp) System.out.println("Лампа");

//        switch (cl) {
//            case "Cat":
//                System.out.println("Кошка");
//                break;
//            case "Dog" :
//                System.out.println("Собака");
//                break;
//            case "Bird" :
//                System.out.println("Птица");
//                break;
//            case "Lamp" :
//                System.out.println("Лампа");
//                break;
//        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
