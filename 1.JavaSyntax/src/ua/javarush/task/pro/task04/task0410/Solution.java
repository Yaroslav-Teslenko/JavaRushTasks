package ua.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Друге мінімальне число серед уведених
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        //напишіть тут ваш код
        Scanner console = new Scanner(System.in);
        int min = console.nextInt();
        int secondMin = console.nextInt();
        if (secondMin < min) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) {
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }
}