import java.util.*;

public class Main {
    static void deleteDups(MySinglyLinkedList<Integer> list) {
        HashSet<Integer> set = new HashSet<>();
        MySinglyLinkedListNode<Integer> n = list.head;
        MySinglyLinkedListNode<Integer> prev = list.head;
        n = n.next;
        while (n != null) {
            if (set.contains(n.data)) {
                prev.next = n.next;
            } else {
                set.add(n.data);
                prev = prev.next;
            }
            n = n.next;
        }
    }

    static void deleteDupsFU(MySinglyLinkedList<Integer> list) {
        MySinglyLinkedListNode<Integer> current = list.head;
        while (current != null) {
            MySinglyLinkedListNode<Integer> runner = current;
            while (runner.next != null) {
                if (runner.next.data.equals(current.data)) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        //There is a problem in this exercise because of the way I implement the addEnd method (using the tail node...)
        MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        list.addEnd(4);
        list.addEnd(2);
        list.addEnd(3);
        list.printMe();
        Main.deleteDups(list);
        list.printMe();
        list.addEnd(2);
        list.addEnd(2);
        list.printMe();
        Main.deleteDupsFU(list);
        list.printMe();
    }
}
