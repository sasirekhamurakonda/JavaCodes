package kickstart.roundg2021;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class FeedAllDogsOrNot {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,d;
        long c,m;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            d=Integer.parseInt(sarr[1]);
            c=Long.parseLong(sarr[2]);
            m=Long.parseLong(sarr[3]);
            char[] cd=br.readLine().toCharArray();
            int j=0;
            for(j=0;j<n;j++){
                if(cd[j]=='D'){
                    if(d>0){
                        d--;
                        c+=m;
                    }
                    else{
                        break;
                    }
                }
                else{
                    if(c>0){
                        c--;
                    }
                    else{
                        break;
                    }
                }
            }

            if(j==n) {
                System.out.println("Test Case #" + (i + 1) + ": YES");
            }
            else{
                boolean found=false;
                for(int k=j;k<n;k++){
                    if(cd[k]=='D'){
                        found=true;
                        System.out.println("Test Case #" + (i + 1) + ": NO");
                    }
                }
                if(!found)
                System.out.println("Test Case #"+(i+1)+": YES");
            }


        }
    }
}
/*
3
6 10 4 0
CCDCDD
4 1 2 0
CCCC
4 2 1 0
DCCD
 */