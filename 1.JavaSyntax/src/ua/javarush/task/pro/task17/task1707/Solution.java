package ua.javarush.task.pro.task17.task1707;

/* 
Вихованці бувають різними
Вихованці бувають різними
Клас Pet є батьківським класом для класів Cat і Dog. У ньому реалізовано метод printInfo(), який повідомляє, що цей об'єкт є вихованцем.
У класах Cat і Dog потрібно перевизначити метод printInfo(), доповнивши його функціонал таким чином:

спочатку виклич метод printInfo() батьківського класу;
потім додатково виведи в консоль "Я не люблю людей" для класу Cat або "Я люблю людей" для класу Dog.
Приклад виведення для класу Cat:
Я домашній вихованець.
Я не люблю людей.

Приклад виведення для класу Dog:
Я домашній вихованець.
Я люблю людей.


Requirements:
1. У класі Cat має бути перевизначено метод printInfo().
2. У класі Dog має бути перевизначено метод printInfo().
3. Метод printInfo() класу Cat має містити виклик методу printInfo() батьківського класу.
4. Метод printInfo() класу Dog має містити виклик методу printInfo() батьківського класу.
5. Метод printInfo() класу Cat має виводити в консоль текст згідно з умовою.
6. Метод printInfo() класу Dog має виводити в консоль текст згідно з умовою.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.printInfo();
        Dog dog = new Dog();
        dog.printInfo();
    }
}