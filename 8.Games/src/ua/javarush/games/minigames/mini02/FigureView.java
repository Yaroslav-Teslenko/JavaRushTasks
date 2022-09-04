package ua.javarush.games.minigames.mini02;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Відображаємо корабель
Відображаємо корабель
Спробуймо намалювати просту фігуру на ігровому полі. Тобі потрібно перевизначити метод initialize() класу
Game і в цьому методі задати розмір ігрового поля (5х7) за допомогою методу setScreenSize(int, int).
Також потрібно викликати метод showShip(), який малює корабель.

Requirements:
1. У класі FigureView потрібно перевизначити метод initialize().
2. У методі initialize() потрібно викликати метод setScreenSize(int, int) з аргументами 5 і 7.
3. У методі initialize() потрібно викликати метод showShip().
4. Метод showShip() потрібно викликати після setScreenSize(int, int).
5. Роботу методу showShip() не змінювати.
6. Поле SHIP класу FigureView не змінювати.
*/

public class FigureView extends Game {

    public static final int[][] SHIP = new int[][]{
            {0, 0, 7, 0, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {7, 7, 7, 7, 7},
            {7, 0, 7, 0, 7},
    };

    //напишіть тут ваш код

    @Override
    public void initialize() {
        setScreenSize(5,  7);
        showShip();
    }

    public void showShip() {
        for (int i = 0; i < SHIP.length; i++) {
            for (int j = 0; j < SHIP[0].length; j++) {
                setCellColor(j, i, Color.values()[SHIP[i][j]]);
            }
        }
    }
}
