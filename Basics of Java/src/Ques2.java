//Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Principal value: ");
        float principal = in.nextFloat();

        System.out.print("Enter the Rate value: ");
        float rate = in.nextFloat();

        System.out.print("Enter the Principal value: ");
        float time = in.nextFloat();

        float SimpleInterest = principal*rate*time;
        System.out.println(SimpleInterest);



    }
}
