import java.util.Scanner;

public class StringReverse {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(makeReverse(s));
        in.close();
    }

    static String makeReverse(String str) {
        String strArray[] = str.split(" ");
        String res = "";

        for(String s : strArray) {
            res += new StringBuilder(s).reverse().toString();
            res += " ";
        }

        return res.trim();
    }
}
