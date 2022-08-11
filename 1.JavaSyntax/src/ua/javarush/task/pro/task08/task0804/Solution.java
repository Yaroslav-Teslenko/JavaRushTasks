package ua.javarush.task.pro.task08.task0804;

/* 
Randomizer
У цій задачі тобі потрібно реалізувати метод generateNumber(), який повертатиме випадкове число від 0 до 99.
У методі generateNumber() використай метод Math.random().


Requirements:
1. Клас Solution має містити публічний статичний метод generateNumber(), який повертає значення типу int.
2. Реалізуй метод generateNumber() згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        //напишіть тут ваш код
        return (int )(100*Math.random());
    }
}
