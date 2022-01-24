package Edyst;
import java.util.*;
import java.lang.*;
import java.io.*;

public class StackBracketEvalution {
    public static int isBalanced(String s) {
        /* write your solution here */
        Stack<Character> st=new Stack<Character>();
        if(s.equals(""))
            return 1;
        st.push(s.charAt(0));
        int i=1;
        while(i<s.length()&&!st.empty()){
            if(s.charAt(i)=='['||s.charAt(i)=='('||s.charAt(i)=='{')
                st.push(s.charAt(i));
            else if(s.charAt(i)=='}'||s.charAt(i)==')'||s.charAt(i)==']'){
                if(st.empty() ||(st.peek()=='['&&s.charAt(i)==']')||(st.peek()=='('&&s.charAt(i)==')')||(st.peek()=='{'&&s.charAt(i)=='}'))
                    st.pop();
                else
                    return 0;
            }
            i++;
        }
        return st.empty()==true?1:0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.println(isBalanced(s));

    }
}