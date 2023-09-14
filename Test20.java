import java.util.*;
public class Test20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long a[]=new long[n];
            int k=0;
            for(int i=1; i<=n; i++){
                a[k++]=(long)Math.pow(2,i);
            }
            int div=0,sum1=0,sum2=0,ans=0;
            div=n/2;
            sum1=(int)a[n-1];
            for(int i=0; i<=div-2; i++){
                sum1+=a[i];
            }
            for(int i=div-1; i<n-1; i++){
                sum2+=a[i];
            }
            ans =Math.abs(sum1 - sum2);
            System.out.println(ans);
        }
    }
}
