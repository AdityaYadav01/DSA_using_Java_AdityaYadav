import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        String message = greeting();
        System.out.println(message);
    }


    static String greeting() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the message you want to print: ");
        String message = in.nextLine();

        return message;
    }

}


