package hexlet.code;

import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String select = sc.next();
        System.out.println("");
        switch (select) {
            case "1":
                Cli.greet();
                break;
            case "2":
                GameEven.play();
                break;
            case "3":
                GameCalc.play();
                break;
            case "4":
                GameGCD.play();
                break;
            case "5":
                GameProgression.play();
                break;
            case "6":
                GamePrime.play();
                break;
            default:
                System.out.println("There is no game " + select + " here");
        }
    }
}
