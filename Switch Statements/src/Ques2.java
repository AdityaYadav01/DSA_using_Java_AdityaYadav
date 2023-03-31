/* Nested Switch Case - It is a switch statement inside another switch statement. */

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Employee Id: ");
        int empID = in.nextInt();

        System.out.print("Enter the 'Specialization' to check Specialization: ");
        String Sep = in.next();

        switch (empID){
            case 1:
                System.out.println("Aditya Yadav");
                switch (Sep){
                    case "Specialization":
                        System.out.println("Cyber Security");
                        break;
                }
                break;

            case 2:
                System.out.println("Sidharth Dudeja");
                switch (Sep){
                    case "Specialization":
                        System.out.println("Full Stack");
                        break;
                }
                break;

            case 3:
                System.out.println("Yuvraj Saxena");
                switch (Sep){
                    case "Specialization":
                        System.out.println("Full Stack");
                        break;
                }
                break;

            case 4:
                System.out.println("Harshit Sharma");
                switch (Sep) {
                    case "Specialization":
                        System.out.println("A.I");
                        break;
                }

                break;
            default:
                System.out.println("Please enter Valid Employee ID");

        }


    }
}
