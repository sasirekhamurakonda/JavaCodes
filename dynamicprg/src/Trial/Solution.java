package Trial;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution {
    public static boolean isBalancedParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        boolean flag=false;
        int i=0;
        while(i<n){
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
                stack.push(s.charAt(i));
            else{
                if(!stack.empty()&&((s.charAt(i)==']'&&stack.peek()=='[')||(s.charAt(i)=='}'&&stack.peek()=='{')||(s.charAt(i)==')'&&stack.peek()=='('))){
                    stack.pop();
                }
                else
                    return false;
            }
            i++;
        }
        if(stack.empty())
            return true;
        return false;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.println(isBalancedParentheses(s));
    }
}
