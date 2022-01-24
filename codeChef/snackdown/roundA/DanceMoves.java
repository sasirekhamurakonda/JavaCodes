package codeChef.snackdown.roundA;



import java.util.*;
        import java.lang.*;
        import java.io.*;
public class DanceMoves {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a,b;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            a=Integer.parseInt(sarr[0]);
            b=Integer.parseInt(sarr[1]);
            if(a==b){
                System.out.println("0");
            }
            else if(a<b){
                if((b-a)%2==0){
                    System.out.println((b-a)/2);
                }
                else{
                    System.out.println((b-a)/2+2);
                }
            }
            else{
                System.out.println(a-b);
            }
        }
    }
}
/*
Sample Input 1
4
3 8
-11 -5
57 492
-677 913
Sample Output 1
4
3
219
795
 */