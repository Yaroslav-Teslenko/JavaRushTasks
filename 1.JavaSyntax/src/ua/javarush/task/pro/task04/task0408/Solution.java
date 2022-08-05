package ua.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        //напишіть тут ваш код
        Scanner cons = new Scanner(System.in);
        int max= Integer.MIN_VALUE;
        //cons.nextInt();

        while (cons.hasNextInt()){
            int inp = cons.nextInt();
            if (inp%2==0 && inp>max){max=inp;}
        }
        System.out.println(max);

    }
}