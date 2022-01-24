package Flipkart;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Pascal {
    public static int[] pascalTriangleRow(int rowNo) {
        int[][] pascal=new int[rowNo][rowNo];
        pascal[0][0]=1;
        for(int i=1;i<rowNo;i++)
            pascal[i][0]=1;
        for(int i=1;i<rowNo;i++){
            for(int j=1;j<rowNo;j++){
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
        }
        return pascal[rowNo-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            int[] arr=pascalTriangleRow(n);
            for(int j=0;j<n;j++)
                System.out.print(arr[j]+" ");
            System.out.println();
        }*/
        String[] s = { "C","D","A","ABC","XY","Y","CB" };
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num1=0;
                int j1=o1.length()-1;
                int c=0;
                while(j1>=0){
                    int x=((int)o1.charAt(j1))-64;
                    num1+=(((int)Math.pow(26,c))*x);
                    c++;
                    j1--;
                }
                int num2=0;
                int j2=o2.length()-1;
                c=0;
                while(j2>=0){
                    int x=((int)o2.charAt(j2))-64;
                    num2+=(((int)Math.pow(26,c))*x);
                    c++;
                    j2--;
                }
                if(num1<num2)
                    return -1;
                else if(num1==num2)
                    return 0;
                return 1;
            }
        });
        for(int i=0;i< s.length;i++)
            System.out.println(s[i]+" ");
    }
}
