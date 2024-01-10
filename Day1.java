// Day 1: Data Types

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
        int number1 = scan.nextInt();
        double number2 = scan.nextDouble();
        scan.nextLine();
        String str;
        str = scan.nextLine();
        /* Read and save an integer, double, and String to your variables. */
        number1 += i;
        number2 += d;

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