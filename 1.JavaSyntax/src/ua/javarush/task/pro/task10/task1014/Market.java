package ua.javarush.task.pro.task10.task1014;

/* 
Купи 10 батонів

Тебе відправили до крамниці й сказали, що треба купити батон, а якщо будуть яйця, то взяти десять штук.
Розберися, чому метод makePurchases незалежно від переданих аргументів завжди виводить у консоль "Куплено 10 батонів", і виправ його.
Метод main у перевірці не використовується.


Requirements:
1. Не можна змінювати поле hasEggs класу Market.
2. Клас Market має містити публічний статичний метод makePurchases(boolean) з типом повернення void.
3. Якщо метод makePurchases(boolean) викликається з аргументом false, то він має вивести в консоль текст: "Куплено 1 батон".
4. Якщо метод makePurchases(boolean) викликається з аргументом true, то він має вивести в консоль текст: "Куплено 10 батонів".
*/

public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Куплено 10 батонів");
        } else {
            System.out.println("Куплено 1 батон");
        }
    }
}
