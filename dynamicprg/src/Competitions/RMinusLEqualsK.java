package Competitions;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RMinusLEqualsK
{
    public static void main(String[] args)throws IOException {
        int t,n,k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            k=Integer.parseInt(sarr[1]);
            sarr=br.readLine().split(" ");
            int[] A=new int[n];
            for(int j=0;j<n;j++){
                A[j]=Integer.parseInt(sarr[j]);
            }
            Arrays.sort(A);
            int min=A[0];
            int max=A[n-1];
            if(max-min<=k){//1 2 3 4 5 k=6 6-5+1=2
                System.out.println(k-max+min);
            }
            else{// 1 2 3 4 5 k=2
                /*
                2 2 3 4 5
                3 3 3 4 5
                1 1 1 4 7 7 7
                k=2
                diff=6
                diff=6-2=4
                2 2 2 4 7 7 7(count=3 diff=6)
                3 3 3 4 7 7 7(count=6 diff=4)
                4 4 4 4 7 7 7(count=9 diff=3)
                4 4 4 4 6 6 6(count=12 diff=2)

                k=2 ans = 3
                */
                int diff=max-min;
                diff=diff-k;
                int count=0;
                while(diff>0){
                    int leftIndex=0;
                    while(leftIndex<n-1&&A[leftIndex+1]==A[leftIndex]){
                        leftIndex++;
                    }
                    int rightIndex=n-1;
                    while(rightIndex>0&&A[rightIndex-1]==A[rightIndex]){
                        rightIndex--;
                    }
                    System.out.println(leftIndex+" "+rightIndex);
                    if(leftIndex-0>n-1-rightIndex){
                        count+=((n-1-rightIndex)+1);
                        for(int z=rightIndex;z<n;z++)
                            A[z]--;
                    }
                    else{
                        count+=((leftIndex-0)+1);
                        for(int z=0;z<=leftIndex;z++)
                            A[z]++;
                    }
                    for(int z=0;z<n;z++){
                        System.out.print(A[z]+" ");
                    }
                    System.out.println();
                    diff--;
                }
                System.out.println("Solution="+count);
            }

        }
    }
}
/*Alex loves politics.
This year he decided to be the General Secretary of the College Union Body.
 There are N hostels in college and the elections will last the next L days.
 Elections' format is similar to the USA's presidential election that means elections will be held hostel wise and
  whoever wins the most hostels among all candidates, wins the election.

His friends Adam and Bob are helping him. Adam has collected some confidential information (He has his methods)
regarding the starting day of campaigning for each hostel.
Bob has calculated the minimum number of days of campaigning needed for each hostel bi that guaranteeing Alex's victory in that hostel.

Let's denote that data for each hostel by ai and bi for i-th hostel. (1≤i≤N).

Alex can not campaign in two hostels simultaneously. Also, he has to campaign continuously bi days to win i-th Hostel.

Find the maximum number of hostels Alex can win during the election's time.

Input Format
The first line of input contains a single integer T (1≤T≤10), the number of test cases.

The first line of each test case contains two space-separated integers N and L (1≤N, L≤1000),
the number of hostels and the duration of the election, respectively.

Each of the following N lines contains two space-separated integers Ai and Bi (1≤ai, bi≤L),
 which means the campaigning in the ith hostel will be available from day ai and Alex needs at least bi days of campaigning to win there.

Output Format
Output a single line with the maximum number of hostels Alex can win during the election time.



Sample Testcase #0
Testcase Input
1
4 10
2 3
9 2
1 6
2 2
Testcase Output
3
Explanation
On Day 1 he will campaign at hostel 3.

On day 7 he will campaign at hostel 4.

On day 9 he will campaign at hostel 2.

Sample Testcase #1
Testcase Input
1
5 15
10 4
6 7
9 4
7 7
10 4
Testcase Output
1*/