package ua.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Усі люблять Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любить мене.";
        //напишіть тут ваш код

        String name = (new Scanner(System.in)).nextLine();
        int i=0;
        while (i<10) {
            System.out.println(name + text);
            i++;
        };
    }
}
