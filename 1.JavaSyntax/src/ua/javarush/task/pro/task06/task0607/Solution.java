package ua.javarush.task.pro.task06.task0607;

/* 
Ласкаво просимо! Але не всіх.
Перед тобою метод signIn(), який вітає користувачів сайту. Зараз він вітає всіх користувачів, а має вітати лише
зареєстрованих. Імена всіх незареєстрованих користувачів — "user".
Додай перевірку імені користувача на початку методу signIn().
Якщо ім'я користувача — "user", слід перервати виконання методу, використовуючи ключове слово return.


Requirements:
1. Якщо ім'я користувача - "user", метод signIn() має припинити роботу й нічого не виводити в консоль.
2. Якщо ім'я користувача — не "user", метод signIn() має продовжувати роботу й вивести рядки привітання в консоль.
3. Для переривання роботи методу signIn() слід використовувати ключове слово return.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static void signIn(String username){
        //напишіть тут ваш код
        if(username=="user") return;
        System.out.println("Ласкаво просимо, " + username);
        System.out.println("Дуже скучили за Вами, " + username);
    }
}