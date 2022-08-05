package ua.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Видаляємо однакові рядки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишіть тут ваш код  Scanner cons = new Scanner(System.in);
        //        int N = cons.nextInt();
        //        array = new int[N];
        //        int min = array[0]=cons.nextInt();
        //        for (int i = 1; i < N; i++) {
        //            array[i] = cons.nextInt();
        //            if (array[i] > min) {
        //                min = array[i];
        //            }
        //        }
        //        System.out.println(min);
        Scanner cons = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = cons.nextLine();
        }
        for (int i = 0; i < strings.length - 2; i++) {
            String tmp = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j]!=null && strings[j].equals(tmp)) {
                    strings[i] = null;
                    strings[j] = null;
                }

            }

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
