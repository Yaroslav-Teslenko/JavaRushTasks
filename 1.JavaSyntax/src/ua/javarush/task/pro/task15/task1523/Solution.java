package ua.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Отримання інформації через API
Твоє завдання — звернутися до публічного API в інтернеті: надіслати й отримати дані.
Напиши програму, яка звертається за посиланням до публічного API в інтернеті, надсилає туди дані, отримує дані у відповідь і виводить їх на екран.

Підказки:

Використай метод openConnection() класу URL.
Використай методи setDoOutput(true) і getOutputStream() класу URLConnection.
Якщо ти не знаєш, який API можна використати, скористайся цим: http://httpbin.org/post

Requirements:
1. Програма має виводити отриману інформацію на екран.
2. Програма має містити виклик методу openConnection() класу URL.
3. Програма має містити виклики методів setDoOutput(true), getOutputStream() і getInputStream() класу URLConnection.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output)) {
            sender.println("Привіт");
        }

        try (InputStream input = connection.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}

