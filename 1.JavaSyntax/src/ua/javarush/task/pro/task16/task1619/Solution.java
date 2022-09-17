package ua.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Простий шаблон
У методі main виведи на екран змінну localDateTime у такому вигляді: 19.03.2020р. 5г.4хв

Requirements:
1. Метод main має вивести в консоль значення змінної localDateTime згідно із шаблоном.
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyр. Hг.mхв");
        System.out.println( dtf.format(localDateTime));
    }
}
