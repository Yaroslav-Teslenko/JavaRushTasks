package ua.javarush.task.pro.task13.task1309;

import java.util.Collections;
import java.util.HashMap;

/* 
Успішність студентів
У класі Solution оголошено поле grades типу HashMap<String, Double>, де ключ — ім'я та прізвище студента, а
значення —- його середня оцінка. Твоє завдання — реалізувати метод addStudents, який додасть 5 студентів разом з їхньою середньою оцінкою в колекцію grades.
Можна вибирати будь-які значення.


Requirements:
1. У класі Solution потрібно ініціалізувати публічне статичне поле grades типу HashMap<String, Double>.
2. Клас Solution має містити публічний статичний метод addStudents, який не повертає жодного значення (тип void).
3. Метод addStudents має додавати 5 студентів разом з їхньою середньою оцінкою в поле grades.
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишіть тут ваш код
        grades.put("Сергій", 4.);
        grades.put("Микола", 3.);
        grades.put("Іван Петрович", 5.);
        grades.put("Ганнуся", 9.);
        grades.put("Ярик", 9.);

    }
}
