import java.util.Scanner;

public class CountingOcc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        System.out.print("Enter the number you want to count: ");
        int CouNum = in.nextInt();

        int count = 0;
        while(num>0){
            int rem = num % 10;
            if(rem == CouNum){
                count++;
            }
            num = num/10;
        }
        System.out.println("The Number of times " + CouNum + " occuring is " + count);


    }
}
