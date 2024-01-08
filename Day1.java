import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        System.out.println("So nguyen: ");
        int number1 = scan.nextInt();
        System.out.println("So thuc: ");
        double number2 = scan.nextDouble();
        scan.nextLine();
        String str;
        System.out.println("Chuoi: ");
        str = scan.nextLine();
        /* Read and save an integer, double, and String to your variables. */
        number1 += i;
        number2 += d;
        // Note: If you have trouble reading the entire String, please go back and
        // review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(number1);
        /* Print the sum of the double variables on a new line. */
        System.out.println(number2);
        /*
         * Concatenate and print the String variables on a new line;
         * the 's' variable above should be printed first.
         */
        System.out.println(s += str);
        scan.close();
    }
}