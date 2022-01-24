package Flipkart;

import java.io.IOException;
import java.io.*;
import java.util.*;
import java.lang.*;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class BurningTree {
    public static int findFarthestDistance(List<Integer>[] adjl,int source,int curr,boolean[] visited){
        if(adjl[curr].size()==0)return 0;
        int max=0;
        visited[curr]=true;
        for(Integer i:adjl[curr]){
            if(!visited[i])
            max=Math.max(max,1+findFarthestDistance(adjl,source,i,visited));
        }
        return max;
    }
    public static void makeGraph(Node root,List<Integer>[] adjl){
        for(int i=0;i<=10;i++){
            adjl[i]=new LinkedList<>();
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node x=queue.poll();
            if(x.left!=null){
                int left=x.left.data;
                adjl[x.data].add(left);
                adjl[left].add(x.data);
                queue.add(x.left);
            }
            if(x.right!=null) {
                int right = x.right.data;
                int data = x.data;
                adjl[data].add(right);
                adjl[right].add(data);
                queue.add(x.right);
            }
        }

    }
    public static void main(String[] args)throws IOException{
        Node one=new Node(1);
        one.left=new Node(2);
        one.right=new Node(3);
        one.left.left=new Node(4);
        one.left.right=new Node(5);
        one.left.left.left=new Node(8);
        one.left.right.left=new Node(10);
        one.right.right=new Node(7);
        List<Integer>[] adjl=new LinkedList[11];
        makeGraph(one,adjl);
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
            for(Integer ele:adjl[i])
                System.out.print(ele+" ");
            System.out.println();
        }
        boolean[] visited=new boolean[11];
        System.out.println(findFarthestDistance(adjl,8,8,visited));
    }
}
