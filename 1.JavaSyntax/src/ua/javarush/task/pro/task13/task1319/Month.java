package ua.javarush.task.pro.task13.task1319;

/* 
Місяці в порах року
Додай в enum Month 4 методи: getWinterMonths(), getSpringMonths(), getSummerMonths() і getAutumnMonths(), які повертатимуть масив із трьома місяцями.


Requirements:
1. Публічний статичний метод getWinterMonths() має повертати масив із зимовими місяцями.
2. Публічний статичний метод getSpringMonths() має повертати масив із весняними місяцями.
3. Публічний статичний метод getSummerMonths() повинен повертати масив із літніми місяцями.
4. Публічний статичний метод getAutumnMonths() повинен повертати масив з осінніми місяцями.
*/

import java.util.Collections;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишіть тут ваш код
    public static Month[] getWinterMonths()
    {
        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }
    public static Month[] getSpringMonths() {
        return new Month[]{MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMonths() {
        return new Month[]{JUNE, JULY, AUGUST};
    }

    public static Month[] getAutumnMonths() {
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }
}
