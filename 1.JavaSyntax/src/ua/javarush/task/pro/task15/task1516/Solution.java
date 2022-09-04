package ua.javarush.task.pro.task15.task1516;

import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл чи директорія
Напиши програму, яка зчитує рядки з клавіатури та виводить у консоль такі повідомлення: якщо введений
рядок є шляхом до існуючого файлу "<уведений рядок> - це файл".
Якщо введений рядок є шляхом до існуючої директорії "<уведений рядок> - це директорія".
Якщо рядок не є шляхом до файлу чи директорії, програма завершується. Кутові дужки та лапки виводити не потрібно.
Для перевірки наявності файлів і директорій використовуй методи isRegularFile() і isDirectory() класу Files.

Приклад виведення:
C:\javarush\text.txt - це файл
C:\javarush\ - це директорія


Requirements:
1. Програма має зчитувати з клавіатури шляхи до файлів або директорій доти, доки не буде введено неправильний шлях.
2. Програма має виводити в консоль повідомлення про введений шлях згідно з умовою.
3. Для перевірки наявності файлів і директорій слід використовувати методи isRegularFile() і isDirectory() класу Files.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        while (true) {
           Path path=Path.of(scanner.nextLine());

            if (Files.isRegularFile(path)){
                System.out.println(path+THIS_IS_FILE);
                continue;
            }
            if (Files.isDirectory(path)){
                System.out.println(path+THIS_IS_DIR);
                continue;
            }
            break;
        }

    }
}

