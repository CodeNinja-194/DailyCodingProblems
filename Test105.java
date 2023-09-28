import java.util.Arrays;
import java.util.Scanner;

public class Test105 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(n==1 && arr[0]>=2){
                System.out.println("NO");
                continue;
            }
            else if(n==1 && arr[0]==1){
                System.out.println("YES");
                continue;
            }
            Arrays.sort(arr);
            if(arr[n-1]-arr[n-2]>1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
