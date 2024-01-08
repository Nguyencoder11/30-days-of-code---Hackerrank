import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day5 {
    public static void main(String[] args) throws IOException {
        reader reader = new reader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine().trim());
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " x " + j + " = " + n * j);
        }

        reader.close();
    }
}