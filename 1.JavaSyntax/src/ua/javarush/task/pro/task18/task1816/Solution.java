package ua.javarush.task.pro.task18.task1816;

import java.util.Locale;
import java.util.stream.Stream;

/* 
Перетворення даних-2
Реалізуй метод toUpperCase(Stream<String>) так, щоб він повертав потік таких самих рядків, що й у вхідному потоці,
тільки у верхньому регістрі.
Оскільки це буде потік уже інших рядків, для перетворення використовуй метод map() об'єкта типу Stream<String>.

Метод main() під час тестування не перевіряється.


*/

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "хвилюйтеся", "якщо", "щось", "не", "працює.", "Коли", "б", "усе", "працювало", "вас", "би", "звільнили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        //напишіть тут ваш код
        return strings.map(s -> s.toUpperCase());
    }
}
