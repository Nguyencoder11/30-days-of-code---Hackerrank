// Day 7: Arrays

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*; // thu vien ho tro su dung bieu thuc chinh quy

public class Day7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Ep kieu chuoi nhap vao thanh kieu Int voi Integer.parseInt
        int n = Integer.parseInt(reader.readLine().trim());

        String[] arrTemp = reader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int j = n - 1;
        while (j > -1) {
            if (j >= 0) {
                System.out.print(arr.get(j));
            }
            System.out.print(" ");
            j--;
        }

        reader.close();
    }
}