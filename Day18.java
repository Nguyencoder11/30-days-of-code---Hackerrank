// Day 18: Queues and Stacks

import java.util.*;
import java.io.*;

public class Day18 {
    Stack<Character> stackList = new Stack<>();
    Queue<Character> queueList = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();

        // Chuyen doi chuoi dau vao thanh 1 mang cac ky tu
        char[] charArr = inputString.toCharArray();

        // Tao mot doi tuong Day18
        Day18 p = new Day18();

        // Enqueue/Push tat ca cac ky tu vao cau truc tuong ung cua chung
        for (char c : charArr) {
            p.pushCharacter(c); // Them ky tu vao danh sach Stack
            p.enqueueCharacter(c); // Them ky tu vao danh sack Queue
        }

        // Dequeue/Pop ky tu dau cua cac truc du lieu va so sanh chung voi nhau
        boolean isPalindrome = true;
        for (int i = 0; i < charArr.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // In ra lieu chuoi o tren co phai chuoi dao nguoc hay khong
        System.out.println("The word, " + inputString + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    private void pushCharacter(char c) {
        stackList.push(c);
    }

    private Object popCharacter() {
        return stackList.pop();
    }

    private void enqueueCharacter(char c) {
        queueList.offer(c);
    }

    private Object dequeueCharacter() {
        return queueList.poll();
    }
}
