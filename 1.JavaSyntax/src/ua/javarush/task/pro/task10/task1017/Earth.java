package ua.javarush.task.pro.task10.task1017;

/* 
Створення материків
Як відомо, на планеті Земля є 6 материків. Створи для кожного материка власний клас.
У кожному класі має бути поле, що зберігає площу відповідного материка.
Площу материка потрібно вказувати під час його створення, і вона має бути незмінюваною.
Щоб задати площу материків, ти можеш використовувати будь-які числа.


Requirements:
1. В окремих файлах створи публічні класи Africa, Antarctica, Australia, Eurasia, NorthAmerica, SouthAmerica.
2. Кожен зі створених класів має містити поле private final int area.
3. Кожен зі створених класів має містити публічний конструктор з аргументом типу int, який ініціалізуватиме поле area.
4. У методі main класу Earth створи 6 різних материків і передай у них значення площі.
*/

public class Earth {


    public static void main(String[] args) {
        Africa africa= new Africa(1);
        Antarctica antarctica=new Antarctica(2);
        Australia australia=new Australia(3);
        Eurasia eurasia=new Eurasia(4);
        NorthAmerica northAmerica=new NorthAmerica(5);
        SouthAmerica southAmerica=new SouthAmerica(6);
        //напишіть тут ваш код
    }
}
