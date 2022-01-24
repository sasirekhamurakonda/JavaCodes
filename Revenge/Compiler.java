package Revenge;


import java.util.*;
import java.lang.*;
import java.io.*;
public class Compiler{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String s=br.readLine();
            Stack<String> s1=new Stack<>();
            Stack<Integer> s2=new Stack<>();
            int j=0;
            for(j=0;j<s.length();j++){
                if(s.charAt(j)=='<'){
                    s1.push("<");
                    s2.push(j);
                }
                else{
                    if(!s1.empty()){
                        if(s1.peek().compareTo("<")==0)
                        {
                            s1.pop();
                            s2.pop();
                        }
                        else{
                            //System.out.println("OMG i am in break");
                            break;
                        }
                    }
                    else{
                        //System.out.println("OMG i am in correct break");
                        break;
                    }
                }
            }
            if(!s1.empty()){
                //System.out.println(s1.peek()+" "+s2.peek()+" "+j);
                int min=0;
                while(!s1.empty()){
                    min=s2.pop();
                    s1.pop();
                }
                //System.out.println("inside the if stmt "+min);

                System.out.println(min);
            }
            else {
                //System.out.println("I dont know");
                System.out.println(j);
            }
        }
    }
}