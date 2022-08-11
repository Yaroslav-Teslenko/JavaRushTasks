package ua.javarush.task.pro.task08.task0809;

/* 
Counter
У класі Solution реалізуй метод printNumbers(), який виводить числа від 1 до 10
включно з інтервалом 1,3 мілісекунди між виведенням кожного числа. У цьому тобі допоможе метод
sleep(long, int) класу Thread, який має спрацювати 9 разів..


Requirements:
1. Реалізуй метод printNumbers() згідно з умовою.
*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        //напишіть тут ваш код
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if(i<10)
            Thread.sleep(1,300_000);
        }
    }
}
