import java.util.Scanner;

public class Test135 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
		int index1, index2;
		index1 = -1;
		index2 = -1;
		for (int i = 0; i < n; i++)
        {
			if (Math.abs(a[i] - a[(i + 1) % n]) < min)
            {
				min = Math.abs(a[i] - a[(i + 1) % n]);
				index1 = i;
				index2 = (i + 1) % n;
			}
		}
		if (n != 0)
        {
			System.out.println((index1 + 1) + " " + (index2 + 1));
		}
    }
}
