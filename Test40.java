import java.util.Scanner;

public class Test40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine(); // Consume the newline
        
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine(); // Input string for this test case
            System.out.println(canEraseString(s) ? "YES" : "NO");
        }
    }

    // Function to check if the string can be fully erased
    public static boolean canEraseString(String s) {
        int countA = 0, countB = 0, countC = 0;
        
        // Count the occurrences of each letter in the string
        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                countA++;
            } else if (ch == 'B') {
                countB++;
            } else if (ch == 'C') {
                countC++;
            }
        }
        
        // Check if the total count of 'A' and 'B' or 'B' and 'C' is even
        // This is necessary for any sequence of turns to erase the string
        return (countA + countB) % 2 == 0 && (countB + countC) % 2 == 0;
    }
}
