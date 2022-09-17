package ua.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Тимчасове збереження файлу
Напиши код, який зчитує з клавіатури посилання на файл в інтернеті, завантажує
його та зберігає в тимчасовому файлі.
Використай методи createTempFile(null, null) і write(Path, byte[])
класу Files, а також метод openStream() класу URL.


Requirements:
1. Програма має зчитувати з консолі посилання на файл в інтернеті (рядок).
2. Програма має завантажити файл за посиланням і зберегти його в тимчасовому файлі.
3. У програмі слід використати методи класів Files і URL згідно з умовою.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        InputStream input = url.openStream();

        Path tempFile = Files.createTempFile(null, null);
        Files.write(tempFile, input.readAllBytes());         //Выводим строку на экран

    }
}