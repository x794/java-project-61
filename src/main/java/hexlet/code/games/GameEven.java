package hexlet.code.games;

import hexlet.code.Engine;

public class GameEven {
    public static String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    // ask user the question, but not take user answer!!! Return good answer
    public static boolean getRound() {
        // compute game parameters
        final int minNumber = 1;
        final int maxNumber = 100;
        int number = Engine.getRandom(minNumber, maxNumber);

        // show question
        System.out.println("Question: " + number);

        // compute goodAnswer
        String goodAnswer = "no";
        if (number % 2 == 0) {
            goodAnswer = "yes";
        }

        // get userAnswer and compare it to goodAnswer
        return Engine.testAnswer(goodAnswer);
    }
}
