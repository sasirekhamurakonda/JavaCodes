package codeChef;


import java.util.*;
        import java.lang.*;
        import java.io.*;
class ChefHeaven {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n;
        String s;
        for(int i=0;i<t;i++){
            n=Integer.parseInt(br.readLine());
            s=br.readLine();
            boolean found=false;
            int good=0,bad=0;
            for(int j=0;j<n;j++){
                if(s.charAt(j)=='0')
                    bad++;
                else
                    good++;
                if((j+1)%2==0){
                    if(good>=(j+1)/2){
                        System.out.println("YES");
                        found=true;
                        break;
                    }
                }
                else{
                    if(good>=n/2+1){
                        System.out.println("YES");
                        found=true;
                        break;
                    }
                }
            }
            if(!found)
                System.out.println("NO");
            /*if(n%2==0){
                if(good>=n/2){
                    System.out.println("YES");
                    continue;
                }
            }
            else if(good>=n/2+1){
                    System.out.println("YES");
                    continue;
            }
            good=0;
            bad=0;
            for(int j=0;j<n;j++){

            }*/


        }
    }
}