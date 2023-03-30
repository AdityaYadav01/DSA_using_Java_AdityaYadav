import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Total Numbers of runs scored by player: ");
        int runs = in.nextInt();

        System.out.println("Total number of times batsman was out: ");
        int out = in.nextInt();

        float Average = (float)(runs/out);
        System.out.println("Batting Average is " + Average);

    }
}
