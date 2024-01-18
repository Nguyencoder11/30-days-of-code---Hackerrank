import java.io.*;
import java.util.*;

public class hasNextInJava {
    public static void main(String[] args) {
        String path = "input.txt";
        try {
            File file = new File(path);

            Scanner scan = new Scanner(file);

            int lineNum = 1;

            while (scan.hasNext()) {
                String line = scan.nextLine();
                System.out.println(lineNum++ + " " + line);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            // Xử lý nếu không tìm thấy tệp tin
            System.err.println("Không tìm thấy tệp tin: " + path);
            e.printStackTrace();
        }
    }
}