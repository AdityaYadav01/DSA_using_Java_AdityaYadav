// Creating a Sum method and printing the value in the main function.


import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        int Sum = sum();
        System.out.println(Sum);
    }

    static int sum(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = in.nextInt();

        System.out.print("Enter 2st Number: ");
        int num2 = in.nextInt();

        return num1 + num2;

    }
}
