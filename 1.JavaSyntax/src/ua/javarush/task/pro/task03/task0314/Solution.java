package ua.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Поламана клавіатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner cons=new Scanner(System.in);
        String f1=cons.nextLine();
        if (secret.equalsIgnoreCase(f1))
        System.out.println("доступ дозволено");
       else
        System.out.println("доступ заборонено");
    }
}
