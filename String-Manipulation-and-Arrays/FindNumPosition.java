import java.util.Scanner;

public class FindNumPosition {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int nos[] = new int[100];

        for(int i=0;i<n;i++) {
            nos[i] = in.nextInt();
        }

        int num = in.nextInt();

        System.out.println(findPosition(num, nos));

        in.close();
    }

    static int findPosition(int num, int[] nos) {
        int res = 0;

        for(int i=0;i<nos.length;i++) {
            if(num == nos[i]) {
                res = i;
            }
        }

        return res;
    }
}
