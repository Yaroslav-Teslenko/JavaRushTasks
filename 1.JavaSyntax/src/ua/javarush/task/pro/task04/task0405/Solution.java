package ua.javarush.task.pro.task04.task0405;

/* 
Незаповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int i = 0, j = 1;
        while (i < 10) {
            System.out.print("Б");
            while (j < 19) {
                if(i==0 || i==9) {
                    System.out.print("Б");
                }else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("Б");
            i++;
            j=1;
        }
    }
}