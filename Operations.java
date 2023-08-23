import java.util.*;
import java.lang.String;
public class Operations {
    public static int minMovesToConvert(String A, String B) {
        int N = A.length();
        int moves = 0;

        for (int i = 0; i < N; i++) {
            String subset = A.substring(0, i + 1);
            char smallest = subset.charAt(0);
            for (int j = 1; j < subset.length(); j++) {
                if (subset.charAt(j) < smallest) {
                    smallest = subset.charAt(j);
                }
            }

            StringBuilder newSubset = new StringBuilder();
            for (int j = 0; j < subset.length(); j++) {
                newSubset.append(smallest);
            }

            A = A.substring(0, i + 1) + A.substring(i + 1).replaceFirst(subset, newSubset.toString());
            moves++;

            if (A.equals(B)) {
                return moves;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        
        int result = minMovesToConvert(A, B);
        System.out.println(result);
    }
}
