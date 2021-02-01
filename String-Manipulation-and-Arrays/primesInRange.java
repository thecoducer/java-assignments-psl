import java.util.Scanner;
import java.util.Vector;

public class primesInRange {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int end = in.nextInt();

        Vector<Integer> result = primeNumsInRange(start, end);

        for(int i : result) {
            System.out.println(i + " ");
        }

        in.close();
    }

    static void simpleSieve(int limit, Vector<Integer> prime)
	{
		int bound = (int)Math.sqrt(limit);

		boolean[] mark = new boolean[bound + 1];
		for (int i = 0; i <= bound; i++) {
            mark[i] = true;
        }

		for (int i = 2; i * i <= bound; i++) {
			if (mark[i] == true) {
				for (int j = i * i; j <= bound; j += i) {
                    mark[i] = false;
                }
			}
		}

		for (int i = 2; i <= bound; i++) {
			if (mark[i] == true) {
                prime.add(i);
            }
		}
	}

    static Vector<Integer> primeNumsInRange(int low, int high)
	{
        Vector<Integer> result = new Vector<Integer>();
		Vector<Integer> prime = new Vector<Integer>();
		simpleSieve(high, prime); 

		boolean[] marked = new boolean[high - low + 1];
		for (int i = 0;i < marked.length;i++) {
            marked[i] = true;
        }

		for (int i = 0; i < prime.size(); i++) {

            int loLim = (low / prime.get(i)) * prime.get(i);
            
			if (loLim < low) {
                loLim += prime.get(i);
            }

			if (loLim == prime.get(i)) {
                loLim += prime.get(i);
            }

			for (int j = loLim;j <= high;j += prime.get(i)) {
				if (j != prime.get(i)) {
                    marked[j - low] = false;
                }
			}
		}

		for (int i = low; i <= high; i++) {
			if (marked[i - low] == true)
				result.add(i);
        }
        
        return result;
	}
}
