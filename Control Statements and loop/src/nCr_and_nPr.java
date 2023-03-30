import java.util.Scanner;

public class nCr_and_nPr {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = in.nextInt();

        System.out.println("Enter the value of r: ");
        int r = in.nextInt();


        int nFact = 1;
        for (int i = 1; i <= n ; i++) {
            nFact = nFact * i;
        }

        int rFact = 1;
        for (int i = 1; i < r ; i++) {
            rFact = rFact * i;
        }

        int nMINUSrFact = 1;
        for (int i = 1; i <= (n-r) ; i++) {
            nMINUSrFact = nMINUSrFact * i;

        }

        int nCr = nFact/(rFact*nMINUSrFact);
        int nPr = nFact/nMINUSrFact;

        System.out.println("nCr " + nCr);
        System.out.println("nPr " + nPr);





    }
}
