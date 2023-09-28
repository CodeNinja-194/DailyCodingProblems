import java.util.Scanner;
public class Test96 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            boolean res = (n > 2) || (s.contains("00")) || (s.contains("11"));
            System.out.println(!res?"YES":"NO");
        }
    }
}
