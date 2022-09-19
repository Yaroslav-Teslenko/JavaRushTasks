package ua.javarush.games.minigames.mini09;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Таймер
У методі initialize() установлюються розмір поля 3x3 і таймер на оновлення поля щосекунди (1 кадр за секунду).
Тобі потрібно перевизначити й реалізувати метод onTurn(int), який має посеред поля (x = 1, y = 1)
виводити змінну step.
Якщо step має парне значення, слід зафарбовувати все поле зеленим кольором, інакше — помаранчевим.


Requirements:
1. У класі TimerGame потрібно перевизначити метод onTurn(int) батьківського класу Game.
2. У методі onTurn(int) потрібно виводити в центрі поля передане значення за допомогою методу setCellNumber(int, int, int).
3. Метод onTurn(int) має зафарбовувати все поле зеленим кольором, якщо переданий аргумент — парне число.
4. Метод onTurn(int) має зафарбовувати все поле помаранчевим кольором, якщо переданий аргумент — непарне числ
*/

public class TimerGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    @Override
    public void onTurn(int step) {
        setCellNumber(1,1, step );
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, step % 2 == 0 ? Color.GREEN : Color.ORANGE);
            }
        }
    }
//напишіть тут ваш код
}
