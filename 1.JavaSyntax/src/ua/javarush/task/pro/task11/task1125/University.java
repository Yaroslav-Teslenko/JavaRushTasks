package ua.javarush.task.pro.task11.task1125;

/*
Складаємо список студентів
Метод main має додавати двох студентів у масив і виводити їхні імена в консоль за допомогою методу printStudents.
Зроби виправлення в методі main, щоб програма запрацювала.


Requirements:
1. Клас University має містити приватне нестатичне поле students типу String[] із модифікатором final, яке відразу ініціалізується.
2. Клас University має містити метод public void addStudent(String), який додає передане ім'я студента в список students.
3. Клас University має містити метод public void printStudents, який виводить імена всіх студентів у консоль.
4. Метод main має двічі викликати метод addStudent.
5. Метод main має викликати метод printStudents один раз.
*/

public class University {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : this.students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        University university=new University();
        //напишіть тут ваш код
        university.addStudent("Максим Федоренко");
        university.addStudent("Олег Кесарчук");
        university.printStudents();
    }
}