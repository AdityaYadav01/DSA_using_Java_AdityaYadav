/*Write a program to print the sum of negative numbers, sum of positive even numbers
and the sum of positive odd numbers from a list of numbers (N) entered by the user.
The list terminates when the user enters a zero.*/

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int NegNum = 0;
        int PosEven = 0;
        int PosOdd = 0;

        while(true){
            System.out.println("Enter any integer (or 0 to exit the program): ");
            int num = in.nextInt();

            if (num == 0){
                break;
            } else if (num < 0) {
                NegNum += num;
            } else if (num%2 == 0) {
                PosEven += num;
            }else{
                PosOdd += num;
            }
        }
        System.out.println(NegNum);
        System.out.println(PosEven);
        System.out.println(PosOdd);
    }
}
