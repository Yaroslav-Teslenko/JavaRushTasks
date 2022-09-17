package ua.javarush.task.pro.task18.task1820;

import java.util.Optional;
import java.util.stream.Stream;

/* 
Найдорожча автівка
Автомобіль, представлений класом Car, має дві характеристики: назву — поле name і ціну — поле price.
У класі Solution виконуються дві операції пошуку:

метод getMostExpensiveCar(Stream<Car>) шукає найдорожчий автомобіль в одному списку;

метод getMoreExpensiveCar(Stream<Car>, Car) в іншому списку шукає автомобіль дорожчий, ніж отриманий у методі
getMostExpensiveCar(Stream<Car>).

Методи повертають не сам автомобіль (об'єкт типу Car), а об'єкт типу Optional<Car>.
Підказка:
Для пошуку елемента з максимальним шуканим значенням у потоці даних використовуй метод max(),
а щоб знайти перший-ліпший відповідний елемент із потоку відфільтрованих даних, використовуй метод findFirst().

Метод main() під час тестування не перевіряється.


Requirements:
1. У публічному статичному методі getMostExpensiveCar(Stream<Car>) потрібно викликати метод max() об'єкта типу Stream<Car>.
2. У публічному статичному методі getMoreExpensiveCar(Stream<Car>, Car) потрібно викликати метод findFirst() об'єкта типу Stream<Car>.
3. Метод getMostExpensiveCar(Stream<Car>) потрібно реалізувати згідно з умовою.
4. Метод getMoreExpensiveCar(Stream<Car>, Car) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car("X5", 110_000),
                new Car("X3", 54_000),
                new Car("X7", 143_000),
                new Car("X6", 125_000)
        );

        Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);

        Optional<Car> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
        moreExpensiveCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getMostExpensiveCar(Stream<Car> cars) {
        //напишіть тут ваш код
        return cars.max((c1,c2)->c1.getPrice().compareTo(c2.getPrice()));
    }

    public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars, Car mostExpensiveCar) {
        //напишіть тут ваш код
      // return cars.findFirst(c1-> (c1.getPrice() <mostExpensiveCar.getPrice()));
        return cars.filter(car -> car.getPrice() > mostExpensiveCar.getPrice()).findFirst();
        //return Optional.empty();
    }
}

class Car {
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобіль " + name + ", ціна - " + price + " USD";
    }
}
