//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LoopQues4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largest = 0;

        while(true){
            System.out.println("Enter an integer or (0 to exit): ");
            int num = in.nextInt();

            if (num == 0){
                break;
            }

            if (num>largest){
                largest = num;
            }
        }

        System.out.println(largest + " is largest number.");


    }
}
