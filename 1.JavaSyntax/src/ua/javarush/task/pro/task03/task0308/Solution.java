package ua.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатні чверті
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner  cons= new Scanner(System.in);
        int x = cons.nextInt();
        int y = cons.nextInt();
        if (x>0 && y>0){
            System.out.println(1);
        }
        if (x<0 && y>0){
            System.out.println(2);
        }
        if (x<0 && y<0){
            System.out.println(3);
        }
        if (x>0 && y<0){
            System.out.println(4);
        }
        /*
        * для першої чверті x>0 і y>0;
для другої чверті x<0 і y>0;
для третьої чверті x<0 і y<0;
для четвертої чверті x>0 і y<0.*/
    }
}
