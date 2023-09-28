import java.util.Scanner;
public class Test68
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int[] a = new int[128];
            int b = 0;
            int n1 = sc.nextInt();
            String c = sc.next();
            for (int i = 0; i < n1; i++)
            {
                if (a[c.charAt(i)] > 0)
                {
                    b++;
                }
                else
                {
                    b += 2;
                }
                a[c.charAt(i)]++;
            }
            System.out.println(b);
        }
    }
}