package hexlet.code.games;

import hexlet.code.Engine;

public class GamePrime {
    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static boolean getRound() {
        // compute game parameters
        final int minNumber = 1;
        final int maxNumber = 100;
        int number = Engine.getRandom(minNumber, maxNumber);

        // show question
        System.out.println("Question: " + number);

        // compute goodAnswer
        String goodAnswer = "no";
        if (isPrime(number)) {
            goodAnswer = "yes";
        }

        // get userAnswer and compare it to goodAnswer
        return Engine.testAnswer(goodAnswer);
    }

    private static boolean isPrime(int number) {
        int halfOfNumber = number / 2;
        for (int i = 2; i <= halfOfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
