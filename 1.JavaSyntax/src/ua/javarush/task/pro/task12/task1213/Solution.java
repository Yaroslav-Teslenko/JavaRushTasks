package ua.javarush.task.pro.task12.task1213;

import java.util.ArrayList;

/* 
Сонячна система
У 3020 році вчені навчилися створювати нові планети, одну з яких відправили в Сонячну систему.
Орбіта цієї планети пролягає між орбітами Землі та Марса.
Реалізуй метод createNewPlanet(String), який має додавати передану планету в список planets одразу за Землею.
Подивись, як змінилася послідовність планет.
Методи main(), addPlanets() і print() у перевірці не використовуються.


Requirements:
1. Метод createNewPlanet(String) має додавати передану планету в список planets на наступну позицію після Землі.
*/

public class Solution {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Зоря Смерті");
        print();
    }

    public static void createNewPlanet(String planetName) {
        planets.add(3,planetName);
        //напишіть тут ваш код
    }

    public static void addPlanets() {
        planets.add("Меркурій");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпітер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s — %d-а (-я) планета від Сонця", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}
