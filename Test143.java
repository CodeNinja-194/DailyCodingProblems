import java.util.ArrayList;
import java.util.Scanner;

public class Test143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> v = new ArrayList<>();
            for (int i = n; i > 0; i--)
            {
                v.add(i);
            }
            // Collections.sort(v,Collections.reverseOrder());
            for (int i = 0; i < n; i++)
            {
                if (v.get(i) == i + 1)
                {
                    int temp = v.get(i);
                    v.set(i, v.get(i + 1));
                    v.set(i + 1, temp);
                }
            }
            for (int i = 0; i < n; i++)
            {
                System.out.print(v.get(i) + " ");
            }
            System.out.println();
        }
    }
}
