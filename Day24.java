// Day 24: More Linked Lists

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}

public class Day24 {
    public static Node removeDuplicates(Node head) {
        // Nếu danh sách rỗng hoặc có 1 Node head duy nhất thì trả về Node head
        if (head == null || head.next == null) {
            return head;
        } else {
            // 1 con trỏ current
            /*
             * Node current = head;
             * while (current.next != null) {
             * if (current.data == current.next.data) {
             * current.next = current.next.next;
             * } else {
             * current = current.next;
             * }
             * }
             * 
             */

            // Kỹ thuật dùng 2 con trỏ duyệt danh sách
            Node temp = head;
            while (temp != null) {
                Node current = temp;
                while (current.next != null) {
                    if (temp.data == current.next.data) {
                        current.next = current.next.next;
                    } else {
                        current = current.next;
                    }
                }
                temp = temp.next;
            }
            return head;
        }
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);
        sc.close();
    }
}
