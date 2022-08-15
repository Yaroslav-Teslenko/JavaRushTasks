package ua.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
За допомогою StringTokenizer розділи query на частини за роздільником delimiter.

Приклад:
getTokens("com.javarush.task.pro.task09.task0915", "\\.")
повертає масив рядків
{"com", "javarush", "task", "pro", "task09", "task0915"}

Hint: виришити задачу допоможе метод countTokens().


Requirements:
1. Метод getTokens(String, String) має використовувати клас StringTokenizer.
2. Метод getTokens(String, String) має повертати масив типу String, заповнений згідно з умовою задачі.
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream.";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишіть тут ваш код
        StringTokenizer tmpTokens=new StringTokenizer(query, delimiter);
        System.out.println(tmpTokens);
        String[] result= new String[tmpTokens.countTokens()];
        System.out.println(tmpTokens.countTokens());

//        for (int i=0; i <=tmpTokens.countTokens();  i++) {
//
//            result[i]=tmpTokens.nextToken();
//            System.out.println( result[i]);
//        }
//        return result;
        int i = 0;
        while (tmpTokens.hasMoreTokens()) {
            result[i++] = tmpTokens.nextToken();
        }
        return result;
    }

}
