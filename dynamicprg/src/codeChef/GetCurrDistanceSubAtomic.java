package codeChef;


import java.util.*;
        import java.lang.*;
        import java.io.*;


class GetCurrDistanceSubAtomic
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,q;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            q=Integer.parseInt(sarr[1]);
            String s=br.readLine();
            int[] arr=new int[n];
            int sum=0;
            for(int j=0;j<n;j++){
                arr[j]=s.charAt(j)-'0';
                if(j>0)
                  sum=sum+(arr[j]==arr[j-1]?2:1);
            }

            sarr=br.readLine().split(" ");
            for(int j=0;j<q;j++){
                int u=Integer.parseInt(sarr[j]);
                int diff=0;
                if(u==1){
                    if(n>1){
                        if(arr[u-1]==arr[u]){
                            diff=-1;
                            arr[u-1]=arr[u-1]==1?0:1;
                        }
                        else{
                            diff=1;
                            arr[u-1]=arr[u-1]==1?0:1;
                        }
                    }
                    else{
                        arr[u-1]=arr[u-1]==1?0:1;
                    }
                }
                else if(u==n&&n>1){
                    if(arr[u-1]==arr[u-2]){
                        diff=-1;
                        arr[u-1]=arr[u-1]==1?0:1;
                    }
                    else{
                        diff=1;
                        arr[u-1]=arr[u-1]==1?0:1;
                    }
                }
                else{
                    if(n>2){
                        if(arr[u-2]==0&&arr[u-1]==0&&arr[u]==0){
                            arr[u-1]=1;
                            diff=-2;
                        }
                        else if(arr[u-2]==0&&arr[u-1]==0&&arr[u]==1){
                            arr[u-1]=1;
                        }
                        else if(arr[u-2]==0&&arr[u-1]==1&&arr[u]==0){
                            arr[u-1]=0;
                            diff=2;
                        }
                        else if(arr[u-2]==0&&arr[u-1]==1&&arr[u]==1){
                            arr[u-1]=0;
                        }
                        else if(arr[u-2]==1&&arr[u-1]==0&&arr[u]==0){
                            arr[u-1]=1;
                        }
                        else if(arr[u-2]==1&&arr[u-1]==0&&arr[u]==1){
                            arr[u-1]=1;
                            diff=2;
                        }
                        else if(arr[u-2]==1&&arr[u-1]==1&&arr[u]==0){
                            arr[u-1]=0;
                        }
                        else if(arr[u-2]==1&&arr[u-1]==1&&arr[u]==1){
                            arr[u-1]=0;
                            diff=-2;
                        }

                    }
                }
                sum=sum+diff;
                System.out.println(sum);
            }
        }

    }
}
/*
1
3 3
010
2 1 3
 */