
import java.util.Arrays;

class Queue {
    int size = 5;
    int arr[] = new int[size];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return (rear == size - 1);
    }

    void enque(int ele) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) { 
            front = 0;
        }
        arr[++rear] = ele;
    }

    int deque() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedElement = arr[front];
        if (front >= rear) { 
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        System.out.println("Dequeued: " + dequeuedElement);
        return dequeuedElement;
    }

    void display()
    {
        if(!isEmpty()){
            for(int i = front; i<= rear; i++)
            {
                System.out.println(arr[i]);
            }
        }
        
    }
}

public class SimpleQueue1 {
    public static void main(String[] args) {
        Queue q = new Queue();
        

        q.enque(5);
        q.enque(10);

        q.deque();
        q.display();

  
    }
}
