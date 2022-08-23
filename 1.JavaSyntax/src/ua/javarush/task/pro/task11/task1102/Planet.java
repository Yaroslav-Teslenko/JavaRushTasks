package ua.javarush.task.pro.task11.task1102;

/* 
Земля: технічна характеристика
*/

public class Planet {

    public String name;

    public  long age;

    public int speed;

    public  int area;

    public void printInformation() {
        System.out.println("Ім'я планети: " + this.name + ".");
        System.out.println("Вік: " + this.age + " років.");
        System.out.println("Орбітальна швидкість: " + this.speed + " км/год.");
        System.out.println("Загальна площа: " + this.area + " кв. км.");
    }
}
