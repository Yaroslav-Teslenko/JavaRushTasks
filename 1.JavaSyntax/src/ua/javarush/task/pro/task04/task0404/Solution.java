package ua.javarush.task.pro.task04.task0404;

/* 
Заповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int i = 0, j = 0;
        while (i < 5) {
            while (j < 9) {
                System.out.print("Q");
                j++;
            }
            System.out.println("Q");
            i++;
            j=0;
        }
    }
}