package ua.javarush.task.pro.task08.task0802;

/* 
Утилітний клас: частина 2
Утилітний клас: частина 2
Виправ методи класу Solution, використовуючи клас Math:

sqrt(double) — має повертати квадратний корінь з переданого аргументу.
cbrt(double) — має повертати кубічний корінь з переданого аргументу.
pow(int, int) — має повертати значення першого аргументу, піднесеного до степеня, що визначається другим аргументом.

Requirements:
1. Реалізуй метод sqrt(double) згідно з умовою.
2. Реалізуй метод cbrt(double) згідно з умовою.
3. Реалізуй метод pow(int, int) згідно з умовою.
*/

public class Solution {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
//        if (power == 0) {
//            return 1;
//        }
//
//        int modulus = power < 0 ? power * -1 : power;
//        int result = number;
//        for (int i = 1; i < modulus; i++) {
//            result *= number;
//        }
//        return power < 0 ? 1.0 / result : result;
        return Math.pow(number, power);
    }
}
