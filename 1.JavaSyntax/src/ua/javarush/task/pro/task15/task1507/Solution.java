package ua.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаємо не всіх
Напиши програму, яка зчитує з консолі ім'я текстового файлу, далі читає рядки з цього файлу
(використай метод readAllLines(Path) класу Files) і виводить їх на екран через один, починаючи з першого.


Requirements:
1. Програма має зчитувати з консолі шлях до файлу.
2. Програма має вивести в консоль вміст файлу згідно з умовою.
3. Для читання рядків із файлу слід використати метод readAllLines(Path) класу Files.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));

        for (int i = 0; i < lines.size(); i += 2) {
            System.out.println(lines.get(i));
        }
    }
}

