package hexlet.code.games;

import hexlet.code.Engine;

public class GameEven {
    public static void play() {
        String userName = Engine.getUserName();
        System.out.println("Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.");
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
    private static boolean makeRound() {
        String goodAnswer = makeQuestion();
        String userAnswer = Engine.getUserAnswer();
        return Engine.testAnswer(userAnswer, goodAnswer);
    }

    // make question, ask user, return good answer, not take user answer!!!
    private static String makeQuestion() {
        final int maxNumber = 100;
        int number = Engine.getRandom(maxNumber);
        System.out.println("Question: " + number);
        String goodAnswer = "no";
        if (number % 2 == 0) {
            goodAnswer = "yes";
        }
        return goodAnswer;
    }
}
