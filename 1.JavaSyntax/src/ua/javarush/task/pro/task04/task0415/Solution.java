package ua.javarush.task.pro.task04.task0415;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/* 
Площа круга
*/

public class Solution {
    public static void main(String[] args) {
        //Умови задачі:
        //
        //Увести с клавіатури ціле додатне число radius. Це число будемо використовувати як радіус кола.
        //Вивести на екран площу круга, обчислену за формулою: S = pi * radius * radius.
        //Результатом має бути ціле число (тип int). Для цього потрібно перетворити результат множення на число типу
        // int (відкинути дробову частину, округливши результат до меншого цілого числа).
        //Для змінної pi використовуй значення 3.14.
        Scanner cons = new Scanner(System.in);
        int radius = cons.nextInt(), S;
        double pi =3.14;
        S=(int)(pi*radius*radius);
        System.out.println(S);
    }
}