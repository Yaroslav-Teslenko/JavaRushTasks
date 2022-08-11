package ua.javarush.task.pro.task06.task0611;

/* 
Аналіз масивів

Ця програма має виводити інформацію про створений масив. Але через неправильно розставлені модифікатори static вона не компілюється.
Виправ ці помилки. Додай модифікатор static там, де це потрібно.


Requirements:
1. Код має компілюватися.
2. Потрібно змінити мінімальну необхідну кількість модифікаторів доступу в класі Person.
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("У масиві : ");
        printArray(array);
        System.out.println("Мінімальне число : " + getMinValue(array));
        System.out.println("Максимальне число : " + getMaxValue(array));

    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
