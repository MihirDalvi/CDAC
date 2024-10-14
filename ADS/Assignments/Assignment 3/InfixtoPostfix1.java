
import java.util.Scanner;
public class InfixtoPostfix1 {

    public final int max = 100;
    char [] stack = new char[max];
    int top;

    InfixtoPostfix (){
        top = -1;
    }
    boolean isEmpty(){
        return (top < 0);
    }
    boolean isFull(){
        return (top == max-1);
    }

    void push (char d)
    {
        if (isFull()){
            return;
        }

        stack[++top] = d;
    }
    char peek() {
        if (isEmpty()) {
            return '\0'; // Return null character if stack is empty
        }
        return stack[top]; // Peek the top operator without popping
    }

    char pop(){
        if (isEmpty()){
            return '0';
        }
        return stack[top--];
    }
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        InfixtoPostfix pf = new InfixtoPostfix();

        String expression = sc.nextLine();
        StringBuilder postFix = new StringBuilder();

        for (int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);

            if (Character.isDigit(ch) || Character.isLetter(ch))
            {
                postFix.append(ch);
            }
            else if (isOperator(ch)) {
                while (!(pf.isEmpty()) && precedence(pf.peek()) >= precedence(ch)) {
                    postFix.append(pf.pop());
                }
                pf.push(ch); // Push the current operator onto the stack
            }
        }
        while (!pf.isEmpty()) {
            postFix.append(pf.pop());;

        System.out.println("Postfix expression: "+postFix);
        
        
    }
}
}
