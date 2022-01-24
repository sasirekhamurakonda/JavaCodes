package Edyst;

import java.lang.*;
import java.io.*;
import java.util.*;
class Fixes{
    String infix;
    String postfix;
    public Fixes(String infix){
        this.infix=infix;
    }
    public static int priority(char a){
        if(a=='^')
            return 3;
        else if(a=='/'||a=='*')
            return 2;
        else if(a=='+'||a=='-')
            return 1;
        return 0;
    }
    public void convert(){
        Stack<Character> s=new Stack<Character>();
        postfix="";
        //System.out.println("check"+infix);
        for(int i=0;i<infix.length();i++){
            if(Character.isDigit(infix.charAt(i))){
                //System.out.println(i);
                //System.out.println(infix.substring(i,i+1));
                postfix+=(infix.substring(i,i+1));
            }
            else if(infix.charAt(i)=='(') {
                //System.out.println(i);
                s.push('(');
            }
            else if(infix.charAt(i)==')'){
                while(!s.empty()&&s.peek()!='('){
                    postfix+=(Character.toString(s.pop()));
                }
                if(!s.empty()&&s.peek()=='(')
                    s.pop();
                //System.out.println(i);
            }
            else{
                if(!s.empty()){
                    if(!s.empty()&&priority(infix.charAt(i))>priority(s.peek()))
                        s.push(infix.charAt(i));
                    else{
                        while(!s.empty()&&priority(infix.charAt(i))<=priority(s.peek())){
                            postfix+=(Character.toString(s.pop()));
                        }
                        s.push(infix.charAt(i));
                    }
                }
                else{
                    s.push(infix.charAt(i));
                }
               // System.out.println(i);
            }
        }
        while(!s.empty()) {
            postfix += (Character.toString(s.pop()));
        }
    }
}








public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String equation = br.readLine();
            Fixes fix= new Fixes(equation);
            System.out.println("Infix: " + equation);
            fix.convert();
            System.out.println("Postfix: " + fix.postfix);
            System.out.println("---");

    }
}