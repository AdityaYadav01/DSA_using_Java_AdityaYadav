import java.util.Scanner;

public class FibonnaciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the nth number: ");
        int num = in.nextInt();

        int a = 0;
        int b = 1;

        if (a == num) {
            System.out.println(a);
        }
        if (b == num) {
            System.out.println(b);
        }

        for (int i = 2; i <= num ; i++) {
            int temp = b;
            b = b + a;
            a = temp;
        }
        System.out.println("Fibonnaci Number " + b);


    }
}
