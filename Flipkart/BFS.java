package Flipkart;

import java.util.*;
import java.lang.*;
import java.io.*;
public class BFS{
    public static void dfs(List<Integer>[] graph,int startindex){
        int numOfVertices=graph.length;
        boolean[] visited=new boolean[numOfVertices];
        dfsUtil(graph,startindex,visited);
    }

    private static void dfsUtil(List<Integer>[] graph, int index, boolean[] visited) {
        visited[index]=true;
        System.out.println(index);
        int edgeCount=graph[index].size();
        for(int i=0;i<edgeCount;i++){
            int node=graph[index].get(i);
            if(!visited[node]){
                dfsUtil(graph,node,visited);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int vertices=Integer.parseInt(br.readLine());
        int edges=Integer.parseInt(br.readLine());
        List<Integer>[] graph=new LinkedList[vertices];
        for(int i=0;i<vertices;i++){
            graph[i]=new LinkedList<>();
        }
        for(int i=0;i<edges;i++){
            String[] sarr=br.readLine().split(" ");
            int a=Integer.parseInt(sarr[0]);
            int b=Integer.parseInt(sarr[1]);
            graph[a].add(b);
            graph[b].add(a);
        }
        System.out.println("The DFS traversal of the graph is:");
        dfs(graph,0);
        System.out.println("The BFS traversal of the graph is:");
        bfs(graph,0);
    }

    private static void bfs(List<Integer>[] graph, int startIndex) {
        boolean[] visited=new boolean[graph.length];
        visited[startIndex]=true;
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(startIndex);
        while(!queue.isEmpty()){
            int index=queue.poll();
            System.out.println(index);
            int edgeLength=graph[index].size();
            for(int i=0;i<edgeLength;i++){
                int node=graph[index].get(i);
                if(!visited[node]){
                    visited[node]=true;
                    queue.add(node);
                }
            }
        }
    }
}