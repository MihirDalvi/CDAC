
import java.util.Scanner;

public class StringPalindrome1 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int start =0;
        int end = str.length()-1;
        boolean isPalindrome= true;
        while (start < end )
        {
            
            if (str.charAt(start) != str.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome == true){
            System.out.println(str+" is palindrome");
        }
        else{
            System.out.println(str+" is not palindrome");
        }
    }
}
