import java.util.Scanner;

public class ConsonantOrVowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any Character: ");
        char ch = in.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel");
        }
        else{
            System.out.println(ch + " is a consonant");
        }

    }
}
