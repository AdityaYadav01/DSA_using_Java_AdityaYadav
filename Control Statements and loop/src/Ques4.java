// Find the largest of three numbers.

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        int a = in.nextInt();

        System.out.print("Enter the second Number: ");
        int b = in.nextInt();

        System.out.print("Enter the third Number: ");
        int c = in.nextInt();

        int max = a; //Assuming 'a' is the maximum number.

        if(b > max){
            max = b;
        }

        if (c > max){
            max = c;
        }

        //Another method to solve this.

        int maximum = 0;

        if(a>b){
            maximum = a;
        }
        else{
            maximum = b;
        }

        if(c > maximum){
            maximum = c;
        }

        System.out.println("Largest Number is " + max);
        System.out.println("Largest Number is " + maximum);



    }
}
