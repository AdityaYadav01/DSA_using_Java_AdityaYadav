import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();

        int sum = 0;
        while(num>0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}
