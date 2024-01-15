// Day 20: Sorting

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Day20 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
                .collect(toList());
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a.get(j - 1) > a.get(j)) {
                    // Doi cho phan tu theo cach thuong
                    // Su dung a[].get(index) va a[].set(index, value)
                    /*
                     * int tmp = a.get(j);
                     * a.set(j, a.get(j - 1));
                     * a.set(j - 1, tmp);
                     */

                    // Doi cho phan tu bang Collections.swap(a[], index1, index2)
                    Collections.swap(a, j, j - 1);
                    count++;
                }
            }
        }
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));
        bufferedReader.close();
    }
}
