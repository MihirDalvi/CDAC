
class DoublyLinkedList {
    Node head;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void delete(int value) {
        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp != null) {
            if (temp.value == value) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next; // Delete head
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }

                return; // Node deleted
            }
            temp = temp.next;
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + (temp.next != null ? " <--> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DoublyList1 {
    public static void main(String[] args) {
        DoublyLinkedList list1 = new DoublyLinkedList();

        list1.insert(10);
        list1.insert(20);
        list1.insert(30);
        System.out.print("List after insertions: ");
        list1.traverse();

        list1.delete(20);
        System.out.print("List after deleting 20: ");
        list1.traverse();

        DoublyLinkedList list2 = new DoublyLinkedList();

        list2.insert(1);
        list2.insert(2);
        list2.insert(3);
        System.out.print("List after insertions: ");
        list2.traverse();

        list2.delete(1);
        System.out.print("List after deleting 1: ");
        list2.traverse();
    }
}
