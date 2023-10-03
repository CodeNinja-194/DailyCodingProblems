import java.util.Scanner;

public class Test136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++)
            {
                int x = sc.nextInt();
                String s = sc.next();
                for (char c : s.toCharArray())
                {
                    if (c == 'D')
                    {
                        a[i]++;
                        if (a[i] == 10) a[i] = 0;
                    }
                    else
                    {
                        a[i]--;
                        if (a[i] == -1) a[i] = 9;
                    }
                }
            }
            for (int i = 0; i < n; i++)
            {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
