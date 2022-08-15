package ua.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двійковий конвертер
Публічний статичний метод toBinary(int) має перетворювати ціле число, отримане як вхідний параметр, з десяткової
системи числення у двійкову й повертати рядкове подання цього числа. А публічний статичний метод toDecimal(String)
навпаки — має перетворювати рядкове подання двійкового числа на десяткове число.
Методи діють лише для додатних чисел і непорожніх рядків. Якщо вхідний параметр дорівнює або менший за 0, метод
toBinary(int) повертає порожній рядок. Якщо вхідний параметр — порожній рядок або null, метод toDecimal(String)
повертає 0.
Твоє завдання — реалізувати ці методи.

Один із алгоритмів перетворення десяткового числа на рядкове подання двійкового числа такий:
while(десяткове число не дорівнює 0) {
двійкове подання = остача від ділення десяткового числа на 2 + двійкове подання
десяткове число = десяткове число / 2
}

Один із алгоритмів перетворення рядкового подання двійкового числа на десяткове число такий:
for (int i = 0; i < довжина двійкового подання; i++) {
десяткове число = десяткове число + число з двійкового подання * на 2 в степені i
}

Спочатку беремо крайнє праве число з двійкового подання. На кожній ітерації циклу беремо наступне число ближче до
початку двійкового подання.

Підказка: для піднесення числа до степеня можна скористатися методом Math.pow(число, степінь).
Метод main() у тестуванні не використовується.


Requirements:
1. Потрібно реалізувати метод toBinary(int) згідно з умовою.
2. Потрібно реалізувати метод toDecimal(String) згідно з умовою.
3. Методи Integer.toBinaryString(int) і Long.toBinaryString(int) використовувати не можна.
4. Методи Integer.parseInt(String, int) і Long.parseLong(String, int) використовувати не можна.
5. Методи Integer.toString(int, int) і Long.toString(long, int) використовувати не можна.
6. Об'єкт типу BigInteger використовувати не можна.
7. Об'єкт типу BigDecimal використовувати не можна.
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {

        if (decimalNumber <= 0) return "";
        String binNum = "";
        while (decimalNumber > 0) {
            binNum = "" + decimalNumber % 2 + binNum;
            decimalNumber = decimalNumber / 2;
        }
        return binNum;
    }

    public static int toDecimal(String binaryNumber) {
    /*    if (binaryNumber==null || binaryNumber.isEmpty()) {
            return 0;
        }
        double decNum=0;
        char[] ch=binaryNumber.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            decNum=decNum+Math.pow(ch[i], i*1.0);
        }
        return (int) decNum;*/
        int decimalNumber = 0;
        if (binaryNumber == null) {
            return decimalNumber;
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNumber += value * Math.pow(2, i);
        }
        return decimalNumber;
}}
