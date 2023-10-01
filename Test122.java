import java.util.Scanner;

public class Test122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int z = 1; z <= t; z++) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            String str = scanner.nextLine();

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == 'D') {
                    ans.append("U");
                } else if (str.charAt(i) == 'U') {
                    ans.append("D");
                } else {
                    ans.append(str.charAt(i));
                }
            }
            System.out.println(ans);
        }
    }
}
