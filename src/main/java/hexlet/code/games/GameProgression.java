package hexlet.code.games;

import hexlet.code.Engine;

public class GameProgression {
    public static String getRules() {
        return "What number is missing in the progression?";
    }

    public static boolean getRound() {
        // compute game parameters
        final int minFirstNumber = 1;
        final int maxFirstNumber = 20;
        int firstNumber = Engine.getRandom(minFirstNumber, maxFirstNumber);

        final int minIncrement = 1;
        final int maxIncrement = 9;
        int increment = Engine.getRandom(minIncrement, maxIncrement);

        final int minQuantityOfNumbers = 5;
        final int maxQuantityOfNumbers = 10;
        int quantityOfNumbers = Engine.getRandom(minQuantityOfNumbers, maxQuantityOfNumbers);

        int positionOfHiddenNumber = Engine.getRandom(1, quantityOfNumbers);

        // show question
        System.out.print("Question: ");
        for (int i = 1; i <= quantityOfNumbers; i++) {
            System.out.print((i == positionOfHiddenNumber) ? (".. ") : (firstNumber + (i - 1) * increment) + " ");
        }
        System.out.println();

        // compute goodAnswer
        int goodAnswer = firstNumber + ((positionOfHiddenNumber - 1) * increment);

        // get userAnswer and compare it to goodAnswer
        return Engine.testAnswer(goodAnswer + "");
    }
}
