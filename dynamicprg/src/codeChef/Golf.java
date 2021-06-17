package codeChef;

import java.lang.*;
import java.io.*;
public class Golf {
    int maxDistance(int[][] market) {
        int n=market.length;
        int m=market[0].length;
        int max=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(market[i][j]==0){
                    int curmax=Integer.MAX_VALUE;
                    int k=i-1;
                    int l=0;
                    if(k>=0){
                        while(k>=0&&market[k][j]==0)
                            k--;
                        if(k>=0){
                            curmax=Math.min(curmax,i-k);
                        }
                    }


                    k=i+1;
                    if(k<n){
                        while(k<n&&market[k][j]==0)
                            k++;
                        if(k<n){
                            curmax=Math.min(curmax,k-i);
                        }
                    }


                    k=j-1;
                    if(k>=0){
                        while(k>=0&&market[i][k]==0)
                            k--;
                        if(k>=0){
                            curmax=Math.min(curmax,j-k);
                        }
                    }


                    k=j+1;
                    if(k<m){
                        while(k<m&&market[i][k]==0)
                            k++;
                        if(k<m){
                            curmax=Math.min(curmax,k-j);
                        }
                    }

                    k=i-1;
                    l=j+1;
                    while(k>=0&&l<m&&market[k][l]==0){
                        k--;
                        l++;
                    }
                    if(k>=0&&l<m){
                        curmax=Math.min(curmax,(i-k+j-l));
                    }
                    k=i+1;
                    l=j-1;
                    while(k<n&&l>=0&&market[k][l]==0){
                        k++;
                        l--;
                    }
                    if(k<n&&l>=0){
                        curmax=Math.min(curmax,(k-i+l-j));
                    }


                    k=i+1;
                    l=j+1;
                    while(k<n&&j<n&&market[k][l]==0){
                        k++;
                        l++;
                    }
                    if(k<n&&l<m){
                        curmax=Math.min(curmax,(k-i+l-j));
                    }

                    k=i-1;
                    l=j-1;
                    while(k>=0&&l>=0&&market[k][l]==0){
                        k--;
                        l--;
                    }
                    if(k>=0&&l>=0){
                        curmax=Math.min(curmax,(i-k+j-l));
                    }

                    max=Math.max(max,curmax);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long N,x,k;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            N=Long.parseLong(sarr[0]);
            x=Long.parseLong(sarr[1]);
            k=Long.parseLong(sarr[2]);
            boolean found=false;
            if(k%x==0){
                if(N+1<=k/x){
                    System.out.println("YES");
                    found=true;
                }
            }
            else if(!found){
                if(((N+1)-x)%k==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }

        }
    }
}