package ua.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Усе відносне
Напиши програму, яка зчитує з клавіатури два шляхи й виводить у консоль відносний шлях між цими шляхами,
якщо він існує. В іншому випадку нічого виводити не потрібно.

Підказка: якщо не вдалося знайти відносний шлях між шлях1 і шлях2, спробуй знайти відносний шлях між шлях2 і шлях1.


Requirements:
1. Програма має зчитувати з консолі два шляхи.
2. Програма має виводити в консоль відносний шлях між уведеними шляхами, якщо він існує.
3. Для обчислення відносного шляху слід використати метод relativize() класу Path.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишіть тут ваш код
        Path path1= Path.of(str1);
        Path path2= Path.of(str2);
        try {
            System.out.println(path1.relativize(path2));
        } catch (Exception e) {
            try {
                System.out.println(path2.relativize(path1));
            } catch (Exception ignore) {

            }
        }
       
    }
}

