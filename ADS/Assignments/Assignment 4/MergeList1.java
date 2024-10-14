
class SinglyLinkedList {
    Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void insertNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static SinglyLinkedList mergeSortedLists(SinglyLinkedList list1, SinglyLinkedList list2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        Node l1 = list1.head;
        Node l2 = list2.head;

        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }

        SinglyLinkedList mergedList = new SinglyLinkedList();
        mergedList.head = dummy.next;
        return mergedList;
    }
}

public class MergeList1 {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertNode(1);
        list1.insertNode(3);
        list1.insertNode(5);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertNode(2);
        list2.insertNode(4);
        list2.insertNode(6);

        System.out.println("List 1:");
        list1.display();
        System.out.println("List 2:");
        list2.display();

        SinglyLinkedList mergedList = SinglyLinkedList.mergeSortedLists(list1, list2);
        System.out.println("Merged List:");
        mergedList.display();
    }
}
