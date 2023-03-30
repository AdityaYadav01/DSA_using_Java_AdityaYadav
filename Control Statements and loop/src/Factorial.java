import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any non-negative number: ");
        int num = in.nextInt();

        int factorial = 1;

        if(num < 0){
            System.out.println("Invalid Number");
        }else{
            for (int i = 1; i <= num ; i++) {
                factorial *= i;

            }
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
