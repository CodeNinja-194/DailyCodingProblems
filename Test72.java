import java.util.Scanner;
public class Test72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[15][15];
        for(int i=1; i<=1; i++)
        {
            for(int j=1; j<=n; j++)
                a[i][j]=1;
        }
        for(int i=2; i<=n; i++)
        {
            a[i][1]=1;
            for(int j=2; j<=n; j++)
            {
                a[i][j]=a[i-1][j]+a[i][j-1];
            }
        }
        System.out.println(a[n][n]);
    }
}
