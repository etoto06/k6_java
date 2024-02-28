//import java.util.Arrays;
//
//public class J08 {
//    static int getList(int[] data) {
//        int count = 0;
//        int mid = data.length / 2;
//        for (int i = 0; i <= mid; i++) {
//            data[i] = i * 5;
//            count++;
//        }
//        return count;
//    }
//
//    static void showList(int[] data) {
//        System.out.println();
//        for (int i = 0; i < data.length; i++)
//            System.out.print(" " + data[i] + " ");
//        System.out.println();
//    }
//
//    static int insertList(int[] data, int count, int x) {
//        if (count >= data.length) {
//            System.out.println("리스트가 가득 찼습니다.");
//            return count;
//        }
//
//        int index = 0;
//        while (index < count && data[index] < x) {
//            index++;
//        }
//
//        for (int i = count; i > index; i--) {
//            data[i] = data[i - 1];
//        }
//        data[index] = x;
//        count++;
//
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int[] list = new int[10];
//        int count = 0;
//        System.out.println("배열로 리스트:");
//
//        count = getList(list);
//        showList(list);
//
//        count = insertList(list, count, 3);
//        showList(list);
//
//        count = insertList(list, count, 7);
//        showList(list);
//    }
//}
//class Node3 {
//    int data;
//    Node3 link;
//
//    public Node3(int data) {
//        this.data = data;
//        link = null;
//    }
//}
//
//class LinkedList3 {
//    Node3 first;
//
//    void append(int data) {
//        Node3 newNode = new Node3(data);
//
//        if (first == null) {
//            first = newNode;
//        } else {
//            Node3 p = first;
//            while (p.link != null) {
//                p = p.link;
//            }
//            p.link = newNode;
//        }
//    }
//
//    void showList() {
//        System.out.println("연결 리스트로 리스트:");
//        Node3 p = first;
//        while (p != null) {
//            System.out.print(p.data + " ");
//            p = p.link;
//        }
//        System.out.println();
//    }
//
//    void insert(int data) {
//        Node3 newNode = new Node3(data);
//
//        if (first == null) {
//            first = newNode;
//        } else if (data <= first.data) {
//            newNode.link = first;
//            first = newNode;
//        } else {
//            Node3 p = first;
//            Node3 q = null;
//            while (p != null && p.data < data) {
//                q = p;
//                p = p.link;
//            }
//            q.link = newNode;
//            newNode.link = p;
//        }
//    }
//}
//
//public class J08연결리스트와 {
//    public static void main(String[] args) {
//        LinkedList3 ll = new LinkedList3();
//        ll.append(5);
//        ll.append(10);
//        ll.append(15);
//        ll.append(20);
//        ll.append(25);
//
//        ll.showList();
//
//        ll.insert(3);
//        ll.showList();
//
//        ll.insert(7);
//        ll.showList();
//    }
//}
