
import java.util.Scanner;

public class QueueUsingStack1 {
    static final int MAX = 5;
    int [] stack1 = new int[MAX];
    int [] stack2 = new int[MAX];
    int top1;
    int top2;
    QueueUsingStack()
    {
        top1 = -1;
        top2 =-1;
    }

    boolean isFullStack1(){
        return top1 >= MAX -1;
    }

    boolean isEmptyStack1(){
        return (top1 < 0);
    }
    boolean isFullStack2(){
        return top2 >= MAX -1;
    }

    boolean isEmptyStack2(){
        return (top2 < 0);
    }

    void  enqueue (int x)
    {
        if (isFullStack1()){
           System.out.println("Stack overflow"); 
           return;
        }
        
        stack1[++top1]=x;
        System.out.println(x+" added to Queue succefully");
    }

    int pop1(){
        if (isEmptyStack1()){
            System.out.println("Stack underflow");
            return 0;
        }
        return stack1[top1--];
    }
    void  push2 (int x)
    {
        if (isFullStack2()){
           System.out.println("Stack overflow"); 
           return;
        }
        
        stack2[++top2]=x;
    }

    int dequeue(){
        if (isEmptyStack2()){
            System.out.println("Stack underflow");
            return 0;
        }
        System.out.println("element deleted from Queue: "+stack2[top2]); 
        return stack2[top2--];
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


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        QueueUsingStack s = new QueueUsingStack();

        System.out.println("enter element in the queue");
        while (true) {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1: Enqueue element");
            System.out.println("2: Dequeue element");
            System.out.println("3: Display queue");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = sc.nextInt();
                    s.enqueue(element);
                    break;
                case 2:
                    while (!s.isEmptyStack1()) {
                        s.push2(s.pop1());
                    }
                    System.out.println(s.dequeue());
                    break;
                    case 3:
                    s.displayQueue();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
