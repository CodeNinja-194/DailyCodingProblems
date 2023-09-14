import java.util.*;
public class Test36 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(Decoder(a,a.length));
    }
    public static int Decoder(int[] a,int n)
    {
        int total=0;
        for(int i=0;i<n;i++)
        {
            int num=a[i];
            int digit1=Math.abs(num%10-5);
            int digit2=Math.abs((num/10)%10-5);
            int digit3=Math.abs((num/100)-5);
            num=100*digit3+10*digit2+digit1;
            int sum=getSum(num);
            if(sum>9)
            {
                sum=getSum(sum);
                total=total+sum;
            }
            else
            {
                total+=sum;
            }
        }
        return total;
    }
    public static int getSum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
}
