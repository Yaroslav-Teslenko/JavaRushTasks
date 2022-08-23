package ua.javarush.task.pro.task11.task1121;

import java.util.Arrays;

/* 
Забута ініціалізація
У програмі масив заповнюється числами від 0 до 9, і його вміст виводиться на екран. Однак через помилку програма не компілюється.
Зроби так, щоб програма компілювалася й правильно працювала.
*/

public class Solution {
    public static void main(String[] args) {
        int[] array=new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
