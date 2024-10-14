import java.util.Scanner;
import java.util.HashMap;
public class NonRepeatedCharacter1 {
    static HashMap<Character, Integer> charCountMap = new HashMap<>();

    static void repeated (String str)
    {
       for (int i = 0; i < str.length(); i++)
       {
        char c = str.charAt(i);
        if (charCountMap.containsKey(c)){

            charCountMap.put(c,charCountMap.get(c)+ 1);
        }
        else{
            charCountMap.put(c,1);
        }
       }
       for (HashMap.Entry<Character,Integer> entries : charCountMap.entrySet())
       {
        if (entries.getValue() == 1) {
            System.out.println(entries.getKey());
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
