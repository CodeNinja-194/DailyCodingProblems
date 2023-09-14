import java.util.Arrays;
import java.util.Scanner;

public class Test48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Number of available rooms
        int k = scanner.nextInt(); // Number of rooms to select
        int[] roomNumbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            roomNumbers[i] = scanner.nextInt();
        }
        
        Arrays.sort(roomNumbers); // Sort the room numbers in ascending order
        
        int largestMinDistance = findLargestMinDistance(roomNumbers, k);
        System.out.println(largestMinDistance);
    }

    public static int findLargestMinDistance(int[] roomNumbers, int k) {
        int n = roomNumbers.length;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int currentDistance = roomNumbers[i + k - 1] - roomNumbers[i];
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
            }
        }

        return minDistance;
    }
}
