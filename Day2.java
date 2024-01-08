import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     * 1. DOUBLE meal_cost
     * 2. INTEGER tip_percent
     * 3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip, tax, total_cost;

        tip = meal_cost * tip_percent / 100;
        tax = tip * tax_percent / 100;


        total_cost = meal_cost + tip + tax;
        System.out.println((int)Math.ceil(total_cost));
    }

}

public class Day2 {
    public static void main(String[] args) throws IOException {
        reader reader = new reader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(reader.readLine().trim());

        int tip_percent = Integer.parseInt(reader.readLine().trim());

        int tax_percent = Integer.parseInt(reader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        reader.close();
    }
}
