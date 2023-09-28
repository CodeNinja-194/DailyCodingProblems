import java.util.Scanner;

public class Test102 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        for (int i = 0; i < 5; i++) {
            String x = scanner.next();
            if (x.charAt(0) == s.charAt(0) || x.charAt(1) == s.charAt(1)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
        
        scanner.close();
    }
}
