// Day 15: Linked List

import java.util.*;

// Bai tap ve cau truc du lieu LinkedList
// Declare a class Node to define a singly linked list
class Node {
    int data;
    Node next;

    // Constructor for a Node
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15 {
    // insert() method to add a new Node
    public static Node insert(Node head, int data) {
        if (head == null) {
            // Neu danh sach rong thi them 1 nut moi
            head = new Node(data);
        } else {
            // nguoc lai thi duyet den nut cuoi cung va them nut moi
            Node a = head; // Node a tro vao node dau tien cua danh sach
            while (a.next != null) {
                a = a.next;
            }
            a.next = new Node(data);
        }
        return head;
    }

    // display() method to display data
    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Define and init a Node
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}