package ua.javarush.task.pro.task04.task0407;

/* 
Сума чисел, не кратних 3
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        int i = 0;
        int sum = 0;
        while(i<100){
            i++;
            if (i%3==0){continue;}
           // System.out.print(i);
            sum=sum+i;
        }
        System.out.println(sum);
    }
}