
import java.util.*;
public class StackWithMinMethod1{

    static final int MAX = 5;
    int [] stack = new int[MAX];
    int top;
    int size;
    StackWithMinMethod()
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
    int getMin(){
        int min = stack[0];
        for (int i=0; i< top ; i++)
        {
            if (stack[i] < min){
                min = stack[i];
            } 
        }
        return min;
    }


    public static void main(String [] args)
    {
        StackWithMinMethod s = new StackWithMinMethod();

        s.push(3);
        s.push(5);
        s.push(7);
        s.push(8);

        s.pop();
        // s.displayAll();
        System.out.println(s.getMin());
    }
}
