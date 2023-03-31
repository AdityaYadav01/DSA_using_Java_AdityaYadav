/* Switch Statements - In Switch Statements, You can jump to
various cases based on your expression.

NOTE - 1. Cases have to be of the same type as expressions, must be a constant or literals.
2. Duplicate cases are not allowed.
3. Break is used to terminate sequence.
4. If break is not used, it will continue to next cases.
5. default will execute, if none of the cases executed.
6. if default is not used, put break at the end.


*/



import java.util.Scanner;

public class SyntaxForSwitchStatements {
    public static void main(String[] args) {

//        syntax:
//
//        switch (expression){
//            case 1:
//                do something;
//                break;
//            case 2:
//                do something;
//                break;
//            case 3:
//                do something;
//                break;
//            case 4:
//                do something;
//                break;
//            default:
//                do something;
//        }
        // Let's Look at the example

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the name of the animal: ");
        String animal = in.next();

        switch (animal){
            case ("Lion"):
                System.out.println("king of the jungle");
                break;
            case ("Tiger"):
                System.out.println("Royal Bengal Tiger");
                break;
            case ("Elephant"):
                System.out.println("Haathi");
                break;
            case ("fish"):
                System.out.println("Queen of sea");
                break;
            default:
                System.out.println("Please enter valid name");
        }


    }
}
