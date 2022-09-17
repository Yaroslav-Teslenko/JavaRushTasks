package ua.javarush.task.pro.task17.task1706;

/* 
Хижаки й травоїдні
Перед тобою 4 класи тварин — Cow, Lion, Wolf і Elephant. Корова (Cow) і слон (Elephant) є травоїдними, тому вони успадковуються від класу Herbivore.
А лев (Lion) і вовк (Wolf) є хижаками, тому вони успадковуються від класу Predator.
Своєю чергою класи Herbivore і Predator успадковано від класу Animal.
У класі Solution реалізуй метод printRation(Animal animal), який має виводити в консоль раціон переданої тварини:

якщо тварина — хижак, потрібно вивести "Любить м'ясо";
якщо тварина — травоїдна, потрібно вивести "Любить траву".

Requirements:
1. Метод printRation(Animal animal) має виводити "Любить м'ясо", якщо тварина, передана як аргумент, є хижаком (Predator).
2. Метод printRation(Animal animal) має виводити "Любить траву", якщо тварина, передана як аргумент, є травоїдною (Herbivore).
*/

public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal){
        String herbivore = "Любить траву";
        String predator = "Любить м'ясо";

        //напишіть тут ваш код
        if (animal instanceof Predator) System.out.println(predator);
        if (animal instanceof Herbivore) System.out.println(herbivore);
    }
}
