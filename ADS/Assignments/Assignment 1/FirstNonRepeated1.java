
import java.util.Scanner;
import java.util.HashMap;
public class FirstNonRepeated1 {
    static HashMap<Character, Integer> charCountMap = new HashMap<>();

    static void repeated (String str)
    {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCountMap.get(c) == 1) {
                System.out.println("First non-repeated character: " + c);
                return;
            }
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        repeated(str);
        sc.close();

    }
}
