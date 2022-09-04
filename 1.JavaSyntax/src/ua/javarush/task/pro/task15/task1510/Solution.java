package ua.javarush.task.pro.task15.task1510;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишемо байти у файл
Аміго отримав завдання: записати байти у файл. Він написав програму, яка зчитує з консолі шлях до файлу і записує в цей файл послідовність байтів, отриману з аргументу методу main(String[]). Але він припустився помилки в коді програми.
Як тобі відомо, BufferedWriter «не працює» з байтами: для запису байтів у файл потрібно використовувати метод write(Path, byte[]) класу Files.
Щоб отримати Path, можна скористатися статичним методом Path.of(), в який потрібно передати шлях до файлу, зчитаний з консолі. Цей код має такий вигляд: Path.of(scanner.nextLine()). Допоможи Аміго виправити програму.


Requirements:
1. Програма має зчитувати з консолі шлях до файлу.
2. Програма має записувати байти у файл.
3. Для запису байтів у файл потрібно використати метод write(Path, byte[]) класу Files.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        Scanner scanner = new Scanner(System.in);
        Files.write(Path.of(scanner.nextLine()), bytes);
    }
}

