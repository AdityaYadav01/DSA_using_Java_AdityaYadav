//Take unit consumed as a input from user.

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total unit: ");
        int unit = in.nextInt();

        double TotalAmount = 0;

        if(unit < 100){
            TotalAmount = unit*1.20;
        }
        else if (unit > 300){
            TotalAmount = 100*1.20 + (unit-200)*2;
        }
        else if (unit < 300) {
            TotalAmount = 100*1.20 + 200*2 + (unit-300)*3;

        }
        System.out.println(TotalAmount);
    }
}
