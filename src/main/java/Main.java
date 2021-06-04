import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the total alcohol consumed?");
        int a = in.nextInt();
        System.out.print("What is your body weight in pounds?");
        int w = in.nextInt();
        System.out.print("Are you [m] male or [f] female?");
        in.nextLine();
        String s = in.nextLine();
        double r;
        if (s.equals("m")) {
            r = 0.73;
        } else {
            r = 0.66;
        }
        System.out.print("How many hours has it been since the last drink?");
        int h = in.nextInt();
        double bac = (a * 5.14 / w * r) - 0.15 * h;
        System.out.printf("Your BAC is %.2f\n", bac);
        if (bac >= 0.08) {
            System.out.println("It is not legal for you to drive.");
        } else {
            System.out.print("It is legal for you to drive.");
        }
    }
}
