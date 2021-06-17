package codeChef;

import java.util.LinkedList;
import java.util.*;
public class flipkartSubArraySum {
    public static void subArraySum(int[] arr,int n,int givenSum){
        int sum=0;
        boolean found=false;
        for(int i=0;i<n-1;i++){
            sum=arr[i];
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                if(sum==givenSum){
                    found=true;
                    System.out.println("sum is found at: "+i+" to "+j);
                }
                else if(sum>givenSum){
                    break;
                }
            }
            if(found==true)
                break;
        }
        if(found==false)
            System.out.println("Sum not found.");
    }
    public static boolean checkStringRotation(String a,String b){
        boolean flag=false;
        int na=a.length();
        int nb=b.length();
        if(a.length()!=b.length())
            return flag;
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(b.charAt(i)==b.charAt(j)){
                    int k=i+1,l=j+1;
                    while(k%na!=i&&l%nb!=j){
                        if(a.charAt(k)!=b.charAt(l))
                            break;
                        k=(k+1)%na;
                        l=(l+1)%nb;
                    }
                    if(k==i&&l==j)
                        flag=true;
                }
            }
        }
        return flag;
    }
    /*public static LinkedList reverseLinkedList(LinkedList head){
        Node temp=head.next;
        head.next=null;

        while(temp.next!=null){
            Node temp2=new Node(temp.data);
            temp2.next=head;
            head=temp2;
            temp=temp.next;
        }
        temp.next=head;
        return temp;
    }*/
    public static boolean balancedParanthesis(String s){
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        boolean flag=false;
        int i=0;
        while(i<n){
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
                stack.push(s.charAt(i));
            else{
                if(s.charAt(i)==stack.peek()){
                    stack.pop();
                }
                else
                    return false;
            }
        }
        return true;
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> queue){
        Stack<Integer> s=new Stack<Integer>();
        while(!queue.isEmpty()){
            s.push(queue.remove());
        }
        while(!s.empty()){
            queue.add(s.pop());
        }
        return queue;
    }
    public static int[] merge(int[] a,int[] b){
        int lena=a.length;
        int lenb=b.length;
        int[] x=new int[lena+lenb];
        int i=0,j=0,k=0;
        while(i<lena&&j<lenb){
            if(a[i]<b[j]){
                x[k]=a[i];
                k++;
                i++;
            }
            else{
                x[k]=b[j];
                k++;
                j++;
            }
        }
        if(i==lena){
            while(j<lenb){
                x[k]=b[j];
                k++;
                j++;
            }
        }
        else{
            while(i<lena){
                x[k]=a[i];
                k++;
                i++;
            }
        }
        return x;
    }
}
