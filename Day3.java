// Day 3: Intro to Conditional Statements

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine().trim());

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if ((N >= 2 && N <= 5) || (N > 20)) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        }

        reader.close();
    }
}