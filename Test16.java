import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int l = scanner.nextInt(); // Chef's writing speed
            int r = scanner.nextInt(); // Chef's coding speed
            int m = scanner.nextInt(); // Number of minutes
            
            int satisfaction = calculateSatisfaction(l, r, m);
            System.out.println(satisfaction);
        }

        scanner.close();
    }
    public static int calculateSatisfaction(int l, int r, int m) {
        // Calculate the maximum number of completed pages using coding speed
        int maxPagesFromCode = m / r;

        // Try each possible number of pages started with writing speed
        for (int pages = 0; pages <= maxPagesFromCode; pages++) {
            int remainingTime = m - (pages * r);

            // Check if Chef can complete a page within the remaining time
            if (remainingTime <= l && remainingTime >= 0) {
                return pages + (remainingTime / l); // Chef's satisfaction
            }
        }

        return 0; // Chef cannot complete any page or code
    }
}
