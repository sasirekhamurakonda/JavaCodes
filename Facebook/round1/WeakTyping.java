package Facebook.round1;


import java.util.*;
import java.lang.*;
import java.io.*;
public class WeakTyping {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("src\\Facebook\\round1\\input"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\Facebook\\round1\\output"));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n=Integer.parseInt(br.readLine());
            int curr=0;
            int count=0;
            String s=br.readLine();
            for(char ch:s.toCharArray()){
                if(ch=='O'){
                    if(curr==0){
                        curr=1;
                    }
                    else if(curr!=1){
                        curr=1;
                        count++;
                    }
                }
                else if(ch=='X'){
                    if(curr==0)curr=-1;
                    else if(curr!=-1){
                        curr=-1;
                        count++;
                    }
                }
            }

            bw.write("Case #"+(i+1)+": "+count+"\n");

        }
        bw.close();
        br.close();
    }
}