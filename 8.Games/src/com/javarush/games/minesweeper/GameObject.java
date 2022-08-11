package com.javarush.games.minesweeper;

/**
 * @author devonlain
 * @link
 */
public class GameObject {
    public int x;
    public int y;
    public boolean isMine;
    public int countMineNeighbors;
    public boolean isFlag;
    public boolean isOpen;

    public GameObject(int x, int y, boolean isMine) {
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }

    @Override
    public String toString() {
        return "GameObject{" +
                "x=" + x +
                ", y=" + y +
                ", isMine=" + isMine +
                ", countMineNeighbors=" + countMineNeighbors +
                '}';
    }
}
