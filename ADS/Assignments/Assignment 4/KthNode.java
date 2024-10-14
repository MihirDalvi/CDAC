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

    public int findNthFromLast(int N) {
        int len = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }

        if (len < N) {
            return -1;
        }

        temp = head;

        for (int i = 1; i < len - N + 1; i++) {
            temp = temp.next;
        }

        return temp.value; 
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class KthNode {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);

        System.out.println("Linked List:");
        list.display();

        int n = 2;
        int nthNodeValue = list.findNthFromLast(n);
        if (nthNodeValue != -1) {
            System.out.println("The " + n + "th node from the end is: " + nthNodeValue);
        } else {
            System.out.println("The linked list has fewer than " + n + " nodes.");
        }
    }
}
