import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of initial year: ");
        float v = in.nextFloat();

        System.out.println("Enter the rate of depreciation year:");
        float r = in.nextFloat();

        System.out.println("Enter the time period: ");
        float t = in.nextFloat();

        float result = (float)(v*Math.pow((1-r/100), t));
        System.out.println(result);
    }
}
