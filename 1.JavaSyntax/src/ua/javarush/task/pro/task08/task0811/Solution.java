package ua.javarush.task.pro.task08.task0811;

/* 
Побітові операції
Закоментуй непотрібні рядки коду, щоб вивести на екран цифру 5.
Примітка. Потрібно закоментувати лише два рядки.


Requirements:
1. Програма має виводити на екран цифру 5
2. Не можна змінювати рядок з оголошенням змінної x.
3. Не можна змінювати тіло методу main(String[]), можна лише закоментувати певні 2 рядки.
*/

public class Solution {

    public static void main(String[] args) {
        int x = 7;
        //x = x & 25;
          x = x & 5;
       // x = x & 3;
        x = x & 12;
        x = x | 1;
        System.out.println(x);
    }
}