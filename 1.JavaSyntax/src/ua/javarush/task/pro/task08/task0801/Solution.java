package ua.javarush.task.pro.task08.task0801;

import static java.lang.Math.toRadians;

/* 
Утилітний клас: частина 1


Реалізуй методи sin(double), cos(double), tan(double), які повертають відповідно
синус, косинус і тангенс кута, отриманого як параметр. Кут задано в градусах.
У цьому тобі допоможуть відповідні методи класу Math, які отримують як параметр кут, заданий в радіанах.


Requirements:
1. Реалізуй метод sin(double) згідно з умовою.
2. Реалізуй метод cos(double) згідно з умовою.
3. Реалізуй метод tan(double) згідно з умовою.
*/

public class Solution {

    public static double sin(double a) {
        //напишіть тут ваш код
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {
        //напишіть тут ваш код
        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {
        //напишіть тут ваш код
        return Math.tan(Math.toRadians(a));
    }
}
