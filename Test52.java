import java.util.*;
public class Test52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            char ch[][]=new char[8][8];
            String res="";
            for(int i=0;i<8;i++)
            {
                String row = sc.next();
                for(int j=0;j<8;j++)
                {
                    ch[i][j]= row.charAt(j);
                }
            }
            
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    if(ch[i][j]!='.')
                    {
                        res+=ch[i][j];
                    }
                }
            }
            System.out.println(res);
            res="";
        }
    }
}
