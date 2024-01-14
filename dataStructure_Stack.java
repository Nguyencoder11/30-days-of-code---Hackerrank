// Learn about data structure - Stack

import java.io.*;
import java.util.*;

public class dataStructure_Stack {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        System.out.println("Elements in first stack:");
        show();

        // Push a new element in stack
        System.out.print("\nEnter a number N: ");
        int N = sc.nextInt();
        stack.push(N);
        System.out.println("\nElements in stack after pushing N:");
        show();

        // Return the top element of stack without removing it
        System.out.println("\nThe top element without removing:");
        System.out.println(stack.peek());
        show();

        // Remove and return the top element from stack
        System.out.println("\nThe top element removing from stack:");
        System.out.println(stack.pop());
        show();

        // Return the number of elements in the stack
        System.out.println("\nThe size of the stack is:");
        System.out.println(stack.size());

        // Check the stack whether empty or not
        System.out.print("\nStack is empty? True or False?: ");
        System.out.print(stack.empty());
        sc.close();
    }

    static void show() {
        for (int num : stack) {
            System.out.print(num + " ");
        }
    }
}
