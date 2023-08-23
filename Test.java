import java.util.*;
public class Test {
    public static void main(String[] args) {
        int p=1,k,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        sc.close();
        for(int i=1;i<n;i++)
        {
            int np=0;
            for(int j=1;j<k;j++)
            {
                for(int q=0;q<p;q++)
                {
                    np++;
                }
            }
            p=np;
        }
        System.out.println(p);
    }
}
// using namespace std;
// typedef long long ll;
// int main() {
// 	int k;
// 	cin>>k;
// 	while(k--){
// 	    int a,b,p,q;
// 	    cin>>a>>b>>p>>q;
// 	    int ca,cb;
// 	    if(q<a*p) 
// 	    cout<<-1<<endl;
// 	    else{
// 	        cb=(q-a*p)/(b-a);
// 	        if(cb>p) cb=p;
// 	        ca=p-cb;
// 	        cout<<ca<<" "<<cb<<endl;
// 	    }
// 	}
// 	return 0;
// }