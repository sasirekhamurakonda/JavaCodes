package daaLab;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SumOfSubFlipkart {

    /*public static void findSubsetSum(int[] A,int n,int s,int index,int r,int target,int[] x){

        x[index]=1;
        if(s+A[index]==target)
            return;
        else if(index+1<n&&s+A[index]+A[index+1]<=target)
            findSubsetSum(A,n,s+A[index],index+1,r-A[index],target,x);
        if(index+1<n&&s+r-A[index]>=target&&s+A[index+1]<=target){
            x[index]=0;
            findSubsetSum(A,n,s,index+1,r-A[index],target,x);
        }
    }
    public static boolean hasValidSubset(int[] A, int target) {
        // add your logic here
        int s=0,r=0;
        int n=A.length;
        Arrays.sort(A);
        for(int i=0;i<n;i++){
            r=A[i]+r;
        }
        int[] x=new int[n];
        int sum=0;
        findSubsetSum(A,n,s,0,r,target,x);
        for(int i=0;i<n;i++){
            if(x[i]==1){
                sum=sum+A[x[i]];
            }
        }
        System.out.println(sum);
        return sum==target;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n;
        int[] arr;
        for(int i=0;i<t;i++){
            n=Integer.parseInt(br.readLine());
            String[] sarr=br.readLine().split(" ");
            arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=Integer.parseInt(sarr[j]);
            }
            int target=Integer.parseInt(br.readLine());
            System.out.println(hasValidSubset(arr,target));
        }
    }*/
    public static void cubeRootOfN(long n) {
        long left = 0, right = n, mid;
        boolean negative = false;
        if (n < 0) {
            n = -n;
            negative = true;

            right = n;
        }

        //if (n >= 1000000000)
            right = 1000000;
        while (left <= right) {
            mid = (left + right) / 2;

            if (mid * mid * mid == n) {

                if (negative)
                    System.out.println(-mid);
                else
                    System.out.println(mid);

                break;
            } else if (mid * mid * mid > n)
                right = mid - 1;
            else
                left = mid + 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            if(n==-0) {
                System.out.println("-0");
            }
            else
                cubeRootOfN(n);
        }
    }
}
/*1331
        12	1728
        13	2197
        14	2744
        15	3375

Avi is creating a machine to do houselhold tasks.

There are N balls put on a line. The ith ball from the left is at position Xi. He would like to put all of the balls in a basket at posiion 0.

The machine starts at position 0.

It can move left and right along the line.

Pick a ball when it comes to the position of that ball

Carry those balls and put them in the basket at the position 0.

It is not allowed to put balls anywhere except in the basket.

The electronic machine consumes Y energy units while picking a ball or putting any number of balls in the basket.

It also consumes (Z+1)2 units to travel by a distance of 1 when it is carrying Z balls.

Constraints:

1 <= N <= 2 * 105
0 < X1 < X2 < ... < XN < 109
1 <= Y <= < 109
Input Format:

N Y
X1 X2 ... XN

Output Format:

Print the minimum units required to put all N balls in the basket.

Sample Testcase 0

Input:

2 100
1 10
Output:
355

Explanation:
Move to position 10, 10 units
Pick up the ball, 100 units
Travel to position 1, 36 units
Pick up the ball, 100 units
Travel to position 0, 9 units
Put the two balls in the basket, 100 units
Total: 10 + 100 + 36 + 100 + 9 + 100 = 355 units
*/