// Passing the value of variables when method is called in main function.

public class PassingTheValue {
    public static void main(String[] args) {
        int sum = SUM(10, 20);
        System.out.println(sum);
    }

    static int SUM(int num1, int num2 ){
        int sum = num1 + num2;
        return sum;
    }
}
