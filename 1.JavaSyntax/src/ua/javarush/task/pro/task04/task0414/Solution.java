package ua.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошого забагато не буває
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner cons = new Scanner(System.in);
        String str=cons.nextLine();
        int number = cons.nextInt();
        int i = number;
        do {
            System.out.println(str);
            if (number > 0 && number < 5) {
                i--;
            } else break;
        } while (i > 0);
    }
}