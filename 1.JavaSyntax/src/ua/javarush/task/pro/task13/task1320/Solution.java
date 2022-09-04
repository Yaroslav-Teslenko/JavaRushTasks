package ua.javarush.task.pro.task13.task1320;


//З if на switch
//У класі Solution є метод getMonthByIndex(int), який повертає назву місяця за його номером починаючи з 1. Твоє завдання — переписати метод, використовуючи тільки оператор switch і ключові слова case, break.
//
//
//Requirements:
//1. Метод getMonthByIndex(int) має повертати назву місяця за його номером.
//2. У методі getMonthByIndex(int) має використовуватися тільки оператор множинного вибору switch.
public class Solution {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString = switch (monthIndex) {
            case 1 -> "Січень";
            case 2 -> "Лютий";
            case 3 -> "Березень";
            case 4 -> "Квітень";
            case 5 -> "Травень";
            case 6 -> "Червень";
            case 7 -> "Липень";
            case 8 -> "Серпень";
            case 9 -> "Вересень";
            case 10 -> "Жовтень";
            case 11 -> "Листопад";
            case 12 -> "Грудень";
            default -> "Неприпустимий місяць";
        };
//        if (monthIndex == 1) {
//            monthString = "Січень";
//        } else if (monthIndex == 2) {
//            monthString = "Лютий";
//        } else if (monthIndex == 3) {
//            monthString = "Березень";
//        } else if (monthIndex == 4) {
//            monthString = "Квітень";
//        } else if (monthIndex == 5) {
//            monthString = "Травень";
//        } else if (monthIndex == 6) {
//            monthString = "Червень";
//        } else if (monthIndex == 7) {
//            monthString = "Липень";
//        } else if (monthIndex == 8) {
//            monthString = "Серпень";
//        } else if (monthIndex == 9) {
//            monthString = "Вересень";
//        } else if (monthIndex == 10) {
//            monthString = "Жовтень";
//        } else if (monthIndex == 11) {
//            monthString = "Листопад";
//        } else if (monthIndex == 12) {
//            monthString = "Грудень";
//        } else {
//            monthString = "Неприпустимий місяць";
//        }
        return monthString;
    }
}
