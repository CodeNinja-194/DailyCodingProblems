import java.util.Scanner;

public class Test138 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long ans=0;
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            ans = (b - a) / (x + y);
            long tmp = (b - a) % (x + y);
            System.out.println((tmp!=0)?"-1":ans);
        }
    }
}
