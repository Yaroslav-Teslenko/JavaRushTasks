package ua.javarush.task.pro.task09.task0912;

/* 
Перевірка URL-адреси
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.com.ua", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("URL-адреса " + url + " містить мережевий протокол " + protocol + " і домен " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишіть тут ваш код
        String[] tmp = url.split(":");
        if (tmp[0].equals("http") || tmp[0].equals("https")) return tmp[0];
        return "невідомий";
    }

    public static String checkDomain(String url) {
        //напишіть тут ваш код
        String[] tmp = url.split("\\.");
       switch (tmp[tmp.length-1]){
           case "com", "net", "org" , "ua":return tmp[tmp.length-1];
       }
        return "невідомий";

    }
}
