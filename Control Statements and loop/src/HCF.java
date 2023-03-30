import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input any two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int HCF = 1;

        for (int i = 1; i <= num1 && i <= num2 ; i++) {
            if (num1%i == 0 && num2%i == 0 ){
                HCF = i;

            }
        }
        System.out.println(HCF);
    }
}
