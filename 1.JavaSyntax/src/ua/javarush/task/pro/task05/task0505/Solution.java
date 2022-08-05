package ua.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //Reverse
        //Тобі потрібно написати програму, яка:
        //
        //Зчитує з консолі ціле число N.
        //Якщо зчитане число N більше 0, то далі програма зчитує цілі числа, кількість яких дорівнює N.
        //Вивести в консоль зчитані числа: якщо N непарне — в порядку введення, якщо парне — в зворотному порядку.
        //Кожне число виводити з нового рядка. Число N виводити не потрібно.
        //
        //Requirements:
        //1. Програма має зчитувати число N і після нього ще N чисел.
        //2. У класі має бути метод public static void main(String[]).
        //3. Не можна додавати нові методи в клас Solution.
        //4. Програма має виводити введені N чисел у зворотному порядку, якщо N парне.
        //5. Програма має виводити введені N чисел у тому самому порядку, якщо N непарне.

        Scanner cons = new Scanner(System.in);
        int N = cons.nextInt();
        if (N <= 0) {
            return;
        }
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = cons.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (N % 2 == 0) {
                System.out.println(array[N-1 - i]);
            } else {
                System.out.println(array[i]);
            }
        }
//        for (int i = 0; i < N; i++) {
//            if (array[i]%2!=0){
//                System.out.println(array[i]);
//            }
//        }
//        for (int i = N-1; i >= 0; i--) {
//            if (array[i]%2==0){
//                System.out.println(array[i]);
//            }
//        }
    }
}
