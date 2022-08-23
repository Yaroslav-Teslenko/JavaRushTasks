package ua.javarush.task.pro.task10.task1015;

/* 
Їжачок і яблуко
Наше завдання — нагодувати їжачка. У методі main слід створити один об'єкт Apple і один об'єкт Hedgehog, у
якого викликати метод eat і передати потрібний аргумент — яблуко.


Requirements:
1. Клас Hedgehog має містити вкладений клас public static class Apple.
2. Клас Hedgehog має містити нестатичний публічний метод eat(Apple) з типом повернення void.
3. У методі main має бути створено один об'єкт класу Apple.
4. У методі main має бути створено один об'єкт класу Hedgehog.
5. У методі main для об'єкта класу Hedgehog потрібно викликати метод eat і передати створений об'єкт класу Apple.
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблуко з'їли!");
    }

    public static void main(String[] args) {
        Apple apple=new Apple();
        Hedgehog hedgehog=new Hedgehog();
        hedgehog.eat(apple);
        //напишіть тут ваш код
    }

    public static class Apple {
    }
}
