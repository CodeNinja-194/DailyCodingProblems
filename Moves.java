public class Moves {
    public static void main(String[] args) {
        int[] arr={0,0,1,0,2,3,4};
        int n=arr.length;
        int z=0;
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                z++;
            }
            else
            {
                temp[j]=arr[i];
                j++;
            }
            if(j==n)
            {
                break;
            }   
            if(z==n)
            {
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
