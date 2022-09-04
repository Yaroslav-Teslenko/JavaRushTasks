package ua.javarush.task.pro.task12.task1211;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Сортування бульбашкою
Перед тобою програма, що сортує елементи списку за зростанням методом "бульбашки".
Перепиши код так, щоб замість списку ArrayList<Integer> numbers використовувався масив int[] numbers.
Методи main() і print() у перевірці не використовуються.


Requirements:
1. Тип поля numbers має бути int[].
2. Поле numbers має ініціалізуватися десятьма числами під час створення.
3. Метод sort() має сортувати елементи масиву int[] numbers за зростанням.
*/

public class Solution {

   // public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));
   public static int[] numbers = new int[]{56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nВідсортовані числа в порядку зростання:");
        print();
    }

    public static void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j]=numbers[j + 1];
                    numbers[j + 1]= temp;
                }
            }
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
