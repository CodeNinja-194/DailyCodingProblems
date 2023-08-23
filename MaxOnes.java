public class MaxOnes {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,4,5,2,1,1,1,2,1,2,1,5};
        System.out.println(maxOnes(arr,arr.length));
    }
    public static int maxOnes(int[] arr,int n)
    {
        int count=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
                count++;
            else
                count=0;
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
    
}
