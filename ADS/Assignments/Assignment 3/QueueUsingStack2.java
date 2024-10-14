
public class QueueUsingStack2 {
    static final int MAX = 5;
    int[] stack1 = new int[MAX];
    int[] stack2 = new int[MAX];
    int top1;
    int top2;

    QueueUsingStack2() {
        top1 = -1;
        top2 = -1;
    }

    boolean isFullStack1() {
        return top1 >= MAX - 1;
    }

    boolean isEmptyStack1() {
        return top1 < 0;
    }

    boolean isFullStack2() {
        return top2 >= MAX - 1;
    }

    boolean isEmptyStack2() {
        return top2 < 0;
    }

    void enqueue(int x) {
        if (isFullStack1()) {
            System.out.println("Queue overflow (stack1 is full)");
            return;
        }
        stack1[++top1] = x;
        System.out.println(x + " added to Queue successfully");
    }

    void transferStack1ToStack2() {
        while (!isEmptyStack1()) {
            stack2[++top2] = stack1[top1--];
        }
    }

    int dequeue() {
        if (isEmptyStack1() && isEmptyStack2()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (isEmptyStack2()) {
            transferStack1ToStack2();
        }
        int dequeuedElement = stack2[top2--];
        System.out.println("Dequeued element: " + dequeuedElement);
        return dequeuedElement;
    }

    void displayQueue() {
        if (isEmptyStack1() && isEmptyStack2()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = top2; i >= 0; i--) {
            System.out.print(stack2[i] + " ");
        }
        for (int i = 0; i <= top1; i++) {
            System.out.print(stack1[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingStack2 queue = new QueueUsingStack2();

        queue.enqueue(10);
        queue.enqueue(20);
 
        queue.dequeue();

        queue.displayQueue();
    }
}
