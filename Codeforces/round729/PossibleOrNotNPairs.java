package Codeforces.round729;


import java.util.*;
        import java.lang.*;
        import java.io.*;
public class PossibleOrNotNPairs {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            String[] sarr = br.readLine().split(" ");
            int element;
            int even=0;
            for (int j = 0; j < 2*n; j++){
                element=Integer.parseInt(sarr[j]);
                if(element%2==0)
                    even++;
            }
            if(even==n)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
