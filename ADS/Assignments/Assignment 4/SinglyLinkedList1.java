
class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;
    }


    public void insertNode (int value){
        Node newnode = new Node(value);

        if (head == null){
            head = newnode;
        }
        else {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }

    }


    public void delete (int value){
        if (head == null){
            System.out.println("stack is overflow");
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

        if (temp.next== null){
            System.out.println("element not found");
            return;
        }
        else {
            temp.next = temp.next.next;
            System.out.println("Element removed: " + value);
        }
    }

    public boolean search(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }
    
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return true;
            }
            temp = temp.next;
        }
    
        System.out.println("Element not found");
        return false;
    }
    

    public void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node temp = head;
        while (temp != null){
            System.out.print(temp.value);
            if(temp.next != null) {
                System.out.print(" --> ");  // This ensures you won't have an extra arrow at the end
            }
            temp = temp.next;
        }
        System.out.println();
    }

    class Node {
        int value;
        Node next;

        Node(int value){
           this.value = value;
           this.next = null;
        }
    }
 }
public class SinglyLinkedList1 {


    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList();

        ll.insertNode(7);
        ll.insertNode(5);
        ll.insertNode(10);

        ll.delete(5);

        ll.display();
        System.out.println(ll.search(10));
        
    }
}
