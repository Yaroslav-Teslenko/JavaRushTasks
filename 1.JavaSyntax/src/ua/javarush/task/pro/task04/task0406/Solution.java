package ua.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показуємо, що отримуємо
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner cons = new Scanner(System.in);

        while (true){
            String f1 =cons.nextLine();
            if (f1.equals("enough")) break;
            System.out.println(f1);

        }

    }
}