//check the number is armstrong or not

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number: " );
        int num = in.nextInt();

        int OriginalNumber = num;

        //counting the number of digits

        int n = 0;
        while(OriginalNumber > 0){
            OriginalNumber /= 10;
            ++n;
        }

        OriginalNumber = num;

        // Sum of all the digits

        int sum = 0;
        while(OriginalNumber > 0){
            int rem = OriginalNumber%10;
            sum += Math.pow(rem, n);
            OriginalNumber /= 10;
        }

        if (sum == num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }




    }

}
