package ua.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Висока точність
*/

public class Solution {
    public static void main(String[] args) {
        Scanner cons=new Scanner(System.in);
        double f1= cons.nextDouble();
        double f2= cons.nextDouble();
        if (Math.abs(f1-f2)<=0.000001)
        System.out.println("числа рівні");
       else
        System.out.println("числа не рівні");
    }
}
