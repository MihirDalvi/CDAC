
import java.util.*;
public class ParenthesisEvaluaion1{

    static final int MAX = 100;
    char [] stack = new char[MAX];
    int top;
    int size;
    ParenthesisEvaluaion()
    {
        top = -1;
    }

    boolean isFull(){
        return top >= MAX -1;
    }

    boolean isEmpty(){
        return (top < 0);
    }

    void  push (char x)
    {
        if (isFull()){
           System.out.println("Stack overflow"); 
           return;
        }
        
        stack[++top]=x;
        size++;
        System.out.println(x+" element pushed on to the stack succefully");
    }

    char pop(){
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
	
	char peek(){
		if (top < 0) {
		  return '0';  
		} 
		else{
		   return stack[top];
		} 
		 
	}
	

    public static void main(String [] args)
    {
        ParenthesisEvaluaion s = new ParenthesisEvaluaion();

        Scanner sc = new Scanner(System.in);
		
		String expression = sc.nextLine();
		
		for (int i = 0; i < expression.length(); i++)
		{
			if (expression.charAt(i) == '[' || expression.charAt(i) == '{' || expression.charAt(i) == '(' ){
				s.push(expression.charAt(i));
			}
			else{
				
				if (!(s.isEmpty()) &&
					(s.peek() == '(' && expression.charAt(i) == ')' || 
					 s.peek() == '{' && expression.charAt(i) == '}' ||
					 s.peek() == '[' && expression.charAt(i) == ']'))
					 {
					 
					 System.out.println("element popped "+s.pop());
				}
				else {
					System.out.println("not a balanced expression");
					break;
				}
			}
		}
    }
}
