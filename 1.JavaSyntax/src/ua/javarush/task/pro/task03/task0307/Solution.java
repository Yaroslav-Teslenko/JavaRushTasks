package ua.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Працювати чи не працювати — отаке питання
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner  cons= new Scanner(System.in);
        int age = cons.nextInt();
        if (age<20 || age>60)
        System.out.println("можна не працювати");
    }
}
