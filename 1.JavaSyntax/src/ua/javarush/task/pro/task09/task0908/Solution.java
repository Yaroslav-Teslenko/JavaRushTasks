package ua.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двійково-шістнадцятковий конвертер
Двійково-шістнадцятковий конвертер
Публічний статичний метод toHex(String) має перетворювати рядкове подання двійкового числа, отримане як вхідний параметр, з двійкової системи числення в шістнадцяткову й повертати його рядкове подання. А публічний статичний метод toBinary(String) навпаки — має перетворювати рядкове подання шістнадцяткового числа на рядкове подання двійкового числа.

Методи діють тільки для непорожніх рядків.
Якщо вхідний параметр — порожній рядок або null, обидва методи повертають порожній рядок.
Якщо вхідний параметр методу toHex(String) містить символи, відмінні від 0 і 1, метод повертає порожній рядок.
Якщо вхідний параметр методу toBinary(String) містить символи, крім цифр 0–9 і малих латинських літер a–f, метод повертає порожній рядок.

Твоє завдання — реалізувати ці методи.

Нижче наведено один із алгоритмів перетворення рядкового подання двійкового числа на рядкове подання шістнадцяткового числа.

Перевіряємо довжину рядка, отриманого як вхідний параметр. Вона має бути кратною 4.
Якщо це не так, слід додати на початку рядка потрібну кількість цифр 0.
По черзі перевіряємо кожні чотири символи (біти) на відповідність певному символу шістнадцяткового кодування.
Приклад:

двійкове подання — "100111010000", де "1001" — "9", "1101" — "d", "0000" — "0",
шістнадцяткове подання — "9d0".
Нижче наведено один із алгоритмів перетворення рядкового подання шістнадцяткового числа на рядкове подання двійкового числа.
По черзі перевіряємо кожний символ на відповідність двійковому числу (4 біти).

Приклад:

шістнадцяткове подання — "9d0", де "9" — "1001", "d" — "1101", "0" — "0000",
двійкове подання — "100111010000".
Метод main() у тестуванні не використовується.


Requirements:
1. Потрібно реалізувати метод toHex(String) згідно з умовою.
2. Потрібно реалізувати метод toBinary(String) згідно з умовою.
3. Методи Integer.toBinaryString(int) і Long.toBinaryString(int) використовувати не можна.
4. Методи Integer.toHexString(int) і Long.toHexString(int) використовувати не можна.
5. Методи Integer.parseInt(String, int) і Long.parseLong(String, int) використовувати не можна.
6. Методи Integer.toString(int, int) і Long.toString(long, int) використовувати не можна.
7. Об'єкт типу BigInteger використовувати не можна.
8. Об'єкт типу BigDecimal використовувати не можна.
*/

public class Solution {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює шістнадцятковому числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює двійковому числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null) {
            return hexNumber;
        }

        StringBuilder temp = new StringBuilder();
        if (binaryNumber.length() % 4 == 1) {
            temp.append("000").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 2) {
            temp.append("00").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 3) {
            temp.append("0").append(binaryNumber);
        } else {
            temp.append(binaryNumber);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < temp.length(); i += 4) {
            String substring = temp.substring(i, i + 4);
            String element;
            if (substring.equals("0001")) {
                element = "1";
            } else if (substring.equals("0010")) {
                element = "2";
            } else if (substring.equals("0011")) {
                element = "3";
            } else if (substring.equals("0100")) {
                element = "4";
            } else if (substring.equals("0101")) {
                element = "5";
            } else if (substring.equals("0110")) {
                element = "6";
            } else if (substring.equals("0111")) {
                element = "7";
            } else if (substring.equals("1000")) {
                element = "8";
            } else if (substring.equals("1001")) {
                element = "9";
            } else if (substring.equals("1010")) {
                element = "a";
            } else if (substring.equals("1011")) {
                element = "b";
            } else if (substring.equals("1100")) {
                element = "c";
            } else if (substring.equals("1101")) {
                element = "d";
            } else if (substring.equals("1110")) {
                element = "e";
            } else if (substring.equals("1111")) {
                element = "f";
            } else {
                element = "0";
            }
            result.append(element);
        }
        return result.toString();
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null) {
            return binaryNumber;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            String element;
            if(hexNumber.charAt(i) == '0') {
                element = "0000";
            } else if (hexNumber.charAt(i) == '1') {
                element = "0001";
            } else if (hexNumber.charAt(i) == '2') {
                element = "0010";
            } else if (hexNumber.charAt(i) == '3') {
                element = "0011";
            } else if (hexNumber.charAt(i) == '4') {
                element = "0100";
            } else if (hexNumber.charAt(i) == '5') {
                element = "0101";
            } else if (hexNumber.charAt(i) == '6') {
                element = "0110";
            } else if (hexNumber.charAt(i) == '7') {
                element = "0111";
            } else if (hexNumber.charAt(i) == '8') {
                element = "1000";
            } else if (hexNumber.charAt(i) == '9') {
                element = "1001";
            } else if (hexNumber.charAt(i) == 'a') {
                element = "1010";
            } else if (hexNumber.charAt(i) == 'b') {
                element = "1011";
            } else if (hexNumber.charAt(i) == 'c') {
                element = "1100";
            } else if (hexNumber.charAt(i) == 'd') {
                element = "1101";
            } else if (hexNumber.charAt(i) == 'e') {
                element = "1110";
            } else if (hexNumber.charAt(i) == 'f') {
                element = "1111";
            } else {
                result.setLength(0);;
                break;
            }
            result.append(element);
        }
        return result.toString();
    }
}
