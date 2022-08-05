package ua.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner cons = new Scanner(System.in);
        int N = cons.nextInt();
        array = new int[N];
        int min = array[0]=cons.nextInt();
        for (int i = 1; i < N; i++) {
            array[i] = cons.nextInt();
            if (array[i] > min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
