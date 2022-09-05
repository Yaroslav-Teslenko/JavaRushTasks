package ua.javarush.task.pro.task12.task1212;

public class Solution {
//ArrayList — це список, який зберігає динамічно розширюваний масив елементів. Зараз ми будемо реалізовувати свою
// версію списку, в якому зберігаються рядки. Клас CustomStringArrayList має три поля:
//String[] elements — це масив поточних елементів (у схожому масиві зберігає значення ArrayList). Початково його
// розмір дорівнює 10 (capacity = 10).
//int size — кількість заповнених елементів, початкове значення — 0.
//int capacity — поточна місткість масиву (elements) даних, яка збільшуватиметься в ході додавання даних.
//Для простоти реалізації ми будемо використовувати лише два методи:
//
//Публічний метод add(String), який додає елементи в масив. Цей метод дасть нам змогу побачити, як масив динамічно розширюється.
//Коли масив заповнено (size == capacity), викликається метод grow() для розширення масиву.
//Приватний метод grow(), який має присвоїти полю elements новий масив у півтора раза більшої місткості (capacity),
// ніж у старого масиву, і скопіювати дані зі старого масиву в новий у тому самому порядку.
// Поле capacity має збільшитися так само, як і розмір масиву.
//
//Requirements:
//1. Клас CustomStringArrayList має містити нестатичні приватні поля int size, int capacity, String[] elements.
//2. Клас CustomStringArrayList має містити конструктор без параметрів, який ініціалізує поле size значенням 0,
// поле capacity — значенням 10, поле elements — новим масивом (розмір масиву — capacity).
//3. Клас CustomStringArrayList має містити метод public void add(String).
//4. Клас CustomStringArrayList має містити метод private void grow().
//5. Метод grow() має працювати згідно з умовою.
//6. Метод add(String) змінювати не можна.

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }
}