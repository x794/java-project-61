package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
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
            default:
                System.out.println("There is no game " + select + " here");
        }
    }
}
