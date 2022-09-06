package hexlet.code.games;

import hexlet.code.Engine;

public class GameGCD {
    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static boolean getRound() {
        // compute game parameters
        final int minNumber = 1;
        final int maxNumber = 100;
        int number1 = Engine.getRandom(minNumber, maxNumber);
        int number2 = Engine.getRandom(minNumber, maxNumber);

        // show question
        System.out.println("Question: " + number1 + " " + number2);

        // compute goodAnswer
        String goodAnswer =  getGCD(number1, number2);

        // get userAnswer and compare it to goodAnswer
        return Engine.testAnswer(goodAnswer);
    }

    // return symbol of random operation
    private static String getGCD(int number1, int number2) {
        int minOfNumber = Math.min(number1, number2);
        for (int i = minOfNumber; i > 1; i--) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                return i + "";
            }
        }
        return "1";
    }
}
