import java.util.Scanner;

public class ReplaceString {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String sourceStr = in.nextLine();
        String replaceThisStr = in.nextLine();
        String newStr = in.nextLine();
        System.out.println(findAndReplace(sourceStr, replaceThisStr, newStr));
        in.close();
    }

    static String findAndReplace(String sourceStr, String replaceThisStr, String newStr) {
        return sourceStr.replaceAll(replaceThisStr, newStr);
    }
}
