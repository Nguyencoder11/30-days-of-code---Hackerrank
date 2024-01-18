// Day 5: Loops

import java.io.*;

public class Day5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine().trim());
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " x " + j + " = " + n * j);
        }

        reader.close();
    }
}