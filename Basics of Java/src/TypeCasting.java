/*Type Conversion - When one type of data is assigned to another type of variable.
* An automatic type conversion will take place under some conditions:
* 1. Two Type should be compatible.
* 2. The Destination type should be larger than source type.*/

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*Type Casting - when we convert one type of data to another type of data is known as type casting.*/
        int num = (int)(89.65f);  // Here, I have done type casting.
        System.out.println(num);


//example 1
        int a = 257;
        byte b = (byte)(a);   // Here I am storing Integer value into byte.
        // 257 % 256 = 1.

        System.out.println(b);

        // Automatic Type Promotion in expressions:

// example 2
        byte n1 = 45;
        byte n2 = 55;
        byte n3 = 100;

        int result = n1 * n2 / n3;

        System.out.println(result);

// example 3
        int number = 'A';
        System.out.println(number);  // It will print the ASCII value of character 'A'.


        /*There are some rules for type promotion:-
* 1. Java automatically Convert short, byte or char operand to int while evaluating an expression.
* 2. If one operand is long, double or float the whole expression is converted to long, double or float respectively.*/

        byte by = 15;
        char ch = 'S';
        int digit = 45;
        float fl = 98.56f;
        short sh = 489;
        double d = 896.2356;

        double dou = ((ch-digit) + (by*fl) + (d/sh));
        // int + float + double = double
        System.out.println(dou);

    }
}
