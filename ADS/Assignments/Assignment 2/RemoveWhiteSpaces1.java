import java.util.*;
public class RemoveWhiteSpaces1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String str2 = "";
		
		for (char ch : str.toCharArray()){
			 if (ch != ' ') {
                str2 += ch;
            }
		}
		
		System.out.println(str2);
	}
}
