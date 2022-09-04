package hexlet.code.games;

import hexlet.code.Engine;

public class GameProgression {
    public static void play() {
        String userName = Engine.getUserName();
        System.out.println("What number is missing in the progression?");
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
        final int maxStartNumber = 20;
        final int minQuantityOfNumbers = 5;
        final int randQuantityOfNumbers = 5;
        final int increment = Engine.getRandom(10);
        int firstNumber = Engine.getRandom(maxStartNumber);
        int quantityOfNumbers = minQuantityOfNumbers + Engine.getRandom(randQuantityOfNumbers);
        int positionOfHiddenNumber = Engine.getRandom(quantityOfNumbers);
        int goodAnswer = firstNumber + ((positionOfHiddenNumber - 1) * increment);
        System.out.print("Question: ");
        for (int i = 1; i <= quantityOfNumbers; i++) {
            System.out.print((i == positionOfHiddenNumber) ? (".. ") : (firstNumber + (i - 1) * increment) + " ");
        }
        System.out.println();
        return goodAnswer + "";
    }
}
