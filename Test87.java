import java.util.Scanner;
public class Test87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String[] f = new String[10];
            for (int i = 0; i < 10; i++) {
                f[i] = scanner.nextLine();
            }

            int ans = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (f[i].charAt(j) == 'X') {
                        if (i == 0 || i == 9) {
                            ans += 1;
                        } else if (i == 1 || i == 8) {
                            if (j >= 1 && j <= 8) {
                                ans += 2;
                            } else {
                                ans += 1;
                            }
                        } else if (i == 2 || i == 7) {
                            if (j >= 2 && j <= 7) {
                                ans += 3;
                            } else if (j == 1 || j == 8) {
                                ans += 2;
                            } else {
                                ans += 1;
                            }
                        } else if (i == 3 || i == 6) {
                            if (j >= 3 && j <= 6) {
                                ans += 4;
                            } else if (j == 2 || j == 7) {
                                ans += 3;
                            } else if (j == 1 || j == 8) {
                                ans += 2;
                            } else {
                                ans += 1;
                            }
                        } else if (i == 4 || i == 5) {
                            if (j >= 4 && j <= 5) {
                                ans += 5;
                            } else if (j == 3 || j == 6) {
                                ans += 4;
                            } else if (j == 2 || j == 7) {
                                ans += 3;
                            } else if (j == 1 || j == 8) {
                                ans += 2;
                            } else {
                                ans += 1;
                            }
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
