package ua.javarush.task.pro.task13.task1316;

//В enum JavarushQuest зберігається список квестів. Твоє завдання — отримати масив усіх елементів у методі main
// (скористайся методом values()) і вивести порядковий номер кожного елемента (скористайся методом ordinal()) з нового рядка.
//
//
//Requirements:
//1. У методі main отримай список усіх констант із переліку enum JavarushQuest за допомогою методу values().
//2. У методі main виведи порядковий номер кожного елемента з нового рядка за допомогою методу ordinal().
public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        for (JavarushQuest value : JavarushQuest.values()) {
            System.out.println(value.ordinal());
        }
    }
}
