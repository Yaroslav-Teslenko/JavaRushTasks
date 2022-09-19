package ua.javarush.games.minigames.mini12;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

/* 
Працюємо зі списком координат

Перед тобою поле 10x10, яке заповнюється білим кольором.
Тобі потрібно реалізувати метод onMouseLeftClick(int, int), який зафарбовуватиме натиснуту клітину
помаранчевим кольором і, якщо у списку cells немає таких координат, додаватиме їх.

Також тобі потрібно реалізувати метод onMouseRightClick(int, int), який зафарбовуватиме натиснуту
клітину білим кольором і, якщо координати цієї клітини є у списку cells, видалятиме цю клітину зі списку.


Requirements:
1. Реалізуй метод onMouseLeftClick(int, int) згідно з умовою.
2. Реалізуй метод onMouseRightClick(int, int) згідно з умовою.
*/

public class FillGame extends Game {
    private final List<Cell> cells = new ArrayList<>();

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    public void onMouseLeftClick(int x, int y) {
        setCellColor(x, y, Color.ORANGE);
        final Cell current = new Cell(x, y);
        if (!cells.contains(current)) {
            cells.add(current);
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        setCellColor(x, y, Color.WHITE);
        final Cell current = new Cell(x, y);
        cells.remove(current);
    }
}
