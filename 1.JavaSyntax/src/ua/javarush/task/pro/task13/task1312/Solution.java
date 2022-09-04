package ua.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;

/* 
ArrayList і HashMap
У класі Solution є метод getProgrammingLanguages, який повертає список мов програмування. Потрібно переписати цей
метод, щоб він повертав HashMap<Integer, String>. Ключем у цій колекції буде індекс елемента в ArrayList.


Requirements:
1. Клас Solution має містити публічний статичний метод getProgrammingLanguages, який повертає значення типу HashMap<Integer, String>.
2. Метод getProgrammingLanguages() має повертати значення HashMap, що заповнено відповідно до списку.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишіть тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        HashMap<Integer, String> map= new HashMap<>();
        for (int i = 0; i < programmingLanguages.size(); i++) {
            map.put(i, programmingLanguages.get(i));
        }
        return map;
    }

}
