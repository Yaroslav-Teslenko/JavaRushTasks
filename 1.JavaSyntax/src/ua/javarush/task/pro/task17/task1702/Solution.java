package ua.javarush.task.pro.task17.task1702;

/* 
Геометрія для чайників
Класи Triangle, Rectangle і Circle — це геометричні фігури, тому їх успадковано від класу Shape.
Перевизнач у них метод printInfo(), щоб він виводив у консоль назву певної фігури:
для Triangle — "Трикутник";
для Rectangle — "Прямокутник";
для Circle — "Круг".

Метод main() у тестуванні не використовується.


Requirements:
1. Клас Shape не змінюй.
2. Класи геометричних фігур мають успадковуватися від класу Shape.
3. У класах геометричних фігур потрібно перевизначити метод printInfo().
4. Виклик методу printInfo() для об'єкта геометричної фігури має виводити в консоль її назву.
*/

public class Solution {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        shape.printInfo();
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
