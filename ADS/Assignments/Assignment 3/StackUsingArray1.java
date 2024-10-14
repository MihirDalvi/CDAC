
import java.util.*;
public class StackUsingArray1{

    static final int MAX = 100;
    int [] stack = new int[MAX];
    int top;
    int size;
    StackUsingArray()
    {
        top = -1;
    }

    boolean isFull(){
        return top >= MAX -1;
    }

    boolean isEmpty(){
        return (top < 0);
    }

    void  push (int x)
    {
        if (isFull()){
           System.out.println("Stack overflow"); 
           return;
        }
        
        stack[++top]=x;
        size++;
        System.out.println(x+" element pushed on to the stack succefully");
    }

    int pop(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        size--;
        return stack[top--];
    }

    void displayAll() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        
        System.out.println(Arrays.toString(Arrays.copyOf(stack, size)));
    }

    public static void main(String [] args)
    {
        StackUsingArray s = new StackUsingArray();

        s.push(3);
        s.push(5);
        s.push(7);
        System.out.println("poped element"+s.pop());
        s.displayAll();
    }
}
