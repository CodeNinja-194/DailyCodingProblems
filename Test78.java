import java.util.Scanner;
public class Test78 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int s=sc.nextInt();
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();

            int c1 = (int) Math.ceil((double) s / k1);
            int c2 = (int) Math.ceil((double) s / k2);

            if (c1 == c2) {
                System.out.println("-1");
            } else {
                System.out.println(Math.abs(c1 - c2) - 1);
            }
        }
    }
}
