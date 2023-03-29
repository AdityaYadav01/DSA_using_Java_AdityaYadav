/*Input the value of radius and find the area of circle*/

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of radius: ");
        float radius = in.nextFloat();

        float area = (float)(3.14*radius*radius);
        System.out.println("Area of Circle is " + area);

        //Find the area of isosceles triangle

        System.out.print("Enter the value of base: ");
        float base = in.nextFloat();

        System.out.println("Enter the value of height: ");
        float height = in.nextFloat();

        double Area = base*height/2;
        System.out.println("area of isosceles triangle: " + Area);


    }
}
