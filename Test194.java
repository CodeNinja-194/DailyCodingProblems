import java.util.*;
public class Test194 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            ArrayList<Integer> res= new ArrayList<>();
            int diff = 0;
            for(int i = 1;i<n;i++)
            {
            diff = arr[i]-arr[i-1];
            res.add(diff);
            }
            Collections.sort(res);
            System.out.println(res.get(0));
        }
        sc.close();
    }
}
