import java.util.Scanner;

public class Test119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String ans = "abcdefghijklmnopqrstuvwxyz";

        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            String s = scanner.nextLine();
            StringBuilder res = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (i + 2 < s.length() && s.charAt(i + 2) == '0' && s.charAt(i + 3) != '0') {
                    res.append(ans.charAt((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0' - 1)));
                    i += 2;
                } else {
                    res.append(ans.charAt(s.charAt(i) - '0' - 1));
                }
            }
            System.out.println(res);
        }
    }
}
