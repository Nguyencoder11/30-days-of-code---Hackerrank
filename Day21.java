// Day 21: Generics

import java.util.*;

class Printer<T> {

    /**
     * Method Name: printArray
     * Print each element of the generic array on a new line. Do not return
     * anything.
     * 
     * @param A generic array
     **/

    // Phuong thuc printArray in ra cac phan tu cua mang co kieu du lieu T bat ky
    public void printArray(T[] myArray) {
        for (T element : myArray) {
            System.out.println(element);
        }

        // Hoac
        /*
         * for (int i = 0; i < myArray.length; i++) {
         * System.out.println(myArray[i]);
         * }
         */
    }
}

public class Day21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
        scanner.close();
    }
}