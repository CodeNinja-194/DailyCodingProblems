import java.util.Scanner;

public class Test114 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(2);
                System.out.println("1 " + n);
                System.out.println("1 " + n);
            } else {
                System.out.println(4);
                System.out.println("1 " + n);
                System.out.println("2 " + n);
                System.out.println("1 2");
                System.out.println("1 2");
            }
        }
    }
}
