/*Control statements are the statements that are executed randomly and repeatedly.
They are useful to write better and complex programs */

import java.util.Scanner;

public class SyntaxForControlStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

/*1. if-else statement - It is used to perform a task on whether a given statement is true or false.

        if(true){
            System.out.println("If the condition is true it will print this output.");
        }
        else{
            System.out.println("It will print this output");
        } */


        System.out.print("Please enter any number: ");
        int num = in.nextInt();

        if(num == 64){
         System.out.println("They both are equal");
        }
        else{
         System.out.println("The number is not equal");
        }

/*loop - A loop is a sequence of instructions that is continually repeated until
the certain condition is reached. Once the condition is false loop is terminated.

 for-loop - It execute group of statements as long as certain condition is true.
 We use for-loop when we know how many times loop will be executing.
 syntax - for(initialization, condition, incremental value){
              statements;
        }
        */

        for(int i=1; i <= num; i++){    //Printing the numbers from 1 to num.
            System.out.print(i + " ");
        }
        System.out.println();
/*Syntax for while-loop: (We use while loop when we don't know how many times will loop run.

        initialization;
        while(condition){
            statement;
            incremental value;
        } */

        int n = 1;
        while(n<=5) {
            System.out.print(n + " ");
            n++;
        }
        /* do-while loop - It will execute a group of statements until a given condition is true.
        In do-while loop, the statement is executed without checking the condition for the first time.
        From the second time, only the condition is observed. This means programmer doesn't have control from the begining of the program.

        Syntax for do-while loop:

        do{
           body;
           }
           while(condition);


         */
        

    }
}
