package hexlet.code.games;

import hexlet.code.Engine;

public class GameCalc {
    public static String getRules() {
        return "What is the result of the expression?";
    }

    public static boolean getRound() {
        // compute game parameters
        final int minNumber = 1;
        final int maxNumber = 20;
        int operand1 = Engine.getRandom(minNumber, maxNumber);
        int operand2 = Engine.getRandom(minNumber, maxNumber);
        String operator = getRandomOperation();

        // show question
        System.out.println("Question: " + operand1 + " " + operator + " " + operand2);

        // compute goodAnswer
        String goodAnswer = switch (operator) {
            case "+" -> (operand1 + operand2) + "";
            case "-" -> (operand1 - operand2) + "";
            case "*" -> (operand1 * operand2) + "";
            default -> " WRONG OPERATION ";
        };

        // get userAnswer and compare it to goodAnswer
        return Engine.testAnswer(goodAnswer);
    }

    public static String getRandomOperation() {
        String[] operators = {"+", "-", "*"};
        return operators[Engine.getRandom(0, operators.length)];
    }
}
