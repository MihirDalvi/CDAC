
import java.util.Scanner;

public class StringReverseStack {

    static final int MAX = 100;
    int top;
    char arr[] = new char[MAX];

    StringReverseStack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }


    boolean push(char x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        }
        arr[++top] = x;
        return true;
    }


    char pop() { 
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return '\0'; 
        }
        return arr[top--];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to reverse:");
        String input = sc.nextLine();
        int size = input.length();

        StringReverseStack s1 = new StringReverseStack();
        for (char c : input.toCharArray()) {
            s1.push(c);
        }

        StringBuilder reverse = new StringBuilder(); 
        while (!s1.isEmpty()) {
            reverse.append(s1.pop()); 
        }

        System.out.println("Reversed string: " + reverse.toString());
        sc.close();
    }
}
