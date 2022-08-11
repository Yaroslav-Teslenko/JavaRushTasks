package ua.javarush.task.pro.task07.task0709;

/* 
Дуже правильні типи
Розстав оператори приведення типів у виразах так, щоб код компілювався.
Змінювати типи змінних a, b, c і d не можна.


Requirements:
1. Типи змінних a, b, c і d не повинні змінитися.
2. Під час присвоєння значення виразу має виконуватися приведення типу.
*/

public class Solution {
    long a = 109 + 15;
    int b = (int) a * 2;
    short c = (short) (a / b);
    byte d = (byte )(a + b - c);
}
