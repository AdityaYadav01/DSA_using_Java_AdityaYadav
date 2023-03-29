// Reverse the order of the given number.

import java.util.Scanner;

public class ReverseOrd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = in.nextInt();

        int ans = 0;
        while(num>0){
            int rem = num % 10;
            num = num / 10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);

    }
}
