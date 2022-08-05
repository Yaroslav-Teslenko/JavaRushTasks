package ua.javarush.task.pro.task05.task0512;

/* 
Створюємо мультимасив
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //Створюємо мультимасив
        //У методі main(String[]) виведи на екран усі числа з тривимірного масиву multiArray.

        //1. У класі Solution має бути публічна статична змінна multiArray типу int[][][].
        //2. У методі main(String[]) виведи на екран усі числа з multiArray.
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k]+" ");
                }

            }
        }
    }
}
