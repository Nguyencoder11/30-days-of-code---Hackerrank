// Day 8: Dictionaries and Maps

import java.util.*;
import java.io.*;

public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> list = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int phone = sc.nextInt();
            // Write code here
            list.put(name, phone);
        }
        while (sc.hasNext()) {
            String s = sc.next();
            // Write code here
            if (!list.containsKey(s)) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + list.get(s));
            }
        }
        sc.close();
    }
}
