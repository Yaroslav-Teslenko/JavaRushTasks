package ua.javarush.task.pro.task13.task1322;

//Типи багатокутників
//У класі Solution є метод getShapeNameByCountOfCorners(int), який повертає назву багатокутника залежно від кількості
// кутів. Твоє завдання — переписати метод, використовуючи тільки оператор switch.
public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;
        switch (countOfCorner) {
            case 3:
                shape = "Трикутник"; break;
            case 4:
                shape = "Чотирикутник";break;
            case 5:
                shape = "П'ятикутник";break;
            case 6:
                shape = "Шестикутник";break;
            case 7:
                shape = "Семикутник";break;
            case 8:
                shape = "Восьмикутник";break;
            default:
                shape = "Інша фігура";break;
        }
        return shape;

    }
}
