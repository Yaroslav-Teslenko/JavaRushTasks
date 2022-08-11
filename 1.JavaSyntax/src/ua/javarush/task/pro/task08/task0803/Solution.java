package ua.javarush.task.pro.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

/* 
Мінімальний елемент масиву
У цій задачі тобі потрібно:

Зчитати 10 чисел з консолі й заповнити ними масив за допомогою методу getArrayOfTenElements().
Знайти мінімальний елемент масиву та повернути цей елемент за допомогою методу min(int[]).
У методі min(int[]) обов'язково використай метод Math.min(int, int).

Requirements:
1. Програма має зчитувати числа з клавіатури.
2. Клас Solution має містити тільки три методи.
3. Метод getArrayOfTenElements() має зчитати з клавіатури 10 чисел і повернути масив розміром
10 елементів, заповнений отриманими числами.
4. Метод min(int[]) має повернути мінімальний елемент масиву за допомогою методу min(int, int) класу Math.
5. Метод main() має викликати метод getArrayOfTenElements().
6. Метод main() має викликати метод min(int[]).
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишіть тут ваш код
        int min=ints[0];
        for (int i = 1; i <10 ; i++) {
            min=Math.min(min,ints[i]);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишіть тут ваш код

        Scanner cons=new Scanner(System.in);
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]= cons.nextInt();
        }
        return arr;
    }
}
