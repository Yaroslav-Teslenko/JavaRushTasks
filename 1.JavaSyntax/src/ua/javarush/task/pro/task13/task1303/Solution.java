package ua.javarush.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Виводимо в консоль елементи множини
У класі Solution є метод print(HashSet<String>), який має виводити в консоль усі елементи множини, використовуючи iterator().
Метод main у перевірці не використовується.


Requirements:
1. Клас Solution має містити публічний статичний метод print(HashSet<String>), який не повертає жодного значення (тип void).
2. Метод print(HashSet<String>) має працювати згідно з умовою.

Iterator<Тип> it = ім'я.iterator();
де ім'я — це ім'я змінної-колекції, Тип — це тип елементів колекції,
iterator() — це метод колекції, it — це ім'я змінної-об'єкта-ітератора.
*/

public class Solution {

    public static void print(HashSet<String> words) {
        //напишіть тут ваш код
//        for (String word : words) {
//            System.out.println(word);
//        }
        Iterator it = words.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Програмування зазвичай навчають на прикладах.".split(" ")));
        print(words);
    }
}
