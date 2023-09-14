import java.util.*;
public class Test28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int earn=0;
        for (int i = 0; i < m; i++) {
            if (arr[i] > 0)
                break;
            else
                arr[i] = Math.abs(arr[i]);

            earn += arr[i];
        }
        System.out.println(earn);
        }
}
