import java.util.Scanner;

public class Test128 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String pi = "314159265358979323846264338327";
        while (t-- > 0)
        {
            String s = sc.nextLine();
            if (s.charAt(0) != pi.charAt(0))
            {
                System.out.println(0);
            }
            else
            {
                int cnt = 0;
                for (int i = 0; i < s.length(); i++)
                {
                    if (s.charAt(i) == pi.charAt(i))
                    {
                        cnt++;
                    }
                    else
                    {
                        break;
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
