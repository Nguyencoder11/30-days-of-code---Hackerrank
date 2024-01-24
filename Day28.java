// Day 28: RegEx, Patterns, and Intro to Databases

import java.io.*;
import java.util.stream.*;
import java.util.*;

public class Day28 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> gmailUsers = new ArrayList<>();

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                if (emailID.endsWith("@gmail.com")) {
                    gmailUsers.add(firstName);
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Collections.sort(gmailUsers);
        for (String user : gmailUsers) {
            System.out.println(user);
        }

        bufferedReader.close();
    }
}
