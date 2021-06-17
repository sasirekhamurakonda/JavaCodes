package Edyst;

public class Samples {
    /*


import java.util.*;
import java.lang.*;
import java.io.*;
public class AliveAndMakeAlive{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] sarr = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                arr[j] = Integer.parseInt(sarr[j]);
        }
    }
}



import java.util.*;
import java.lang.*;
import java.io.*;
public class OmkarAndMyBadStory{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> arrl=new ArrayList<>();
            String[] sarr = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                arrl.add(Integer.parseInt(sarr[j]));

        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class PaintersPartition {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());
        int t=Integer.parseInt(br.readLine());

    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class CodeChef {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a,b,r;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            a=Integer.parseInt(sarr[0]);
            b=Integer.parseInt(sarr[1]);
            r=Integer.parseInt(sarr[2]);
        }
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;
public class CodeChef {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        String[] sarr=br.readLine().split(" ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(sarr[i]);
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;
public class AliveAndMakeAlive{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String[] sarr = br.readLine().split(" ");
            int n=Integer.parseInt(sarr[0]);
            int m=Integer.parseInt(sarr[1]);
            int[] arr = new int[n];
            sarr = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i] = Integer.parseInt(sarr[i]);
            }

        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;


    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            int n,k;
            for(int i=0;i<t;i++){
                String[] sarr=br.readLine().split(" ");
                n=Integer.parseInt(sarr[0]);
                k=Integer.parseInt(sarr[1]);
                if(n<k)
                    System.out.println(n);
                else
                    System.out.println(n%k);

            }

        }
    }

import java.util.*;
import java.lang.*;
import java.io.*;
public class HowIMetYourMother  {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long x1,x2,x3,r;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            x1=Long.parseLong(sarr[0]);
            x2=Long.parseLong(sarr[1]);
            x3=Long.parseLong(sarr[2]);
            r=Long.parseLong(sarr[3]);

        }
    }
}

    import java.io.*;
import java.util.*;

public class Demo{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException{
        int testcase = Integer.parseInt(br.readLine());
        while(testcase-->0){
            int n = Integer.parseInt(br.readLine());
            Integer[] a = new Integer[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            int cnt = 0;
            Arrays.sort(a,(o1,o2)->{
                if(o1%2==1 && o2%2 == 1){
                    return o2-o1;
                }
                    if(o1%2==1){
                        return 1;
                    }if(o2%2==1){
                        return -1;
                    }
                    return o2-o1;
                    }
                );
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(gcd(a[i],a[j]*2)){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
    static boolean gcd(int a,int b){
        if(b==0){
            if(a==1)return false;
            else return true;
        }
        return gcd(b,a%b);
    }
}



    */
}
