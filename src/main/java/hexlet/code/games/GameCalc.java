package hexlet.code.games;

import hexlet.code.Engine;

public class GameCalc {
    public static void play() {
        String userName = Engine.getUserName();
        System.out.println("What is the result of the expression?");
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
        final int maxNumber = 20;
        final int quantityOfOperations = 3;
        int number1 = Engine.getRandom(maxNumber);
        int number2 = Engine.getRandom(maxNumber);
        int typeOfOperation = Engine.getRandom(quantityOfOperations);
        String goodAnswer;
        switch (typeOfOperation) {
            case 0:
                System.out.println("Question: " + number1 + " + " + number2);
                goodAnswer = (number1 + number2) + "";
                break;
            case 1:
                System.out.println("Question: " + number1 + " - " + number2);
                goodAnswer = (number1 - number2) + "";
                break;
            case 2:
                System.out.println("Question: " + number1 + " * " + number2);
                goodAnswer = (number1 * number2) + "";
                break;
            default:
                System.out.println(" WRONG OPERATION " + number1 + " " + typeOfOperation + " " + number2);
                goodAnswer = " WRONG OPERATION ";
        }
        return goodAnswer;
    }
}
