// Fibonacci Series In Java Programs upto nth number.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the nth number: ");
        int num = in.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);

        int i = 2;
        while(i<=num){
            int sum = a+b;
            a = b;
            b = sum;
            i++;

            System.out.print(" " + sum + " ");

        }


    }
}
