// Day 22: Binary Search Trees

import java.util.*;

// Khoi tao Node
class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Day22 {
    // phuong thuc tinh getHeight() tra ve chieu cao cua cay tim kiem nhi phan - BST
    public static int getHeight(Node root) {
        if (root == null)
            return -1;
        /*
         * // Tinh chieu cao cua cay con ben trai va cay con ben phai
         * int leftHeight = getHeight(root.left);
         * int rightHeight = getHeight(root.right);
         * 
         * // Chon chieu cao lon hon cong them 1 (cho node hien tai)
         * return 1 + Math.max(leftHeight, rightHeight);
         */
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        // Khoi tao node goc
        Node root = null;

        // them du lieu vao node
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
        sc.close();
    }
}