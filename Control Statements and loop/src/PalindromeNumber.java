import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any Number: ");
        int num = in.nextInt();

        int OriginalNum = num;

        int ReverseNumber = 0;
        while(OriginalNum>0){
            int rem = OriginalNum%10;
            OriginalNum /= 10;
            ReverseNumber = ReverseNumber*10 + rem;
        }

        OriginalNum = num;

        if(OriginalNum == ReverseNumber){
            System.out.println(num + " is palindrome");

        }else{
            System.out.println(num + " is not palindrome");

        }
    }
}
