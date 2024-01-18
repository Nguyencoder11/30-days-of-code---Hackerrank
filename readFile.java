import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class readFile {
    public static void main(String[] args) {
        String path = "readFile.txt";
        try {
            File file = new File(path);

            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {
                String input = scan.next();
                System.out.print(input);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            // Xử lý nếu không tìm thấy tệp tin
            System.err.println("Không tìm thấy tệp tin: " + path);
            e.printStackTrace();
        }
    }
}
