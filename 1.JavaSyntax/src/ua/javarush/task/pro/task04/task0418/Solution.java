package ua.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Склянка наполовину порожня чи наполовину повна?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //У методі main() є змінна double glass = 0.5, яка означає наполовину повну склянку. Для песиміста вона наполовину порожня, а для оптиміста — наполовину повна.
        //Потрібно зчитати з клавіатури дані типу boolean, використовуючи метод nextBoolean() об'єкта типу Scanner.
        // Залежно від отриманих даних округлити змінну glass: до меншого цілого числа (0),
        // якщо песиміст (false) і до більшого цілого числа (1), якщо оптиміст (true).
        //Результат вивести на екран.
        //Для округлення дійсного числа до меншого цілого використай метод Math.floor(), а до більшого — метод Math.ceil().
        Scanner cons = new Scanner(System.in);
        boolean select = cons.nextBoolean();
        if (select) {
            System.out.println((int)Math.ceil(glass));
        } else {
            System.out.println((int)Math.floor(glass));;
        }
    }
}