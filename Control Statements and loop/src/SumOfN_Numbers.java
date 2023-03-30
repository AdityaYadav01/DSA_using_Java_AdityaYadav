import java.util.Scanner;

public class SumOfN_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.print("Enter the integer: ");
            int num = in.nextInt();
            sum += num;

            System.out.println(sum);

        }


    }
}
