// Ques3. Input currency in rupees and output in USD.

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount of Indian Rupees: ");
        float rupee = in.nextFloat();

        double USD =  (rupee/82.16);
        System.out.println("Total amount in USD: " + USD);

    }
}
