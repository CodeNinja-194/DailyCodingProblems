import java.util.*;
public class Test55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int answer=0;
            for (int a = 0; a * a <= n && a <= m; ++a) {
                int b = n - a * a;
                if (a + b * b == m) {
                    answer += 1;
                }
            }
            System.out.println(answer);
    }
}