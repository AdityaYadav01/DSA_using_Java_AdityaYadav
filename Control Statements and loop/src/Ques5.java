// “ Take an input character from keyboard and check weather
// it is Upper case alphabet or lower case alphabet”

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = in.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("It is a UpperCase character");
        }
        else{
            System.out.println("It is lower case");
        }
    }
}
