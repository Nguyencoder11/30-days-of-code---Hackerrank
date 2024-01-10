import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class stackInJava {
    public static void main(String[] args) {
        String path = "stackInJava.txt";
        try {
            File file = new File(path);

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {
                String input = scan.next();
            }
            scan.close();
        } catch (FileNotFoundException e) {
            // Xử lý nếu không tìm thấy tệp tin
            System.err.println("Không tìm thấy tệp tin: " + path);
            e.printStackTrace();
        }
    }
}
