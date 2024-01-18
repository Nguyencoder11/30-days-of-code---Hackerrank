// Day 10: Binary Numbers

import java.io.*;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int r = 0;
        int count = 0, max = 0;

        while (n > 0) {
            r = n % 2;
            n /= 2;

            if (r == 1) {
                count++; // Dem so luong bit 1
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(max);
        bufferedReader.close();
    }
}
