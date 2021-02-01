import java.util.Scanner;
import java.util.Vector;

public class CombinationsString {
    static Vector<String> v = new Vector<String>();

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        getCombinations(str, 0, str.length() - 1);
        
        for(String x : v) {
            System.out.println(x);
        }

        in.close();
    }

    static void getCombinations(String str, int l, int r) {
        if (l == r) 
			v.add(str);
		else
		{ 
			for (int i = l; i <= r; i++) 
			{ 
				str = swap(str,l,i); 
				getCombinations(str, l+1, r); 
				str = swap(str,l,i); 
			} 
        } 
    }

    static String swap(String s, int i, int j) 
	{ 
		char temp; 
		char[] charArray = s.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 
}
