package ua.javarush.task.pro.task17.task1705;

import java.util.ArrayList;

/* 
Космічна одіссея ч. 3
Зробімо наш попередній приклад більш правильним і універсальним.
Порядок, в якому астронавти додаються до списку astronauts, не завжди відомий.
Щоб правильно розподілити завдання між членами екіпажу, потрібно визначити, ким саме є астронавт.
Для цього в методі runWorkingProcess() перебери в циклі всіх астронавтів, використовуючи оператор instanceof,
 визнач, ким саме є астронавт, і передай його як аргумент відповідному методу:
Human — у метод pilot(Human human);
Dog — у метод createDirection(Dog dog);
Cat — у метод research(Cat cat).

Метод runWorkingProcess() має працювати правильно незалежно від кількості астронавтів і порядку їх додавання до списку astronauts.


Requirements:
1. Метод runWorkingProcess() має викликати метод pilot(Human human) для кожного об'єкта Human зі списку astronauts.
2. Метод runWorkingProcess() має викликати метод createDirection(Dog dog) для кожного об'єкта Dog зі списку astronauts.
3. Метод runWorkingProcess() має викликати метод research(Cat cat) для кожного об'єкта Cat зі списку astronauts.
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
        for (Astronaut astronaut : astronauts) {
            if(astronaut instanceof Human) pilot((Human) astronaut);
            if(astronaut instanceof Dog) createDirection((Dog)astronaut);
            if(astronaut instanceof Cat) research((Cat)astronaut);
        }
    }

    public static void pilot(Human human) {
        System.out.println("Член екіпажу " + human.getInfo() + " пілотує корабель.");
    }

    public static void createDirection(Dog dog) {
        System.out.println("Член екіпажу " + dog.getInfo() + " займається створенням навігаційного маршруту.");
    }

    public static void research(Cat cat) {
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
