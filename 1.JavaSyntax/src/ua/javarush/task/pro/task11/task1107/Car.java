package ua.javarush.task.pro.task11.task1107;

/* 
Двигун — серце автомобіля
Двигун — це складний механізм, який неможливо описати за допомогою звичайної змінної.
У класі Car створи внутрішній клас (inner class) Engine. У класі Engine створи поле isRunning типу boolean, яке
набуватиме значення true, коли двигун запущено, і false в іншому випадку. Крім того, додай у цей клас методи start і
stop, які будуть запускати й зупиняти двигун (встановлювати відповідне значення поля isRunning).
Щоб використовувати двигун, створи поле engine типу Engine у класі Car.


Requirements:
1. У класі Car потрібно створити внутрішній клас (inner class) Engine.
2. У класі Engine має бути приватне поле isRunning типу boolean.
3. У класі Engine має бути публічний метод void start, який присвоює значення true полю isRunning.
4. У класі Engine має бути публічний метод void stop, який присвоює значення false полю isRunning.
5. У класі Car має бути поле engine типу Engine.
*/

public class Car {
    //напишіть тут ваш код
    Engine engine;
    public class Engine {
        private boolean isRunning;

        public void start() {
            this.isRunning = true;
        }
        public void stop() {
            this.isRunning = false;
        }
    }
}