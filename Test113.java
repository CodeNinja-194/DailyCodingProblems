import java.util.Scanner;
public class Test113
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		int len=s.nextInt();
		String str=s.next();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<len;i++)
		{
		max=Math.max(max,str.charAt(i)-'a'+1);
		}
		System.out.println(max);
		}
	}
}