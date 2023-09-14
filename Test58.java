import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Test58 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Set set = new HashSet();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int narr [] = new int[1000000];
        int t= input.nextInt();
        while(t!=0){
            int count=0;
            char arr [][] = new char[20][20];
        for (int i=0;i<=7;i++){
            String s =input.next();
        for (int j=0;j<=7;j++){
        arr[i][j] =s.charAt(j);
        
        }
        }
            int row=0;
            int coul=0;
        for (int i=0;i<=7;i++){
        for (int j=0;j<=7;j++){
        if (arr[i][j]=='#'&&arr[i][j+2]=='#'&&row==0){
        row =(i+1)+1;
        coul=(j+1)+1;
        break;
        }
        }
        }
            System.out.println(row+" "+coul);
        row=0;
        coul=0;
        t--;
    }
        }
    }
                