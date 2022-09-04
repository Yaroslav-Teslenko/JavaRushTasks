package ua.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Проста програма
А тепер навчимося фарбувати клітини й виводити в них текст. Потрібно вивести слово JAVARUSH.
Спочатку перевизнач метод initialize() класу Game і задай у ньому розмір поля (8x3).
Відтак за допомогою методу setCellValueEx(int, int, Color, String) виведи слово в одну лінію. Цей метод зафарбовує клітину й виводить у неї текст за вказаними координатами.
Кожна літера в лінії має бути розташована в окремій клітині. Координати першої літери: x = 0, y = 1. Колір клітини — помаранчевий (Color.ORANGE).

Requirements:
1. У класі SymbolGame потрібно перевизначити метод initialize().
2. У методі initialize() потрібно викликати метод setScreenSize(int, int) з аргументами 8 і 3.
3. У методі initialize() за допомогою викликів методу setCellValueEx(int, int, Color, String) виведи слово JAVARUSH,
    кожну літеру — в окремій клітині (потрібно викликати метод для кожної літери).
4. Метод setScreenSize(int, int) потрібно викликати перед викликом методу setCellValueEx(int, int, Color, String).
*/

public class SymbolGame extends Game {

    //напишіть тут ваш код

    @Override
    public void initialize() {
      setScreenSize(8,3);
//        for (int i = 0; i < "JAVARUSH".toCharArray().length; i++) {
//            setCellValueEx(i,1, Color.ORANGE,""+ "JAVARUSH".charAt(i));
//        }
        setCellValueEx(0, 1, Color.ORANGE, "J");
        setCellValueEx(1, 1, Color.ORANGE, "A");
        setCellValueEx(2, 1, Color.ORANGE, "V");
        setCellValueEx(3, 1, Color.ORANGE, "A");
        setCellValueEx(4, 1, Color.ORANGE, "R");
        setCellValueEx(5, 1, Color.ORANGE, "U");
        setCellValueEx(6, 1, Color.ORANGE, "S");
        setCellValueEx(7, 1, Color.ORANGE, "H");
    }
}
