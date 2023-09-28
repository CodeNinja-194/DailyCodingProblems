import java.util.Scanner;

public class Test85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String cards = scanner.nextLine();
            if (canSortCards(cards)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // Function to check if cards can be sorted to "abc" in one operation
    public static boolean canSortCards(String cards) {
        // Count the number of positions where the card is not in its correct position
        int count = 0;
        String s="abc";
        if(s.equals(cards))
        {
            return true;
        }
        // Check each card's position
        if (cards.charAt(0) != 'a') count++;
        if (cards.charAt(1) != 'b') count++;
        if (cards.charAt(2) != 'c') count++;

        // If there are exactly two positions out of place, we can swap them to get "abc"
        return count == 2;
    }
}
