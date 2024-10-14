
class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;
    }

    // Method to insert a node
    public void insertNode(int value) {
        Node newnode = new Node(value);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        System.out.println("Inserted: " + value);
    }

    // Method to delete a node
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (head.value == value) {
            head = head.next;  // Move head to next node
            System.out.println("Element removed: " + value);
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.value != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found: " + value);
        } else {
            temp.next = temp.next.next;
            System.out.println("Element removed: " + value);
        }
    }

    // Method to search for a value in the list
    public boolean search(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return false;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                System.out.println("Element found: " + value);
                return true;
            }
            temp = temp.next;
        }

        System.out.println("Element not found: " + value);
        return false;
    }

    // Method to reverse the linked list
    public Node reverse(Node node) {
        Node prev = null;
        Node temp = node;
        Node next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        node = prev;
        System.out.println("List reversed.");
        return node;
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next != null) {
                System.out.print(" --> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Inner class for the nodes in the list
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}

public class ReverseLinkedList1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Insert nodes
        ll.insertNode(7);
        ll.insertNode(5);
        ll.insertNode(10);

        // Delete a node
        ll.delete(5);

        // Search for a value
        System.out.println("Search result for 10: " + ll.search(10));

        // Reverse the list
        ll.head = ll.reverse(ll.head);

        // Display the reversed list
        System.out.println("Reversed List:");
        ll.display();
    }
}
