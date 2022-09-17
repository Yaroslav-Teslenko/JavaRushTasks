package ua.javarush.task.pro.task17.task1708;

/* 
Мінімальне й максимальне
У цій задачі тобі потрібно створити універсальний інструмент для пошуку мінімальних і максимальних чисел.
У класі MinMaxUtil створи публічні статичні методи min() і max(), які отримують як аргументи цілочислові
значення (тип int) і повертають відповідно мінімальне й максимальне з отриманих чисел.

Кожен із методів потрібно перевантажити, щоб створити можливість викликати метод із двома, трьома, чотирма і п'ятьма параметрами.
Загалом необхідно створити 8 методів — 4 для min() і 4 для max().
Усі аргументи методів мають бути типу int.


Requirements:
1. У класі MinMaxUtil має бути створено 4 перевантажених методи min() відповідно до умови задачі.
2. У класі MinMaxUtil має бути створено 4 перевантажених методи max() відповідно до умови задачі.
3. Методи min() мають повертати мінімальне з переданих чисел.
4. Методи max() мають повертати максимальне з переданих чисел.
*/

public class MinMaxUtil {
    //напишіть тут ваш код
    public static int min(int a,int b){return Math.min(a,b);}
    public static int min(int a, int b, int c){return  min(min(a,b),  c);}
    public static int min(int a, int b, int c, int d){return  min( min(a,b), min(c,d));}
    public static int min(int a, int b, int c, int d,int e){return min(min(a,b,c,d),e);}

    public static int max(int a,int b){return Math.max(a,b);}
    public static int max(int a, int b, int c){return  max(max(a,b),  c);}
    public static int max(int a, int b, int c, int d){return  max( max(a,b), max(c,d));}
    public static int max(int a, int b, int c, int d,int e){return max(max(a,b,c,d),e);}
}
