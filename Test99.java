import java.util.Scanner;

public class Test99 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Number of friends
            int[] friends = new int[N];
            for (int i = 0; i < N; i++) {
                friends[i] = scanner.nextInt(); // Friendship levels
            }

            int swaps = findMinimumCandies(friends);
            System.out.println(swaps);
        }

        scanner.close();
    }

    public static int findMinimumCandies(int[] friends) {
        int swaps = 0;
        int n = friends.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (friends[j] > friends[j + 1]) {
                    // Swap friends[j] and friends[j + 1]
                    int temp = friends[j];
                    friends[j] = friends[j + 1];
                    friends[j + 1] = temp;
                    swaps++;
                }
            }
        }

        return swaps;
    }
}
