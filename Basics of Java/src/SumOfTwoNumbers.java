import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Scanner - It is a class required to take input. It is present in java.util package
        // in - It is an object that we are creating to take input.
        // new - It is the keyword which is used to create object.
        // System.in - 'System' is a class & 'in' is the variable that denotes we are taking input from standard input stream (i.e Keyboard).

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        int sum = num1+num2;

        System.out.println("Sum of Two Number is :" + sum);


    }
}
