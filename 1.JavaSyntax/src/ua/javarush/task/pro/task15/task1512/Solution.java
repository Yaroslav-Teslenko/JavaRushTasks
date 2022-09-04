package ua.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Назворот
У цій задачі необхідно перевернути рядок і вивести його на екран у зворотному порядку за допомогою PrintStream. Метод printSomething(String) виводить у поле stream переданий рядок. Необхідно перевернути рядок і вивести його у зворотному порядку за допомогою PrintStream.
Метод main(String[] args) зчитує рядок з клавіатури й передає його в метод printSomething(String), який записує отриманий рядок у потік stream.
Твоє завдання: у методі main(String[]) перевернути переданий рядок за допомогою поля outputStream (тобто поле outputStream має зберігати рядок у зворотному порядку) і вивести його в консоль.

Приклад:
Вхідні дані:
it's a text for testing
Виведено на екран:
gnitset rof txet a s'ti

Метод printSomething(String) не змінюй.


Requirements:
1. Програма має використовувати метод printSomething().
2. Програма має виводити в консоль у зворотному порядку рядок, переданий у метод main(String[]).
3. Щоб перевернути рядок, потрібно використати поле outputStream згідно з умовою.
4. Метод printSomething(String) змінювати не можна.
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        outputStream.reset();
        StringBuilder stringBuilder = new StringBuilder(result);
        String reverse = stringBuilder.reverse().toString();
        printSomething(reverse);
        System.out.println(outputStream);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}