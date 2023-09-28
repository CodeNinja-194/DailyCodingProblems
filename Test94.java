import java.util.Scanner;
public class Test94 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String s=sc.next();
            int z=0,c=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='z')
                {
                    z++;
                }
                if(s.charAt(i)=='n')
                {
                    c++;
                }
            }
            for(int i=0;i<c;i++)System.out.print(1+" ");
            
            for(int i=0;i<z;i++)System.out.print(0+" ");
    }
}
