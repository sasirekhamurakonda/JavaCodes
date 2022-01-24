package Codeforces.round729;


import java.lang.*;
import java.io.*;
import java.util.HashMap;

public class FindIfNPresentOrNot{

    public static boolean findNPresentOrNot(long n, long a, long b, long curr, HashMap<Long, Boolean> memo){
        System.out.println(curr);
        if(curr>n)
            return false;
        if(curr==n)
            return true;
        if(memo.containsKey(curr)){
            return memo.get(curr);
        }
        boolean res=false;
        if(curr*a>n && curr+b>n){
            memo.put(curr,false);
            return false;
        }
        if(n%(curr*a)==0){
            memo.put(curr,true);
            return true;
        }
        if((n-curr)%b==0){
            memo.put(curr,true);
            return true;
        }
        System.out.println("Before recursive calls "+(curr*a)+" "+(curr+b));
        if(a==1||((curr*a)>n&&(n-curr)%b==0)){
            res=findNPresentOrNot(n,a,b,curr+b,memo);
        }
        else if(b==1||(curr+b)>n||(n-curr)%b!=0){
            res=findNPresentOrNot(n,a,b,curr*a, memo);
        }
        else {
            res = findNPresentOrNot(n, a, b, curr * a, memo) || findNPresentOrNot(n, a, b, curr + b, memo);
        }
        System.out.println("After recursive calls "+(curr*a)+" "+(curr+b)+" "+res);
        memo.put(curr,res);
        return res;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long a,b,n;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Long.parseLong(sarr[0]);
            a=Long.parseLong(sarr[1]);
            b=Long.parseLong(sarr[2]);
            HashMap<Long,Boolean> memo=new HashMap<>();
            if(n==1)
                System.out.println("Yes");
            else if(a>n&&b>n){
                System.out.println("No");
            }
            else if(a==1){
                if(n>=b&&b==1)
                    System.out.println("Yes");
                else if(n>=b&&((n-1)%b)==0)
                    System.out.println("Yes");
            }
            else if(n>=b&&b==1)
                System.out.println("Yes");
            else {
                if(helper(n, a, b, 1,memo))
                    System.out.println("Yes");
                else
                    System.out.println("No");

            }
        }
    }
    static boolean helper(long n,long a,long b,long curr,HashMap<Long,Boolean> memo){
        if(n==curr)return true;
        if(curr>n)return false;
        if((n-curr)%b==0)return true;
        if(n%(curr*a)==0)return true;
        if(memo.containsKey(curr))
            return memo.get(curr);
        if(curr*a<n) {
            boolean res= helper(n, a, b, curr*a, memo);
            memo.put(curr,res);
            return res;
        }
        return false;
    }

}
/*
5
24 3 5
10 3 6
2345 1 4
19260817 394 485
19260817 233 264
 */