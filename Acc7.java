import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Acc7 {
    public static List<Integer> findMVP(int[] A, int n) {
        List<Integer> result = new ArrayList<>();
        int maxRight = A[n - 1]; // Initialize the maximum as the rightmost element

        // The rightmost element is always an MVP
        result.add(maxRight);

        // Iterate from the second rightmost element to the leftmost element
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] >= maxRight) {
                result.add(A[i]);
                maxRight = A[i]; // Update the maximum if a new MVP is found
            }
        }

        // Reverse the result list to maintain the original order
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        int[] A1 = {16, 17, 4, 3, 5, 2};
        int n1 = A1.length;
        List<Integer> result1 = findMVP(A1, n1);
        System.out.println(result1); // Output: [17, 5, 2]

        int[] A2 = {1, 2, 3, 4, 0};
        int n2 = A2.length;
        List<Integer> result2 = findMVP(A2, n2);
        System.out.println(result2); // Output: [4, 0]
    }
}
