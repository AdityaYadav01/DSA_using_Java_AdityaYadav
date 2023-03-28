/*Write a program to print whether a number is even or odd, also take
input from the user.*/

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any Integer Number: ");
        int num = in.nextInt();

        if(num%2 == 0){
            System.out.println("It is an Even Number.");
        }
        else{
            System.out.println("It is an odd Number.");
        }

    }
}
