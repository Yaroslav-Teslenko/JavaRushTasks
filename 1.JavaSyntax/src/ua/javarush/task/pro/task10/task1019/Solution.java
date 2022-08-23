package ua.javarush.task.pro.task10.task1019;

import java.util.Calendar;

/* 
Поточний рік

У класі Solution є поле currentYear, яке має ініціалізуватися значенням поточного року
(Calendar.getInstance().get(Calendar.YEAR)) під час створення нового об'єкта типу Solution.
Тобі потрібно знайти помилку й виправити її, щоб під час створення об'єкта класу Solution поле
currentYear ініціалізувалося правильно.


Requirements:
1. Клас Solution має містити приватне нестатичне поле currentYear типу int.
2. У класі Solution має бути гетер getCurrentYear для поля currentYear.
3. Під час створення об'єкта класу Solution поле currentYear має ініціалізуватися значенням поточного року
 (використовуй метод Calendar.getInstance().get(Calendar.YEAR)).
*/

public class Solution {

    private int currentYear;

    public Solution() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear());
    }
}
