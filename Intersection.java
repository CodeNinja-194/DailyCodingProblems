import java.util.*;
public class Intersection
{
    public static void main(String[] args)
    {
        int arr1[]={1,2,3,4,3,2,1,5,7,5,4,3,2};
        int arr2[]={3,4,5,6,2,1,3,2,4,7,2,3,4};
        intersection(arr1, arr2);
    }
    public static void intersection(int[] arr1, int[] arr2)
    {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    set.add(arr1[i]);
                }
            }
        }
        for(int i:set)
        {
            System.out.println(i+" ");
        }
    }
}
