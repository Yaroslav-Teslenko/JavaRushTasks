package ua.javarush.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* 
Ще один простий шаблон
У методі main виведи на екран змінну zonedDateTime у такому вигляді:
4 9.3.19 06:03:07.319180500 Europe/Kiev де:
4 — номер дня тижня, тобто четвер;
9 — день місяця;
3 — місяць;
19 — рік;
06 — години;
03 — хвилини;
07 — секунди; 3
19180500 — наносекунди;
Europe/Kiev — часовий пояс.
*/

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //напишіть тут ваш код
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        System.out.println( dtf.format(zonedDateTime));
    }
}
