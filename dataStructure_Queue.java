// Learn about data structure - Queue

import java.io.*;
import java.util.*;

public class dataStructure_Queue {
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new PriorityQueue<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int index = 1; index <= 10; index++) {
            queue1.add(index); // Them phan tu vao cuoi queue1
            queue2.offer(index); // Them phan tu vao cuoi queue2
        }
        System.out.println("Danh sach Queue1 voi LinkedList Queue: ");
        show1();
        System.out.println("\nDanh sach Queue2 voi Priority Queue: ");
        show2();
        scan.close();

        // Lay ra phan tu dau cua queue1 va queue2 ma khong xoa
        System.out.println("\nPhan tu dau tien Queue1 (khong xoa):");
        System.out.println(queue1.element());
        show1();
        System.out.println("\nPhan tu dau tien Queue2 (khong xoa):");
        System.out.println(queue2.peek());
        show2();

        // Lay ra phan tu dau tien cua queue1 va queue2 dong thoi xoa khoi list
        System.out.println("\nPhan tu dau tien Queue1 (da xoa):");
        System.out.println(queue1.remove());
        show1();
        System.out.println("\nPhan tu dau tien Queue2 (da xoa):");
        System.out.println(queue2.poll());
        show2();

        // In ra so luong phan tu cua 2 queue
        System.out.println("\nThe size of the Queue1 is:");
        System.out.println(queue1.size());
        System.out.println("\nThe size of the Queue2 is:");
        System.out.println(queue2.size());

        // Kiem tra 2 queue co phai list rong hay khong
        System.out.print("\nQueue1 is empty? True or False?: ");
        System.out.print(queue1.isEmpty());
        System.out.print("\nQueue2 is empty? True or False?: ");
        System.out.print(queue2.isEmpty());
    }

    static void show1() {
        for (int number : queue1) {
            System.out.print(number + " ");
        }
    }

    static void show2() {
        for (int num : queue2) {
            System.out.print(num + " ");
        }
    }
}
