import java.io.*;
import  java.util.*;
class User
{
        public static void main(String[] args) 
        {
        User user = new User(); // Create an instance of the User class
        int[] input1 = {12345, 67890, 54321}; // Sample input array of integers
        int input2 = input1.length; // The length of the input array
        // Call the OTPGen method with the input data
        long result = user.OTPGen(input1, input2);
        // Print the generated OTP
        System.out.println("Generated OTP: " + result);
        }
    public long OTPGen(int[] input1,int input2){
        // Read only region end
        // Write code here...
        String[] arr=new String[input2];
        for(int i=0;i<input2;i++)
        {
            arr[i]=Integer.toString(input1[i]);
        }
        TreeSet<Integer> tSet=new TreeSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length()-1;j++)
            {
                tSet.add(Integer.parseInt(arr[i].substring(j,j+2)));
            }
        }
        int set1=0;
        
        if(tSet.size()!=0)
        set1=tSet.first();
        //-------------------------
        TreeSet<Integer> tSet2=new TreeSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length();j++)
            {
                tSet2.add(arr[i].charAt(j)-'0');
            }
        }
        
        Iterator<Integer> it=tSet.iterator();
        
        
        int set2=0;
        int small=tSet2.first();
        int big=tSet2.last();
        if(small!=big)
            set2=small+big;

        return Long.parseLong(""+set1+set2);
        
    }
}

