package ua.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //Уведено число 5.
        //Уведено числа 1, 7, 5, 9, 3.
        //Отримуємо такий масив:
        Scanner cons=new Scanner(System.in);
        int row= cons.nextInt();
        multiArray=new int[row][];
        for (int i = 0; i < row; i++) {
            int col=cons.nextInt();
            multiArray[i]=new int[col] ;
        }
      //  System.out.println("ok");

//        for (int[] ints : multiArray) {
//
//        }

    }
}
