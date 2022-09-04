package ua.javarush.task.pro.task13.task1318;

/* 
Наступний місяць, будь ласка
У класі Solution реалізуй метод getNextMonth, який повинен повертати наступний місяць, а якщо
передано останній місяць — повертати перший. Скористайся методами values і ordinal.
Метод main у перевірці не використовується.


Requirements:
1. Реалізуй метод public static Month getNextMonth(Month): він має працювати згідно з умовою.
2. У методі getNextMonth слід використовувати методи ordinal() и values().
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        //напишіть тут ваш код
        if(month.ordinal()>=11) return Month.values()[0];
        return Month.values()[month.ordinal()+1];
    }
}
