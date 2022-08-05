package ua.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заповнюємо масив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //нЗаповнюємо масив
        //Реалізуй статичний метод main(String[]), який заповнює масив array значеннями valueStart і valueEnd.
        //Якщо значення довжини масиву парне, то першу половину масиву слід заповнити значеннями valueStart, а другу — valueEnd.
        // Якщо значення довжини масиву непарне, то більшу частину заповнити значеннями valueStart, меншу — valueEnd.
        // Для заповнення масиву використовуй метод Arrays.fill(int[], int, int, int).
        //Значення полів класу Solution під час тестування будуть різними, зваж на це.
       int middle=array.length/2;
        if (array.length%2!=0){
            middle++;
       }
        Arrays.fill(array, 0,middle, valueStart);
        Arrays.fill(array, middle, array.length , valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
