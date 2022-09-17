package ua.javarush.task.pro.task18.task1819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* 
Як бути, якщо в списку є елемент null
Призначення методу printList(List<String>) — вивести в консоль усі елементи списку, отриманого як параметр, у
тому самому порядку. Але є нюанс: список може містити елементи, які дорівнюють null.

Твоє завдання — вивести всі елементи списку в консоль, а замість null — фразу: Цей елемент дорівнює null
У методі printList(List<String>) не можна використовувати цикли, оператор if/else і тернарний оператор.
Для перевірки рівності рядка значенню null і заміни цього рядка на інший є метод orElse об'єкта типу Optional<String>.

Метод main() під час тестування не перевіряється.



*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Цей елемент дорівнює null";
        //напишіть тут ваш код
        list.stream().map(s -> Optional.ofNullable(s)).forEach(s->System.out.println(s.orElse(text)));
        //list.forEach(s -> System.out.println(Optional.ofNullable(s).orElse(text)));
    }
}
