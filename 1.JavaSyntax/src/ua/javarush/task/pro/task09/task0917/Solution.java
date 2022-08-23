package ua.javarush.task.pro.task09.task0917;

/* 
String pool
Метод equal(String, String) порівнює рядки за посиланням за допомогою оператора ==.
Цей метод має повертати true, якщо рядки мають однаковий вміст, і false, якщо їхній
вміст різний. Метод equals() використовувати не можна.


Requirements:
1. У методі equal(String, String) потрібно порівнювати вміст рядків, використовуючи оператор ==.
2. Якщо рядки однакові, метод equal(String, String) має повертати значення true.
3. Якщо рядки різні, метод equal(String, String) має повертати значення false.
4. Метод equals() використовувати не можна.
*/

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        //напишіть тут ваш код
        String f = first.intern();
        String s = second.intern();
        return (f == s);
    }
}
