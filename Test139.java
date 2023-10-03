import java.util.Scanner;

public class Test139 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            System.out.println(((b > a && d > c && c > a && d > b) || (a > c && b > d && d > c && b > a) || (c > d && a > b && b > d && a > c) || (d > b && c > a && a > b && c > d))?"YES":"NO");
        }
    }
}
