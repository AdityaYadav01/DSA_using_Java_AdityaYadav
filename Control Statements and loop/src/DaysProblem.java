//Kunal is allowed to go out with his friends only on
// the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.



public class DaysProblem {
    public static void main(String[] args) {
        int totaldays = 31;
        int days = 0;

        for (int i = 0; i <= totaldays ; i++) {
            if (i % 2 == 0){
                days++;

            }
        }
        System.out.println(days);

    }
}
