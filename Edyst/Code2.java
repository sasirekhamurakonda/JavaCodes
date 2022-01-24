package Edyst;


import java.util.*;
        import java.lang.*;
        import java.io.*;
public class Code2 {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        int[] arr2=new int[n];
        int min=Integer.MAX_VALUE;
        if(n==1)
            System.out.println("0");
        else {
            String[] sarr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sarr[i]);
                if (min > arr[i])
                    min = arr[i];
            }
            sarr = br.readLine().split(" ");
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr2[i] = Integer.parseInt(sarr[i]);
                if (arr2[i] > max)
                    max = arr2[i];
            }

            long[] res = new long[max + 1];
            for (int i = 0; i < n; i++) {
                res[arr[i]] = res[arr[i]] + 1;//++
                if (arr2[i] + 1 <= max)
                    res[arr2[i] + 1] = res[arr2[i] + 1] - 1;
            }
            for (int i = 1; i <= max; i++)
                res[i] += res[i - 1];
            for(int i=1;i<=max;i++)
                System.out.print(res[i]+" ");
            System.out.println();
            System.out.println(max);
            long max_so_far = 0, max_final = 0;
            boolean found=false;
            for (int i = min; i <= max; i++) {
                if (res[i] == n - 1 || res[i] == n) {
                    max_so_far++;
                    if(res[i]==n){
                        found=true;
                    }

                } else {
                    if (max_so_far > max_final)
                        max_final = max_so_far;
                    max_so_far = 0;
                }
            }
            if (max_so_far > max_final)
                max_final = max_so_far;
            if(found)
            System.out.println(max_final);
            else{

            }
        }
    }
}

/*
Example Input 1
2
4 6
10 8
Output
7
Explanation
Removed 2nd plant. Now the longest range being managed is [4, 10], whose length is 7
0 1 2 3 4 5 6 7 8 9 10
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 1 1 1 1 1 1 1
0 0 0 0 1 1 2 2 2 1 1




Example Input 1
4
1 2 3 4
4 4 4 4

0 0 0 0 0
0 1 1 1 1
0 1 2 2 2
0 1 2 3 3
0 1 2 3 4




Output
2
Explanation
There are 4 plant [1,4], [2,4], [3,4] and [4,4]. Removing the 4th plant gives us [3,4] as the longest range being supervised right now.

Example Input 3
4
1 2 3 4
2 3 4 5
Output
0


0 1 1 0 0 0
0 1 2 1 0 0
0 1 2 2 1 0
0 1 2 2 2 1

0 0 0 0 0 0



Explanation
Remove any one plant, longest range covered by all plants together remains unchanged.

for(int i=1;i<=max;i++)
            System.out.print(res[i]+" ");
        System.out.println();
        System.out.println(max);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
        if(n==1)
            System.out.println("0");
        else{
            long[] arr=new long[n];
            long[] arr2=new long[n];
            long min=Integer.MAX_VALUE;
            String[] sarr=br.readLine().split(" ");
            for(int i=0;i<n;i++) {
                arr[i] = Long.parseLong(sarr[i]);
                if(min>arr[i])
                    min=arr[i];
            }
            sarr=br.readLine().split(" ");
            long max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++) {
                arr2[i] = Long.parseLong(sarr[i]);
                if(arr2[i]>max)
                    max=arr2[i];
            }
            long[] res=new long[max+1];
            for(long i=0;i<n;i++){
                res[arr[i]]=res[arr[i]]+1;
                if(arr2[i]+1<=max)
                    res[arr2[i]+1]=res[arr2[i]+1]-1;
            }
            for(int i=1;i<=max;i++)
                res[i]+=res[i-1];

            long max_so_far=0,max_final=0;

            for(long i=min;i<=max;i++){
                if(res[i]==n-1||res[i]==n){
                    max_so_far++;
                }
                else{
                    if(max_so_far>max_final)
                        max_final=max_so_far;
                    max_so_far=0;
                }
            }
            if(max_so_far>max_final)
                max_final=max_so_far;
            System.out.println(max_final);
        }
1-10
2-5
6-9

0 1 1 1 1 1 1 1 1 1 1
0 1 2 2 2 2 1 1 1 1 1
0 1 2 2 2 2 2 2 2 2 1
0 1 2 2 2 2 2 2 2 2 1



 */