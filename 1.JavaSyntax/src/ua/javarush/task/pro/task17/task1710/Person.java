package ua.javarush.task.pro.task17.task1710;

/* 
Від абстракції до реальності
Клас Person оголошено як абстрактний. Це означає, що ми не можемо створювати його екземпляри.
Перетвори цей клас на звичайний, допиши відсутню логіку, яка відповідає загальноприйнятим підходам до інкапсуляції:
гетери мають повертати, а сетери — встановлювати значення відповідних полів.


Requirements:
1. Клас Shape не повинен бути абстрактним.
2. Метод getName() має повертати значення поля name.
3. Метод setName(String) має присвоювати передане значення полю name.
4. Метод getAge() має повертати значення поля age.
5. Метод setAge(int) має присвоювати передане значення полю age
*/

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public  void setAge(int age){this.age=age;}
}
