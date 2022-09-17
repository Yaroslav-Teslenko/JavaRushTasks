package ua.javarush.task.pro.task18.task1812;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/* 
Рейтинг мов програмування
Клас Language — це модель мови програмування. У цьому класі є два поля: name — назва мови програмування,
ranking — рейтинг використання мови програмування станом на вересень 2020 року, згідно з TIOBE.
Потрібно, щоб публічний статичний метод sortByRanking(ArrayList<Language>) сортував отриманий список мов
програмування за спаданням рейтингу й повертав відсортований потік даних (Stream<Language>).

Підказка:
Оскільки поле рейтингу має тип Double, для сортування потрібно використовувати статичний метод compare(Double, Double)
класу Double або метод compareTo(Double) об'єкта типу Double.

Метод main() під час тестування не перевіряється.


Requirements:
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<>();
        Collections.addAll(languages,
                new Language("С#", 4.58),
                new Language("JavaScript", 2.54),
                new Language("Python", 10.47),
                new Language("C++", 7.11),
                new Language("Go", 1.46),
                new Language("R", 2.37),
                new Language("Java", 13.48),
                new Language("C", 15.95),
                new Language("Swift", 1.38),
                new Language("PHP", 2.49));

        Stream<Language> languageStream = sortByRanking(languages);
        languageStream.forEach(System.out::println);
    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languages) {
        //напишіть тут ваш код
        //return languages.stream().sorted(Comparator.comparingDouble(l -> (double) l.getRanking()));
        //return languages.stream().sorted((l1,l2)->l1.getRanking().compareTo(l2.getRanking()));
        return languages.stream().sorted((s1, s2) -> Double.compare(s2.getRanking(), s1.getRanking()));
    }
}
