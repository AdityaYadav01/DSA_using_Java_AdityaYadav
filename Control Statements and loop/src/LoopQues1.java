/*Input the number from user . print the number from 1 to number given by users.*/

import java.util.Scanner;

public class LoopQues1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number till where you want to print number: ");
        int num = in.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.print(i + " ");
        }

    }
}
