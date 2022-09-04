package ua.javarush.task.pro.task15.task1506;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
Напиши програму, яка зчитує з консолі ім'я текстового файлу, далі читає символи з цього файлу
 (використай метод readAllLines(Path) класу Files) і виводить на екран усе, крім крапок, ком і пробілів.


Requirements:
1. Програма має зчитувати з консолі шлях до файлу.
2. Програма має вивести в консоль вміст файлу згідно з умовою.
3. Для читання рядків із файлу слід використати метод readAllLines(Path) класу Files.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            lines.forEach(str -> {
                char[] chars = str.toCharArray();
                for (char character : chars) {
                    if (character != ' ' && character != '.' && character != ',') {
                        System.out.print(character);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

