package ua.javarush.games.minigames.mini07;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Робота з мишею
Робота з мишею
Ознайомимося з методами, що викликаються натисканням кнопок миші, і за їхньою допомогою розфарбуємо поле.

У методі initialize() задай розміри поля 5х5 і зафарбуй кожну клітину в білий колір.
Перевизнач метод onMouseLeftClick(int, int) класу Game так, щоб він зафарбовував у зелений колір (Color.GREEN) клітину за отриманими координатами.
Перевизнач метод onMouseRightClick(int, int) класу Game так, щоб він зафарбовував у помаранчевий колір (Color.ORANGE) клітину за отриманими координатами.

Requirements:
1. Метод initialize() має задати розмір поля 5x5 і зафарбувати кожну клітину в білий колір.
2. Метод onMouseLeftClick(int, int) має зафарбовувати клітину за переданими координатами в зелений колір.
3. Метод onMouseRightClick(int, int) має зафарбовувати клітину за переданими координатами в помаранчевий колір.
*/

public class PaintGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(5,5);
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
              setCellColor(x,y, Color.WHITE);
            }
        }

    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        setCellColor(x,y, Color.GREEN);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        setCellColor(x,y, Color.ORANGE);
    }
//напишіть тут ваш код
}
