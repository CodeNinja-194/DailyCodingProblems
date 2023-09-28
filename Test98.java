import java.util.Scanner;

public class Test98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        while (t-- > 0) {
            String s = scanner.nextLine();
            int[] a = new int[26];
            int n = s.length();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[s.charAt(i) - 'a'] = i;
            }
            String st = scanner.nextLine();
            for (int i = 1; i < st.length(); i++) {
                sum += Math.abs(a[st.charAt(i) - 'a'] - a[st.charAt(i - 1) - 'a']);
            }
            System.out.println(sum);
        }
    }
}
