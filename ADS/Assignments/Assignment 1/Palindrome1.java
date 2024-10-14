
import java.util.Scanner;


public class Palindrome1 {
        
    static int palindrome(int num, int rev){
        if (num == 0){
            return rev;
        }
        int rem = num % 10;
        rev = rev *10 +rem;
        return palindrome(num /10 , rev);
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String str = palindrome(num ,0) == num ? num+" is palindrome":num+" is not palindrome";
    
        System.out.println(str);
        sc.close();

    }
}
