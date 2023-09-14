import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            int length = input.length();
            int sum = Math.abs('a' - input.charAt(0));
            if (Math.abs(26 - sum) < sum) {
                sum = 26 - sum;
            }
            for (int i = 0; i < length - 1; i++) {
                int a = Math.abs(input.charAt(i) - input.charAt(i + 1));
                int b = Math.abs(26 - a);
                if (a > b) {
                    a = b;
                }
                sum += a;
            }
            System.out.println(sum);
            break;
        }
    }
}
