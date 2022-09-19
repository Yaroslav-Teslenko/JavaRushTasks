package ua.javarush.games.minigames.mini06;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Діалогові вікна

Реалізуймо відображення діалогового вікна з текстом. У разі натискання лівої кнопки миші виводимо текст
"Ви виграли" зеленого кольору, а в разі натискання правої кнопки миші — "Ви програли" червоного кольору.

Для того щоб працювати з натисканням кнопок миші, потрібно перевизначити методи onMouseLeftClick(int, int)
і onMouseRightClick(int, int).
Для виведення діалогового вікна використай метод showMessageDialog(Color, String, Color, int) класу Game.
Колір фону можна вибрати будь-який.


Requirements:
1. У класі MessageGame потрібно перевизначити метод onMouseLeftClick(int, int) батьківського класу Game.
2. У класі MessageGame потрібно перевизначити метод onMouseRightClick(int, int) батьківського класу Game.
3. Метод onMouseLeftClick(int, int) має відображати діалогове вікно згідно з умовою.
4. Метод onMouseRightClick(int, int) має відображати діалогове вікно згідно з умовою.
5. Метод showMessageDialog(Color, String, Color, int) класу Game не слід перевизначати в класі MessageGame.
*/

public class MessageGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        //напишіть тут ваш код

        showMessageDialog(Color.RED, "Ви виграли", Color.GREEN, 15);

    }

    @Override
    public void onMouseRightClick(int x, int y) {
        showMessageDialog(Color.GREEN, "Ви програли", Color.RED, 15);
    }
}
