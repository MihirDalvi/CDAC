
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class RepeatedCharcter1 {
    static HashSet <Character> charSet = new HashSet<>();
    static ArrayList <Character> charArray= new ArrayList<>();

    static void repeated (String str)
    {
       for (int i = 0; i < str.length(); i++)
       {
        char c = str.charAt(i);
        if (!charSet.contains(c))
        {
            charSet.add(c);
        }
        else{
            charArray.add(c);
        }
       }

       System.out.println("Repeated characters: ");
       System.out.println(charArray.toString());
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        repeated(str);

    }
}
