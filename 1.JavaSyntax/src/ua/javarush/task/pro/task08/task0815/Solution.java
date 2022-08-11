package ua.javarush.task.pro.task08.task0815;

/* 
Логічні оператори
Виправ метод taskForCondition() так, щоб він виводив у консоль число 30. Змінювати можна лише логічні оператори: && на & і || на |.


Requirements:
1. Метод taskForCondition() має виводити число 30.
2. У методі taskForCondition() не змінюй нічого, крім логічних операторів.
*/

public class Solution {

    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean conditionFirst = number < 15 & number > 25 & (number += 15) < 25;
        boolean conditionSecond = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
