package ua.javarush.task.pro.task12.task1206;

/* 
Аналіз рядків
Реалізуй методи countDigits(String), countLetters(String), countSpaces(String), які мають
повертати кількість цифр, літер і пробілів у рядку.
Метод main у перевірці не використовується.


Requirements:
1. Метод countDigits(String) має повертати кількість цифр у переданому рядку.
2. Метод countLetters(String) має повертати кількість літер у переданому рядку.
3. Метод countSpaces(String) має повертати кількість пробілів у переданому рядку.
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча." +
                "Тільки нікому не кажіть, що вона виникла випадково.";

        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count=0;
        for (char c: string.toCharArray()){
            if (Character.isDigit(c)) {
                count++;
            }
        }
       return count;
    }

    public static int countLetters(String string) {
        int count=0;
        for (char c: string.toCharArray()){
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count=0;
        for (char c: string.toCharArray()){
            if (Character.isSpaceChar(c)) {
                count++;
            }
        }
        return count;
    }
}
