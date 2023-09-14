import java.util.*;
public class Test37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(window(a));
    }
    public static int window(int[] a)
    {
        // Arrays.sort(a);
        int n=a.length;
        int maximumSub = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int left = 0; left < n; left++){
            int WindowSum = 0;
            for (int right = left; right < n; right++) {
                WindowSum += a[right];
                if (WindowSum > maximumSub) {
                    maximumSub = WindowSum;
                    start = left;
                    end = right;
                }
            }
            }
            return maximumSub;
            }
}
