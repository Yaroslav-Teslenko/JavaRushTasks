package ua.javarush.task.pro.task12.task1220;

import java.util.ArrayList;

/* 
Мисливці за привидом: у гонитві за типами
У методі main створюється список, заповнюється різними об'єктами й передається в метод
checkElementsType(ArrayList<Object>).
Твоє завдання — реалізувати цей метод, який має визначити тип кожного елемента списку, а також:

Для типу String викликати printString();
Для типу Integer викликати printInteger();
Для типу Integer[] викликати printIntegerArray();
Для решти типів викликати printUnknown().
Метод main у перевірці не використовується.

Requirements:
1. Не змінювати оголошення й реалізацію методу printString(String).
2. Не змінювати оголошення й реалізацію методу printInteger(Integer).
3. Не змінювати оголошення й реалізацію методу printIntegerArray(Integer[]).
4. Не змінювати оголошення й реалізацію методу printUnknown(Object).
5. Метод checkElementType(ArrayList<Object>) має працювати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привіт");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        //напишіть тут ваш код
        for (Object element : elements) {
            if (element instanceof String) {
                printString();
                continue;
            }
            if (element instanceof Integer) {
                printInteger();continue;
            }
            if (element instanceof Integer[]) {
                printIntegerArray();continue;
            }
           printUnknown();
        }
    }

    public static void printString() {
        System.out.println("Рядок");
    }

    public static void printInteger() {
        System.out.println("Ціле число");
    }

    public static void printIntegerArray() {
        System.out.println("Масив цілих чисел");
    }

    public static void printUnknown() {
        System.out.println("Інший тип даних");
    }
}
