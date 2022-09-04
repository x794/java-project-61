package hexlet.code;

import java.util.Scanner;

public class Engine {
    // make greeting and return username
    public static String getUserName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static int getRandom(int max) {
        return (int) (Math.random() * max + 1);
    }

    // show question invite and return user answer
    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    // test if user answer equals to good answer, show result and return result
    public static boolean testAnswer(String userAnswer, String goodAnswer) {
        if (userAnswer.equals(goodAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                + "Correct answer was '" + goodAnswer + "'.");
        return false;
    }
}
