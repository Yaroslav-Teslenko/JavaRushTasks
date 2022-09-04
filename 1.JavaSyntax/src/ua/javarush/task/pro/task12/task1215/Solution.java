package ua.javarush.task.pro.task12.task1215;

import java.util.ArrayList;

/* 
Розбираємо піраміду з келихів
Задача проста: потрібно розібрати піраміду з келихів. А допоможе нам у цьому метод removeGlassesReverse.
Цей метод має прибирати кожен ряд, починаючи з верхнього (з кінця списку). Тобі потрібно реалізувати цей метод.
У тестуванні тобі допоможе метод main.
Спробуй запустити програму й подивитися, що виводиться на екран.


Requirements:
1. Клас Solution має містити публічний статичний метод removeGlassesReverse(ArrayList<String>).
2. Метод removeGlassesReverse має видалити всі елементи з переданого списку, починаючи з кінця
(використовуй метод remove(int) для списку).
*/

public class Solution {

    private static ArrayList<String> initList() {
        String glassTop = "       🍷       ";
        String glassSecond = "      🍷🍷      ";
        String glassThird = "     🍷🍷🍷     ";
        String glassFourth = "    🍷🍷🍷🍷    ";
        String glassFifth = "   🍷🍷🍷🍷🍷   ";
        String glassSixth = "  🍷🍷🍷🍷🍷🍷  ";
        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String glassEighth = "🍷🍷🍷🍷🍷🍷🍷🍷";
        ArrayList<String> list = new ArrayList<>();
        list.add(glassEighth);
        list.add(glassSeventh);
        list.add(glassSixth);
        list.add(glassFifth);
        list.add(glassFourth);
        list.add(glassThird);
        list.add(glassSecond);
        list.add(glassTop);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for (int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("Починаємо розбирати піраміду...");

        //напишіть тут ваш код
        while (glasses.size() != 0) {
            glasses.remove(glasses.size()-1);
        }
        if (glasses.size() == 0) {
            System.out.println("Піраміду розібрано!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);

        removeGlassesReverse(glasses);
        print(glasses);
    }
}
