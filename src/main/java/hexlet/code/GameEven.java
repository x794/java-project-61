package hexlet.code;

import java.util.Scanner;

public class GameEven {
    public static void play() {
        String userName = Cli.greet();
        System.out.println("Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.");
        final int roundNumber = 3;
        for (int i = 0; i < roundNumber; i++) {
            if (!winRound(userName)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    // print console message (guessed or made a mistake) and return round result
    private static boolean winRound(String userName) {
        final int max = 100;
        int number = getRandom(max);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String userAnswer = getUserAnswer();
        if (getGoodAnswer(number).equals(userAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                + "Correct answer was '" + getGoodAnswer(number) + "'.");
        System.out.println("Let's try again, " + userName);
        return false;
    }

    private static String getGoodAnswer(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }

    private static int getRandom(int max) {
        return (int) (Math.random() * ++max);
    }

    private static String getUserAnswer() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
