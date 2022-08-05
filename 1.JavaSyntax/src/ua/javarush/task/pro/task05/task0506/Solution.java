package ua.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Мінімальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //Щоб виконати цю задачу, тобі потрібно:
        //
        //Ввести з клавіатури число N.
        //Зчитати N цілих чисел і заповнити ними масив.
        //Знайти й вивести в консоль мінімальне число серед елементів масиву.
        //
        //Requirements:
        //1. У методі main(String[]) зчитай з клавіатури число N, потім проініціалізуй масив array розміром N елементів і заповни його числами, уведеними з клавіатури.
        //2. У методі main(String[]) виведи в консоль мінімальне число серед елементів масиву.

        Scanner cons = new Scanner(System.in);
        int N = cons.nextInt();
        array = new int[N];
        int min = array[0]=cons.nextInt();
        for (int i = 1; i < N; i++) {
            array[i] = cons.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }

//        int[] array = new int[N];
//        for (int i = 0; i < N; i++) {
//            array[i] = cons.nextInt();
//        }
//        int min = array[0];
//        for (int i = 1; i <  array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
        System.out.println(min);
    }
}
