package ua.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Ділимо масив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //Ділимо масив
        //Реалізуй метод main(String[]), який ділить масив array на два підмасиви та заповнює ними двовимірний
        // масив result. Якщо довжина масиву непарна, то більшу частину потрібно скопіювати в перший підмасив.
        //Якщо довжина масиву парна, його потрібно поділити навпіл.
        //Для розділення масиву використовуй метод Arrays.copyOfRange(int[], int, int). Порядок елементів не змінюй.
        //Значення полів класу Solution під час тестування будуть різними, зваж на це.
        int middle = array.length / 2;
        if (array.length % 2 != 0) {
            middle++;
        }
        result[0]=Arrays.copyOfRange(array, 0, middle);
        result[1]=Arrays.copyOfRange(array, middle, array.length);
        System.out.println(Arrays.deepToString(result));
    }
}
