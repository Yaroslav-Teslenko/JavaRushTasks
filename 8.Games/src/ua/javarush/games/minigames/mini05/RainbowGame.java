package ua.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Кольори веселки
Попрацюймо з методом setCellColor(int, int, Color), який зафарбовуватиме клітину за переданими координатами.
Розпочнімо малювати веселку. Потрібно створити ігрове поле розміром 10x7 у методі initialize()
і зафарбувати кожен рядок у свій колір за допомогою методу setCellColor(int, int, Color).
Порядок кольорів зверху донизу такий:
Color.RED
Color.ORANGE
Color.YELLOW
Color.GREEN
Color.BLUE
Color.INDIGO
Color.VIOLET


Requirements:
1. У класі RainbowGame потрібно перевизначити метод initialize() батьківського класу Game.
2. У методі initialize() потрібно викликати метод setScreenSize(int, int) з аргументами 10 і 7.
3. У методі initialize() за допомогою методу setCellColor(int, int, Color) розфарбуй ігрове поле в кольори веселки.
*/

public class RainbowGame extends Game {

    //напишіть тут ваш код

    @Override
    public void initialize() {

        setScreenSize(10, 7);
        fillRow(0, Color.RED);
        fillRow(1, Color.ORANGE);
        fillRow(2, Color.YELLOW);
        fillRow(3, Color.GREEN);
        fillRow(4, Color.BLUE);
        fillRow(5, Color.INDIGO);
        fillRow(6, Color.VIOLET);

    }

    private void fillRow(int r, Color color) {
        for (int i = 0; i < 10; i++) {
            setCellColor(i, r, color);
        }

    }
}
