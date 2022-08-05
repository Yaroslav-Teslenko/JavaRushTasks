package ua.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Порівняймо рядки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner cons=new Scanner(System.in);
        String f1=cons.nextLine();
        String f2=cons.nextLine();
        //напишіть тут ваш код
        if (f1.equals(f2))
        System.out.println("рядки однакові");
     else
        System.out.println("рядки різні");
    }
}
