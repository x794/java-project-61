package hexlet.code;

import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrime;

import java.util.Scanner;

public class Engine {
    //return message of wrong choice or call playGame(int game) for selected game
    public static String getGame(String game) {
        return switch (game) {
            case "0" -> "";
            case "1" -> Cli.greet();               // greeting
            case "2", "3", "4", "5", "6" -> getGame(game.charAt(0));
            default -> ("There is no game " + game + " here");
        };
    }

    // show special rules and play common rounds
    public static String getGame(char game) {
        String userName = getUserName();           // greeting
        System.out.println(getRules(game));

        final int roundNumber = 3;
        for (int i = 0; i < roundNumber; i++) {
            if (!getRound(game)) {
                return ("Let's try again, " + userName);
            }
        }
        return ("Congratulations, " + userName + "!");
    }

    private static String getRules(char game) {
        return switch (game) {
            case '2' -> GameEven.getRules();
            case '3' -> GameCalc.getRules();
            case '4' -> GameGCD.getRules();
            case '5' -> GameProgression.getRules();
            case '6' -> GamePrime.getRules();
            default -> "There is no rules for game " + game + " here";
        };
    }

    // pull user answer for question by selected game, match it to good answer and return result of common test
    private static boolean getRound(char game) {
        return switch (game) {
            case '2' -> GameEven.getRound();
            case '3' -> GameCalc.getRound();
            case '4' -> GameGCD.getRound();
            case '5' -> GameProgression.getRound();
            case '6' -> GamePrime.getRound();
            default -> false;
        };
    }

    // make greeting and return username
    public static String getUserName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    // return random int from min inclusive to max inclusive
    public static int getRandom(int min, int max) {
        return (int) (Math.random() * max + min);
    }

    // show common answer invite and return user answer
    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    // test if user answer equal to good answer, show result and return result
    public static boolean testAnswer(String goodAnswer) {
        String userAnswer = getUserAnswer();
        if (userAnswer.equals(goodAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                + "Correct answer was '" + goodAnswer + "'.");
        return false;
    }
}
