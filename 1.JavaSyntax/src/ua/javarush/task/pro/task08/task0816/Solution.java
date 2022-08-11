package ua.javarush.task.pro.task08.task0816;

/* 
Пріоритети
1. У методі main() розстав одну пару дужок так, щоб у консоль було виведено число 12. Решту коду не змінюй.
2. Метод main() має виводити число 12.
*/

public class Solution {

    public static void main(String[] args) {
        int number = 2;
        System.out.println(number + number * (number + ++number));
    }

}
