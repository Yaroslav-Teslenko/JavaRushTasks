package ua.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

/* 
Робота з клавіатурою
Настав час реалізувати методи, що викликаються натисканням клавіш. Це onKeyPress(Key) і onKeyReleased(Key).
Під час запуску гри поле складається з 3x3 клітин.

Тоді потрібно зробити так, щоб:
під час натискання Key.LEFT було зафарбовано три ліві клітини;
під час натискання Key.RIGHT було зафарбовано три праві клітини;
під час натискання Key.UP — три верхні;
під час натискання Key.DOWN — три нижні.
Клітини слід зафарбовувати зеленим кольором.
Після відпускання будь-якої з цих чотирьох клавіш усі клітини мають бути зафарбовані білим кольором.

Requirements:
1. У класі KeyboardGame потрібно перевизначити метод onKeyPress(Key) батьківського класу Game.
2. У класі KeyboardGame потрібно перевизначити метод onKeyReleased(Key) батьківського класу Game.
3. Під час натискання клавіші Key.LEFT мають зафарбовуватися зеленим кольором три ліві клітини.
4. Під час натискання клавіші Key.RIGHT мають зафарбовуватися зеленим кольором три праві клітини.
5. Під час натискання клавіші Key.UP мають зафарбовуватися зеленим кольором три верхні клітини.
6. Під час натискання клавіші Key.DOWN мають зафарбовуватися зеленим кольором три нижні клітини.
7. Після відпускання клавіш Key.LEFT, Key.RIGHT, Key.UP або Key.DOWN усі клітини
мають бути зафарбовані білим кольором.
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }
    @Override
    public void onKeyPress(Key key) {
        if (key == Key.LEFT) {
            setCellColor(0, 0, Color.GREEN);
            setCellColor(0, 1, Color.GREEN);
            setCellColor(0, 2, Color.GREEN);
        } else if (key == Key.RIGHT) {
            setCellColor(2, 0, Color.GREEN);
            setCellColor(2, 1, Color.GREEN);
            setCellColor(2, 2, Color.GREEN);
        } else if (key == Key.UP) {
            setCellColor(0, 0, Color.GREEN);
            setCellColor(1, 0, Color.GREEN);
            setCellColor(2, 0, Color.GREEN);
        } else if (key == Key.DOWN) {
            setCellColor(0, 2, Color.GREEN);
            setCellColor(1, 2, Color.GREEN);
            setCellColor(2, 2, Color.GREEN);
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if(key == Key.LEFT || key == Key.RIGHT || key == Key.UP || key == Key.DOWN) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    setCellColor(x, y, Color.WHITE);
                }
            }
        }
    }
  /*  @Override
    public void onKeyPress(Key key) {
        if (key == Key.LEFT) fillCol(0, Color.GREEN);
        if (key == Key.RIGHT) fillCol(2, Color.GREEN);
        if (key == Key.UP) fillRow(0, Color.GREEN);
        if (key == Key.DOWN) fillRow(2, Color.GREEN);
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key == Key.LEFT) fillCol(0, Color.WHITE);
        if (key == Key.RIGHT) fillCol(2, Color.WHITE);
        if (key == Key.UP) fillRow(0, Color.WHITE);
        if (key == Key.DOWN) fillRow(2, Color.WHITE);
    }

    //напишіть тут ваш код
    public void fillRow(int r, Color color) {
        for (int i = 0; i < 3; i++) {
            setCellColor(i, r, color);
        }
    }

    public void fillCol(int c, Color color) {
        for (int i = 0; i < 3; i++) {
            setCellColor(c, i, color);
        }
    }*/
}
