package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("");
        return name;
    }
}
