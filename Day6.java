import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Khai bao so nguyen T (la so testcase)
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            // Nhap vao chuoi
            String s = scan.next();
            String even = "", odd = "";
            char ch;
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    ch = s.charAt(j);
                    even += ch;
                } else {
                    ch = s.charAt(j);
                    odd += ch;
                }
            }

            System.out.printf("%s %s %n", even, odd);
        }
        scan.close();
    }
}
