package ua.javarush.task.pro.task16.task1615;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/* 
Ой, як багато методів!
У класі Solution реалізуй шість методів:
- у методі plusMinutes потрібно збільшити параметр instant на minutes хвилин і повернути результат;
- у методі plusHours потрібно збільшити параметр instant на hours годин і повернути результат;
- у методі plusDays потрібно збільшити параметр instant на days днів і повернути результат;
- у методі minusMinutes потрібно зменшити параметр instant на minutes хвилин і повернути результат;
- у методі minusHours потрібно зменшити параметр instant на hours годин і повернути результат;
- у методі minusDays потрібно зменшити параметр instant на days днів і повернути результат.

Requirements:
1. Метод plusMinutes потрібно реалізувати згідно з умовою.
2. Метод plusHours потрібно реалізувати згідно з умовою.
3. Метод plusDays потрібно реалізувати згідно з умовою.
4. Метод minusMinutes потрібно реалізувати згідно з умовою.
5. Метод minusHours потрібно реалізувати згідно з умовою.
6. Метод minusDays потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        //напишіть тут ваш код
        return instant.plusSeconds(minutes*60);
    }

    static public Instant plusHours(Instant instant, long hours) {
        //напишіть тут ваш код

        return instant.plusSeconds(hours*60*60);
    }

    static public Instant plusDays(Instant instant, long days) {
        //напишіть тут ваш код

        return instant.plusSeconds(days*24*60*60);
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        //напишіть тут ваш код

        return instant.minusSeconds(minutes*60);
    }

    static public Instant minusHours(Instant instant, long hours) {
        //напишіть тут ваш код

        return instant.minusSeconds(hours*60*60);
    }

    static public Instant minusDays(Instant instant, long days) {
        //напишіть тут ваш код

        return instant.minusSeconds(days*24*60*60);
    }
}
