package ua.javarush.task.pro.task08.task0817;
/*
* Виправ метод main() так, щоб він виводив у консоль число 20.
У методі можна змінювати лише постінкремент на преінкремент і навпаки, а також постдекремент на предекремент і навпаки.


Requirements:
1. Виправ метод main() згідно з умовою.*/
public class Solution {

    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}