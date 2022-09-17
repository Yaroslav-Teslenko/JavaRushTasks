package ua.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Аби не в понеділок:)
Проініціалізуй змінну birthDate об'єктом Date із датою свого народження.
Реалізуй метод getDayOfWeek(Date date) так, щоб він повертав українську назву дня тижня з аргументу date.

Requirements:
1. Змінну birthDate слід проініціалізувати під час оголошення.
2. Метод getDayOfWeek(Date date) має повертати українську назву дня тижня.
*/

public class Solution {

    static Date birthDate=new Date(1981-1900,Calendar.DECEMBER,22);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        String result = "";
        int day = date.getDay();
        switch (day) {
            case 0:
                return "неділя";
            case 1:
                return "понеділок";
            case 2:
                return "вівторок";
            case 3:
                return "середа";
            case 4:
                return "четвер";
            case 5:
                return "п'ятниця";
            case 6:
                return "субота";
        }
        return result;
    }
}
