package ua.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Мінімум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner cons = new Scanner(System.in);
        int min= Integer.MAX_VALUE;
        //cons.nextInt();

        while (cons.hasNextInt()){
            int inp = cons.nextInt();
            if (inp<min){min=inp;}
        }
        System.out.println(min);
    }
}