package ua.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Безперечно";
    private static final String DEFINITELY = "Безумовно, так";
    private static final String MOST_LIKELY = "Найймовірніше";
    private static final String OUTLOOK_GOOD = "Хороші перспективи";
    private static final String ASK_AGAIN_LATER = "Запитай пізніше";
    private static final String TRY_AGAIN = "Спробуй ще";
    private static final String NO = "Моя відповідь — ні";
    private static final String VERY_DOUBTFUL = "Вельми сумнівно";

    public static String getPrediction() {
        //напишіть тут ваш код
        switch ( (new Random()).nextInt(8) ) {
            case 0:
                return CERTAIN;
            case 1:
                return DEFINITELY;
            case 2:
                return MOST_LIKELY;
            case 3:
                return OUTLOOK_GOOD;
            case 4:
                return ASK_AGAIN_LATER;
            case 5:
                return TRY_AGAIN;
            case 6:
                return NO;
            case 7:
                return VERY_DOUBTFUL;


        }

        return null;
    }
}
