package ua.javarush.task.pro.task09.task0914;

/* 
Оновлення шляху
Реалізуй метод changePath(String, String) так, щоб він заміняв версію jdk у шляху, отриманому як
перший параметр методу, на версію, отриману як другий параметр, і повертав новий шлях.
Версія jdk починається з рядка "jdk" і закінчується символом "/".

Приклад:
шлях — "/usr/java/jdk1.8/bin"
версія jdk — "jdk-13"

Метод changePath(шлях, версія jdk) має повернути шлях — "/usr/java/jdk-13/bin".
Метод main() у тестуванні не використовується.


Requirements:
1. Потрібно реалізувати метод changePath(String, String) згідно з умовою.
*/

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишіть тут ваш код
        int index = path.indexOf("/jdk");
        int index2 = path.indexOf("/", index + 2);
       return path.substring(0, index +1)+jdk+path.substring(index2);
       
       /*
         int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);

        return path.replace(oldJdk, jdk);
        */
    }
}
