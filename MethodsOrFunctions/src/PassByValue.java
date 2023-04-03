public class PassByValue {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;                  // Swaping will not take place because both the numbers are swapped in other function.

        swap(n1, n2);
        System.out.println(n1 + " " + n2);
    }

    static void swap(int s1, int s2) {        //Here, they are just passes the value.
        // At function level scope they are swapped.
        int temp = s1;
        s1 = s2;
        s2 = temp;

    }


}
