package ua.javarush.task.pro.task17.task1704;

import java.util.ArrayList;

/* 
Космічна одіссея ч. 2
Усі члени екіпажу космічного корабля знаходяться на борту, корабель успішно вийшов у відкритий космос.
Команді вже час почати виконання своїх обов'язків:
Людям — пілотувати корабель, Собаці — займатися навігацією, а Коту — досліджувати відкритий космос.

Розподіли обов'язки членів екіпажу в методі runWorkingProcess().

Для цього витягни зі списку astronauts усіх людей (їхні індекси ти знаєш) і передай їх як аргументи методу pilot(Human human), собаку передай у метод createDirection(Dog dog), а кота — у метод research(Cat cat).
Інші методи не змінюй.

Підказка:
Список astronauts містить об'єкти типу Astronaut. Щоб викликати методи pilot(), createDirection() і research(), спочатку потрібно перетворити об'єкт Astronaut на відповідний тип.


Requirements:
1. Метод runWorkingProcess() має викликати метод pilot(Human human) двічі. Як аргументи потрібно передати всі об'єкти типу Human зі списку astronauts.
2. Метод runWorkingProcess() має викликати метод createDirection(Dog dog) 1 раз. Як аргумент потрібно передати об'єкт типу Dog зі списку astronauts.
3. Метод runWorkingProcess() має викликати метод research(Cat cat) 1 раз. Як аргумент потрібно передати об'єкт типу Cat зі списку astronauts.
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        //напишіть тут ваш код
        pilot((Human) astronauts.get(0));
        pilot((Human) astronauts.get(1));
        createDirection((Dog) astronauts.get(2));
        research((Cat) astronauts.get(3));
    }

    public static void pilot(Human human){
        System.out.println("Член екіпажу " + human.getInfo() + " пілотує корабель.");
    }

    public static void createDirection(Dog dog){
        System.out.println("Член екіпажу " + dog.getInfo() + " займається створенням навігаційного маршруту.");
    }

    public static void research(Cat cat){
        System.out.println("Член екіпажу " + cat.getInfo() + " досліджує найближчі планети.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт прибули члени екіпажу: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
