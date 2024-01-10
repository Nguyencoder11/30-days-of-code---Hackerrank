// Day 9: Recursion 3

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

class Day9 {
    public static void main(String[] args) throws IOException {
        // Doc vao du lieu
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String outputPath = "OUTPUT_PATH.txt";
        // Ghi du lieu vao file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

        // Doc so dau vao
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Tinh toan ket qua
        int result = Result.factorial(n);

        // Ghi ket qua vao file output
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        // Dong luong dau vao, ra
        bufferedReader.close();
        bufferedWriter.close();
    }
}