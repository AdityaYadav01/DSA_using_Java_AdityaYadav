//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class LoopQues2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = in.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int multi = num*i;
            System.out.println(num + "*" + i + " = " + multi );

        }

    }
}
