package ua.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //Спробуймо поділити ящик кока-коли на кабінет програмістів. Для цього напишемо програму з такими умовами:
        //
        //Потрібно ввести з клавіатури два цілих числа. Перше число — кількість
        // банок кока-коли в ящику. Друге — кількість людей в кабінеті.
        //Вивести на екран результат ділення першого числа на друге.
        Scanner cons = new Scanner(System.in);
       int cntBottle=cons.nextInt();
       int cntPeople=cons.nextInt();
        System.out.println(1.0*cntBottle/cntPeople);
    }
}