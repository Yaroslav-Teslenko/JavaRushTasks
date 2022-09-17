package ua.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День тижня твого народження
Проініціалізуй змінну birthDate об'єктом GregorianCalendar з датою свого народження.
Реалізуй метод getDayOfWeek(Calendar calendar) так, щоб він повертав українську назву дня тижня з аргументу calendar.
 Пам'ятай, що у григоріанському календарі тиждень починається з неділі.

Requirements:
1. Змінну birthDate слід проініціалізувати під час оголошення.
2. Метод getDayOfWeek(Calendar calendar) має повертати день тижня з аргументу calendar.
*/

public class Solution {

    static Calendar birthDate=new GregorianCalendar(1981, Calendar.DECEMBER, 22);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String result = "";
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                return "неділя";
            case 2:
                return "понеділок";
            case 3:
                return "вівторок";
            case 4:
                return "середа";
            case 5:
                return "четвер";
            case 6:
                return "п'ятниця";
            case 7:
                return "субота";
        }
        return result;

    }
}
