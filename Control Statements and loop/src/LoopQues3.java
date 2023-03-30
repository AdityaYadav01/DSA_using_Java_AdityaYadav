// Take integer inputs till the user enters 0 and print the sum of all numbers


import java.util.Scanner;

public class LoopQues3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        while(true){
            System.out.print("Enter an integer or (enter 0 to exit): ");
            int num = in.nextInt();

            if (num == 0){
                break;
            }
            else{
                sum += num;
            }
        }
        System.out.println("Sum of number is " + sum);



    }
}
