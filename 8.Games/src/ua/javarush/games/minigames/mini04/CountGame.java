package ua.javarush.games.minigames.mini04;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Рахуємо клітини
Перед тобою поле 10x10, в якому у випадковому порядку розміщено клітини зеленого кольору, а в них — числа.
Щоб побачити це, можеш запустити програму.

Твоє завдання — реалізувати метод showResult(), який має зробити таке:

Обчислити суму всіх чисел у зелених клітинах і вивести в консоль: Сума всіх чисел = [сума]
Підрахувати кількість усіх зелених клітин і вивести в консоль: Кількість зелених клітин = [кількість]
Ми написали методи printSum(int) і printCountOfGreenCells(int), які виводять у консоль відповідний текст.

Підказка:
Щоб дізнатися, яке число розміщено в конкретній клітині, потрібно використовувати метод
getCellNumber(int, int), а щоб дізнатися колір клітини, скористайся методом getCellColor(int, int) класу Game.
Щоб пройти по всьому полю, можеш скористатися вкладеним циклом.


Requirements:
1. Клас CountGame має містити публічний метод showResult, який не повертає жодного значення (тип void).
2. Метод showResult має правильно підраховувати й виводити в консоль кількість зелених клітин і суму всіх чисел.
*/

public class CountGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        showGrid(false);
        for (int j = 0; j < 50; j++) {
            int x = getRandomNumber(10);
            int y = getRandomNumber(10);
            setCellColor(x, y, Color.GREEN);
            setCellNumber(x, y, getRandomNumber(100));
        }
        showResult();
    }

    public void showResult() {
        int sum = 0;
        int cnt = 0;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (getCellColor(x, y) == Color.GREEN) {
                    sum += getCellNumber(x, y);
                    cnt++;
                }
            }
        }
        printSum(sum);
        printCountOfGreenCells(cnt);
    }

    private void printSum(int sum) {
        System.out.println("Сума всіх чисел = " + sum);
    }

    private void printCountOfGreenCells(int count) {
        System.out.println("Кількість зелених клітин = " + count);
    }
}
