package Flipkart;

import java.util.*;
import java.lang.*;
import java.io.*;
public class MaxRepeatedChar {
    public static int subarraySum(int[] ar,int n){
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(ar[0],1);
        int prefixSum=ar[0];
        int count=0;
        for(int i=1;i<n;i++){
            prefixSum=prefixSum+ar[i];
            if(hs.containsKey(prefixSum)){
                hs.put(prefixSum,hs.get(prefixSum)+1);
                count++;
            }
            else
                hs.put(prefixSum,1);
        }
        return count;
    }
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static void invertedTree(Node t){
        if(t==null){
            return;
        }
        Node temp=t.left;
        t.left=t.right;
        t.left=temp;

    }
    public static void insert(Node root,int val){
        if(root==null){
            Node temp=new Node(val);
        }
        while(root!=null){
            if(root.data>val){
                if(root.left!=null)
                   root=root.left;
                else{
                    root.left=new Node(val);
                }
            }
            else{
                if(root.right!=null)
                    root=root.right;
                else{
                    root.right=new Node(val);
                }
            }
        }
    }
    public static int lca(int a,int b){
       /* int[] path_a=0;//inorder(a);
        int[] path_b=inorder(b);
        int i=0,j=0;
        while(i<path_a.length&&j<path_b.length){
            if(path_a[i]!=path_a[j]){
                return path_a[i-1];
            }
            i++;
            j++;
        }*/
        return 1;
    }
    public static void insert(int element,int[] arr,int n){
        arr[n]=element;
        int parent=n-1;
    }
    public static int numPairs(int[] arr,int n,int sum){
        HashMap<Integer,Integer> hs=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++)
            hs.put(arr[i],1);
        for(int i=0;i<n;i++){
            if(hs.containsKey(sum-arr[i])){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String s= br.readLine();
            HashMap<Character,Integer> hs=new HashMap<>();
            for(char c:s.toCharArray()){
                if(hs.containsKey(c)){
                    hs.put(c,hs.get(c)+1);
                }
                else
                    hs.put(c,1);
            }
            int max=0;
            char maxc=0;
            /*hs.forEach((k, v) ->{
                if(max>v){
                    max=v;
                }
            });*/
            for(char c:hs.keySet()){
                if(hs.get(c)>max){
                    max=hs.get(c);
                    maxc=c;
                }
            }
            System.out.println(maxc);
        }

    }
}