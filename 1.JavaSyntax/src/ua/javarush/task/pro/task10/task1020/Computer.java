package ua.javarush.task.pro.task10.task1020;


//Спробуймо зібрати комп'ютер. У нас є класи: системний блок, монітор, клавіатура, миша.
// У класі комп'ютер створи в конструкторі об'єкти класів — складових комп'ютера.
//
//
//Requirements:
//1. В окремих файлах мають бути публічні класи Computer, Keyboard, Monitor, Mouse, SystemUnit.
//2. У конструкторі класу Computer потрібно створити 4 об'єкти різних "складових".
public class Computer {
    public Computer() {
        Keyboard keyboard=new Keyboard();
        Monitor monitor=new Monitor();
        Mouse mouse=new Mouse();
        SystemUnit systemUnit=new SystemUnit();
    }
}
