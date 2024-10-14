class SinglyLinkedList1 {
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

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
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

public class CycleDetection {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);

        list.display();
        
        boolean hasCycle = list.detectCycle();
        System.out.println("Cycle Detected: " + hasCycle);
    }
}
