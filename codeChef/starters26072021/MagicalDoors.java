package codeChef.starters26072021;


import java.util.*;
        import java.lang.*;
        import java.io.*;
class MagicalDoors {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String doors=br.readLine();
            int curr=-1;
            int count=0;
            if (doors.charAt(0)=='0') {
                curr=0;
                count++;
            }
            else{
                curr=1;
            }
            int n=doors.length();
            for(int j=1;j<n;j++){
                if(doors.charAt(j)=='0'){
                    if(curr==1){
                        curr=0;
                        count++;
                    }
                }
                else{
                    if(curr==0){
                        curr=1;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
/*
3
111
010
10011
 */