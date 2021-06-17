package Edyst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class EvaluatePstFix {
    public static int evaluateRPN(ArrayList<String> A) {
        /* write your solution here */
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<A.size();i++){
            if(Character.isDigit(A.get(i).charAt(0))){
                s.push(Integer.parseInt(A.get(i)));
            }
            else{
                int a=s.pop();
                int b=s.pop();
                if(A.get(i).charAt(0)=='+')
                    s.push(b+a);
                else if(A.get(i).charAt(0)=='-')
                    s.push(b-a);
                else if(A.get(i).charAt(0)=='*')
                    s.push(b*a);
                else if(A.get(i).charAt(0)=='/')
                    s.push(b/a);
            }
        }
        return s.pop();
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arl=new ArrayList<>();
        arl.add("4");
        arl.add("13");
        arl.add("5");
        arl.add("/");
        arl.add("+");
        System.out.println(evaluateRPN(arl));
    }
}