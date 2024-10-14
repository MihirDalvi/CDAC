
import java.util.*;
public class ReverseWordsInaString {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringTokenizer ob = new StringTokenizer(str , " ");
        System.out.println(+ob.countTokens());

        String [] stringArray =  new String[ob.countTokens()];

        for (int i =0; i < stringArray.length; i++){
            stringArray[i] = ob.nextToken();
        }

        // for (String ele : stringArray){
        //     System.out.println(ele);
        // }
        for(int j = stringArray.length -1 ; j >= 0; j--){
            System.out.print(stringArray[j]+" ");
        }
    }
}
