public class Rotateone
{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int t=sc.nextInt();
        int arr[]={1,2,3,4,5,6,7};
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];  
        }
        arr[arr.length-1]=temp;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}