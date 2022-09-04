package ua.javarush.task.pro.task13.task1314;

/* 
StringsLinkedList, частина 2
Розв'язуючи цю задачу, ти навчишся видобувати елемент із двобічно зв'язаного списку.
Ми реалізували метод add, який додає елементи в кінець списку. Тобі потрібно реалізувати метод get(int),
який поверне рядок з індексом, переданим у метод. Якщо рядка з таким індексом немає, слід повернути null.
Пам'ятай, що first і last не мають значень, а лише посилаються відповідно на перший і останній елементи.


Requirements:
1. Метод get(int index) має повертати елемент списку з індексом index.
*/

public class Solution {

    public static void main(String[] args) {
        StringsLinkedList stringsLinkedList = new StringsLinkedList();
        stringsLinkedList.add("1");
        stringsLinkedList.add("2");
        stringsLinkedList.add("3");
        stringsLinkedList.add("4");
        stringsLinkedList.add("5");
        stringsLinkedList.add("6");
        stringsLinkedList.add("7");
        stringsLinkedList.add("8");
        stringsLinkedList.add("9");
        System.out.println(stringsLinkedList.get(4)); // 5
    }
}
