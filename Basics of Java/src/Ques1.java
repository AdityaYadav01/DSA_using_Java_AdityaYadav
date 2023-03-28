// Ques1. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please Enter your name: ");
        String message = in.nextLine();

        System.out.println("Happy Birthday " + message);
    }
}
