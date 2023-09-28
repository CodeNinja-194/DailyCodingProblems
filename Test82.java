import java.util.Scanner;
public class Test82 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(trap(a));
    }
    public static int trap(int[] arr) {
        int n = arr.length;
        int  res=0;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        
        for(int i=0;i<n;i++){
            res+=Math.min(leftmax[i],rightmax[i])-arr[i];
        }
        return res;
    }
}
// 8 0 1 0 2 1 0 1 3