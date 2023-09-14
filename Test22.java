import java.util.*;
public class Test22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=1;
        while(t-->0)
        {
            int n=sc.nextInt();
            String str[]=new String[n];
            for(int i=0;i<n;i++)
            {
                str[i]=sc.next();
            }
            String ans=str[0];
            for(int i=1;i<str.length-1;i++)
            {
                while(str[i].indexOf(ans, i)!=0)
                {
                    ans=ans.substring(0,ans.length()-i);
                    if(ans.isEmpty())
                    System.out.println("-1");
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}