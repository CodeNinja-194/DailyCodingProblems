import java.util.HashSet;
import java.util.Set;

// Java Program to find the total
// number of distinct years
public class Distnict 
{
	public static int distinct_year(String str) 
    {
		String s = "";
		Set<String> uniqueyears = new HashSet<>();
		for (int i = 0; i < str.length(); i++) 
        {
			if (Character.isDigit(str.charAt(i))) 
            {
				s += (str.charAt(i));
			}
			if (str.charAt(i) == '-') 
            {
				s = "";
			}
			if (s.length() == 4) 
            {
				uniqueyears.add(s);
				s = "";
			}
		}
	return uniqueyears.size();
	}
	static public void main(String[] args) {
		String str = "UN was established on 24-10-2003."
				+ "India got freedom on 15-08-2034.";

		System.out.println(distinct_year(str));
	}
}
