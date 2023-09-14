import java.util.*;
public class Test8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        int curr=sc.nextInt(); 
        int prev=0,i; 
        for(i=0;i<n;i++) 
        { 
        char c=sc.next().charAt(0);
        if(c=='P') 
        { 
            prev = curr;  
            curr=sc.nextInt();
        } 
        else 
        { 
            int temp=curr; 
            curr = prev; 
            prev = temp;  
        } 
    } 
    System.out.println("Player "+ curr);  
    sc.close();
    }
}
}