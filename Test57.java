import java.util.*;
public class Test57
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
                int n=sc.nextInt();
                sc.nextLine();
                String s=sc.nextLine();
                s=s.toLowerCase();
                //HashSet<Character> h=new HashSet<>();
                ArrayList<Character> h=new ArrayList<>();
                h.add(s.charAt(0));
                for(int i=1;i<s.length();i++)
                {
                    if(!h.contains(s.charAt(i)) || h.contains(s.charAt(i)) && s.charAt(i-1)!=s.charAt(i))
                    {
                        h.add(s.charAt(i));
                    }
                    //if(h.contains(s.charAt(i)) && s.charAt(i-1)!=s.charAt(i))
                    //{
                    // h.add(s.charAt(i));
                    //}
                }
                String res="";
                for (Character i : h)
                {
                //System.out.println(i);
                res=res+i;
                
                }
            //System.out.println(res);
            //System.out.println(s);
                if(res.equals("meow"))
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                t--;
		}
	}
}