package ua.javarush.games.minigames.mini11;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

//Перед тобою клас FillGame. У методі initialize() задається поле розміром 5x5 і викликається
// метод fill(), який зафарбовує всі клітини білим кольором. Тобі потрібно в класі
// FillOrangeGame перевизначити метод fill(), який має зафарбовувати все поле помаранчевим кольором.
//
//
//Requirements:
//1. Метод initialize() класу FillGame не змінювати.
//2. У класі FillGame метод fill() має зафарбовувати поле білим кольором.
//3. Клас FillOrangeGame має бути спадкоємцем класу FillGame.
//4. У класі FillOrangeGame перевизначений метод fill() класу FillGame має зафарбовувати все поле помаранчевим кольором.
public class FillGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(5,5);
        fill();
    }

    public void fill() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

}
