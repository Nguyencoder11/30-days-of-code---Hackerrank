// Day 14: Scope

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Bai tap ve pham vi (Scope)
class Difference {
    private int[] elements;
    public int maximumDifference;

    // Method computeDifference
    public void computeDifference() {
        int max = 1;
        int min = 100;
        for (int element : elements) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        this.maximumDifference = max - min;
    }

    // Constructor with parameter int[] elements
    Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = 0;
    }
}

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}