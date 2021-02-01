import java.util.Scanner;

public class NumberOfWords {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String sentence = in.nextLine();
        String word = in.nextLine();

        System.out.println(check(sentence, word));

        in.close();
    }

    static int check(String sentence, String word) {
        int count = 0;
        String words[] = sentence.split(" ");

        for(String w : words) {
            if(w.equalsIgnoreCase(word)) {
                count++;
            }
        }

        return count;
    }
}