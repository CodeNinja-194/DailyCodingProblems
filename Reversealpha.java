import java.util.*;
public class Reversealpha {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        char[] charArray = s.toCharArray();
        reverse(charArray);
        String revStr = new String(charArray);
        System.out.println("Output string: " + revStr);
        sc.close();
    }
    public static void reverse(char str[]) 
    {
        int r = str.length - 1, l = 0;
        while (l < r) 
        {
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;
            else 
            {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
}
