package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Підсумовування
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner cons = new Scanner(System.in);
        int sum=0;

        while (true){
            String f1 =cons.nextLine();
            if (f1.equals("ENTER")) break;

            sum=sum+Integer.parseInt(f1);
        }
        System.out.println(sum);
    }
}