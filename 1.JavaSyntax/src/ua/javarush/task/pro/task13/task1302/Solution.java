package ua.javarush.task.pro.task13.task1302;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Перевірка наявності
У класі Solution є метод checkWords(String), який має перевіряти наявність переданого слова в множині words.
Якщо слово є, то виводимо в консоль:
Слово [передане слово] є в множині
Якщо слова немає:
Слова [передане слово] немає в множині

Метод main у перевірці не використовується.

Приклад виведення:
Слово Java є в множині


Requirements:
1. Клас Solution має містити публічне статичне поле words типу HashSet<String>.
2. Клас Solution має містити публічний статичний метод checkWords(String), який не повертає жодного значення (тип void).
3. Метод checkWords(String) має працювати згідно з умовою.
*/

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Якби мене попросили вибрати мову взамін на Java, я б не вибирав".split(" ")));

    public static void checkWords(String word) {
        //напишіть тут ваш код
        if (words.contains(word)) {
            System.out.println("Слово " + word + " є в множині");
        }else { System.out.println("Слова " + word + " немає в множині");}
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
