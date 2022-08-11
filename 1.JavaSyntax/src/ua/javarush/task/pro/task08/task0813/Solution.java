package ua.javarush.task.pro.task08.task0813;

/* 
Степінь двійки
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        if (power > 0) {
            return 2 << (power - 1);
        } else {
            return 2 >> -(power - 1);
        }
    }
}
