package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;
import com.javarush.engine.cell.Color;
import javafx.scene.text.Font;


import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final Font font = new Font("Arial", 48);
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private int countFlags;
    private static final String MINE ="\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private boolean isGameStopped;
    private int countClosedTiles = SIDE * SIDE;
    private int score;

    @Override
    public void initialize() {

        setScreenSize(SIDE, SIDE);
        createGame();
        System.out.println("Ok");

    }


    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
        } else {
            openTile(x, y);
        }
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
                setCellValue(x, y, "");


            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                GameObject gameObject = gameField[y][x];
                if (!gameObject.isMine) {
                    for (GameObject neighbor : getNeighbors(gameObject)) {
                        if (neighbor.isMine) {
                            gameObject.countMineNeighbors++;
                        }
                    }
                }
                System.out.println(gameObject);
            }
        }
    }

    private void openTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        if (isGameStopped || gameObject.isOpen || gameObject.isFlag) return;
        gameObject.isOpen = true;
        countClosedTiles--;
        setCellColor(x, y, Color.GREEN);
        if (gameObject.isMine) {

            setCellValueEx(gameObject.x, gameObject.y, Color.RED, MINE, Color.BLACK, 26);

            gameOver();
            return;
        } else if (gameObject.countMineNeighbors == 0) {
            setCellValue(gameObject.x, gameObject.y, "");
            List<GameObject> neighbors = getNeighbors(gameObject);
            for (GameObject neighbor : neighbors) {
                if (!neighbor.isOpen) {
                    openTile(neighbor.x, neighbor.y);

                }
            }
        } else {
            setCellNumber(x, y, gameObject.countMineNeighbors);
        }
        score += 5;
        setScore(score);
        if (countClosedTiles == countMinesOnField) win();
    }

    private void markTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        if (isGameStopped) return;
        if (gameObject.isOpen || countFlags == 0 && !gameObject.isFlag) return;
        if (gameObject.isFlag) {
            gameObject.isFlag = false;
            setCellValue(gameObject.x, gameObject.y, "");
            setCellColor(gameObject.x, gameObject.y, Color.ORANGE);
            countFlags++;
        } else {
            gameObject.isFlag = true;
            setCellValue(gameObject.x, gameObject.y, FLAG);
            setCellColor(gameObject.x, gameObject.y, Color.YELLOW);
            countFlags--;
        }
    }

    private void gameOver() {
        isGameStopped = true;
        //public void showMessageDialog(com.javarush.engine.cell.Color cellColor, String message, com.javarush.engine.cell.Color textColor, int textSize)
        showMessageDialog(Color.RED, "Game over", Color.BLACK, 50);
    }

    private void win() {
        isGameStopped = true;

        showMessageDialog(Color.GREEN, "You win", Color.BLACK, 50);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private void restart() {
        isGameStopped = false;


        countClosedTiles = SIDE * SIDE;
        score = 0;

        countMinesOnField = 0;
        setScore(score);
        createGame();
    }
}