/*Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)*/

import java.util.Scanner;


public class Ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first no. - ");
        int n1 = in.nextInt();

        System.out.print("Enter the second no. - ");
        int n2 = in.nextInt();

        System.out.print("Enter the operation you want to perform: ");
        char ops = in.next().charAt(0);
        
        int result = 0;


        if(ops == '+') {
            result = n1 + n2;
            
        }
        else if (ops == '-') {
            result = n1-n2;
            
        }
        else if (ops == '*') {
             result = n1 * n2;
            
        }
        else if(ops == '/'){
             result = n1 / n2;
        }
        else{
            System.out.println("Invalid Operator");
        }

        System.out.println(result);

    }
}
