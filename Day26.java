// Day 26: Nested Logic

import java.util.*;
import java.io.*;

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) throws IOException {
        // Getting data using System.in
        /*
         * Scanner scanner = new Scanner(System.in);
         * // Input for returned day
         * int d1 = scanner.nextInt();
         * int m1 = scanner.nextInt();
         * int y1 = scanner.nextInt();
         * 
         * // Input for due day
         * int d2 = scanner.nextInt();
         * int m2 = scanner.nextInt();
         * int y2 = scanner.nextInt();
         * 
         * int punish = 0;
         * if (y1 > y2) {
         * punish = 10000;
         * } else if (y1 == y2 && m1 > m2) {
         * punish = 500 * (m1 - m2);
         * } else if (y1 == y2 && m1 == m2 && d1 > d2) {
         * punish = 15 * (d1 - d2);
         * }
         * System.out.println(punish);
         * scanner.close();
         */

        // Doc du lieu tu file Day26.txt
        String path = "Day26.txt";
        String outputPath = "Day26_output.txt";

        try {
            File file = new File(path);
            Scanner scan = new Scanner(file);

            // Read returned day
            String returnedDayStr = scan.nextLine();
            String[] returnedDayArr = returnedDayStr.split(" ");
            int returnedDay = Integer.parseInt(returnedDayArr[0]);
            int returnedMonth = Integer.parseInt(returnedDayArr[1]);
            int returnedYear = Integer.parseInt(returnedDayArr[2]);

            // Read due day
            String dueDayStr = scan.nextLine();
            String[] dueDayArr = dueDayStr.split(" ");
            int dueDay = Integer.parseInt(dueDayArr[0]);
            int dueMonth = Integer.parseInt(dueDayArr[1]);
            int dueYear = Integer.parseInt(dueDayArr[2]);

            System.out.println(returnedDayStr);
            System.out.println(dueDayStr);

            int punish = 0;
            if (returnedYear > dueYear) {
                punish = 10000;
            } else if (returnedYear == dueYear && returnedMonth > dueMonth) {
                punish = 500 * (returnedMonth - dueMonth);
            } else if (returnedYear == dueYear && returnedMonth == dueMonth && returnedDay > dueDay) {
                punish = 15 * (returnedDay - dueDay);
            }
            System.out.println(punish);

            try (FileWriter writer = new FileWriter(outputPath)) {
                writer.write("Fine: " + punish + " Hackos");
            }

            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file " + path);
            e.printStackTrace();
        }
    }
}
