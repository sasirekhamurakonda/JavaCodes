package Flipkart;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
import java.lang.*;
class Edge{
    int src;
    int dest;
    int wt;
    Edge(int src,int dest,int wt){
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }
}
class Banner {
    int start, end;
    Banner(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class EdgeListKruskal {
    public static int get(int[] parent,int a){
        return parent[a]==a?a:(get(parent,parent[a]));
    }
    public static void union(int[] parent,int[] rank,int a,int b){
        int parenta=get(parent,a);
        int parentb=get(parent,b);
        if(rank[a]==rank[b]) rank[a]++;

        if(rank[a]>rank[b]){
            parent[b]=a;
        }
        else
            parent[a]=b;
    }
    int getMinPins(Banner[] banners) {
        Arrays.sort(banners,new Comparator<Banner>(){
            @Override
            public int compare(Banner b1,Banner b2){
                if(b1.start<b2.start)
                    return -1;
                else if(b1.start>b2.start)
                    return 1;
                return 0;
            }
        });
        int res=0;
        int i=0;
        int len=banners.length;
        while(i<len){
            int j=i;
            int start=banners[i].start;
            int end=banners[i].end;
            j++;
            while(j<len&&banners[j].start<=end&&){
                start=Math.max(start,banners[j].start);
                end=Math.min(end,banners[j].end);
                j++;
            }
            j--;
            res=res+1;
            i=j;
            i++;
        }
        return res;
    }

    public static void kruskals(Edge[] edgelist,int vertices,int edges){
        Arrays.sort(edgelist, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                if(o1.wt>o2.wt)
                    return 1;
                else if(o2.wt>o1.wt)
                    return -1;
                return 0;
            }
        });
        Edge[] output=new Edge[vertices-1];
        int[] parent=new int[vertices+1];
        int[] rank=new int[vertices+1];
        for(int i=0;i<=vertices;i++){
            parent[i]=i;
            rank[i]=1;
        }
        int countOfEdge=0;
        int i=0;
        while(countOfEdge<vertices-1){
            Edge curr=edgelist[i];
            int srcParent=get(parent,curr.src);
            int destParent=get(parent,curr.dest);
            if(srcParent!=destParent){
                output[countOfEdge]=curr;
                union(parent,rank,srcParent,destParent);
                countOfEdge++;
            }
            i++;
        }
        int tw=0;
        for(i=0;i<vertices-1;i++)
            tw+=output[i].wt;
        System.out.println("Total Weight="+tw);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vertices = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());
        Edge[] edgelist=new Edge[edges];
        for (int i = 0; i < edges; i++) {
            String[] sarr = br.readLine().split(" ");
            int a = Integer.parseInt(sarr[0]);
            int b = Integer.parseInt(sarr[1]);
            int wt= Integer.parseInt(sarr[2]);
            Edge e=new Edge(a,b,wt);
            edgelist[i]=e;

        }
        kruskals(edgelist,vertices,edges);
    }
}

         Arrays.sort(books, new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.id.compareTo(o2.id);
        }
        7
8
0 1 1
0 5 1
5 6 2
1 6 3
1 2 1
2 3 8
3 4 1
2 4 2
    });
         */