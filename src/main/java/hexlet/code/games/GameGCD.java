package hexlet.code.games;

import hexlet.code.Engine;

public class GameGCD {
    public static void play() {
        String userName = Engine.getUserName();
        System.out.println("Find the greatest common divisor of given numbers.");
        final int roundNumber = 3;
        for (int i = 0; i < roundNumber; i++) {
            if (!makeRound()) {
                System.out.println("Let's try again, " + userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    // make round with user (ask, test, provide round result) and return round result
    // the same method for each game
    private static boolean makeRound() {
        String goodAnswer = makeQuestion();
        String userAnswer = Engine.getUserAnswer();
        return Engine.testAnswer(userAnswer, goodAnswer);
    }

    // make question, ask user and return good answer, not take user answer!!!
    private static String makeQuestion() {
        final int maxNumber = 100;
        int number1 = Engine.getRandom(maxNumber) + 1;
        int number2 = Engine.getRandom(maxNumber) + 1;
        System.out.println("Question: " + number1 + " " + number2);
        return getGCD(number1, number2);
    }

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
