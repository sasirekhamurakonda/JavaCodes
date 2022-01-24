package AnInternshipTest;

/*
import java.io.*;
import java.util.*;

class Solution {

    static int decodeVariations(String S) {

        return helper(S,0);

    }

    static int helper(String str,int i){

        if(i==str.length()) return 1;
        int d=str.charAt(i)-'0';
        int s=0;
        if(i+1<str.length()){
            s=str.charAt(i+1)-'0';
            s=s+d*10;
        }
        int ans=0;
        if(d>=1 && d<=9){
            ans=helper(str,i+1);
        }
        if(s>=10 && s<=26){
            ans=ans+helper(str,i+2);
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.out.println(decodeVariations(str));
    }
}

*/
/*
import java.io.*;
import java.util.*;

class Solution {

    static int decodeVariations(String S) {

        int[] memo=new int[S.length()];

        Arrays.fill(memo,-1);

        return helper(S,0,memo);

    }

    static int helper(String str,int i,int[] memo){

        if(i==str.length()) return 1;
        if(memo[i]!=-1) return memo[i];
        int d=str.charAt(i)-'0';
        int s=0;
        if(i+1<str.length()){
            s=str.charAt(i+1)-'0';
            s=s+d*10;
        }
        int ans=0;
        if(d>=1 && d<=9){
            ans=helper(str,i+1,memo);
        }
        if(s>=10 && s<=26){
            ans=ans+helper(str,i+2,memo);
        }
        memo[i]=ans;
        return ans;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.out.println(decodeVariations(str));
    }
}
*/
/*
import java.io.*;
import java.util.*;

class Solution {

    static double root(double x, int n) {
        if(x==0||x==1)
            return x;
        double c1=n-1;
        double c2=c1/n;
        double c3=x/n;
        double prev=0,curr=0;
        prev=2;
        curr=2;
        do{
            prev=curr;
            curr=c2*(prev)+(c3/(Math.pow(prev,c1)));
        }while((Math.abs(curr-prev))>=0.001);
        return curr;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=br.readLine().split(" ");
        double x=Double.parseDouble(sarr[0]);
        int n=Integer.parseInt(sarr[1]);
        double a = 123.13698;
        double roundOff = Math.round(a*100)/100;

        System.out.println(roundOff);
        System.out.println(Math.round(root(x,n)*1000.0)/1000.0);
    }

}


 */




/*
Rat in a maze problem
import java.io.*;
import java.util.*;
import java.lang.*;
class Solution {
    public static void findPathUtil(int[][] m,int n,int r,int c,String s,ArrayList<String> arrl){
        System.out.println(r+" "+c+" "+s);
        if(r<0||c<0||r>=n||c>=n){
            return;
        }

        if(r==n-1&&c==n-1){
            arrl.add(s);
            return;
        }
        if(r+1<n&&m[r+1][c]==1)
            findPathUtil(m,n,r+1,c,s+"D",arrl);
        if(c+1<n&&m[r][c+1]==1)
            findPathUtil(m,n,r,c+1,s+"R",arrl);
        if(r-1>=0&&m[r-1][c]==1)
            findPathUtil(m,n,r-1,c,s+"U",arrl);
        if(c-1>=0&&m[r][c-1]==1) {
            findPathUtil(m,n,r,c-1,s+"L",arrl);
        }

    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> arrl=new ArrayList<String>();
        if(m[n-1][n-1]==0)return arrl;
        findPathUtil(m,n,0,0,"",arrl);

        return arrl;
    }
    public static void main(String[] args)throws IOException{
        int n=2;
        int[][] m={{1,0},{0,1}};
        ArrayList<String> arrl=findPath(m,n);
        for(int i=0;i<arrl.size();i++){
            System.out.println(arrl.get(i));
        }
    }
}
*/
/*
import java.io.IOException;

class Solution
{
    public static int minStepsUtil(int row,int col,int TargetPos[], int n,boolean[][] visited){
        if(row<0||col<0||row>=n||col>=n||visited[row][col])return 10000;
        if(TargetPos[0]==row||TargetPos[1]==col)return 1;
        visited[row][col]=true;
        int min=10000;
        if(row+1<n&&col+2<n)min=Math.min(min,1+minStepsUtil(row+1,col+2,TargetPos,n,visited));
        if(row-1>=0&&col+2<n)min=Math.min(min,1+minStepsUtil(row-1,col+2,TargetPos,n,visited));
        if(row+1<n&&col-2>=0)min=Math.min(min,1+minStepsUtil(row+1,col-2,TargetPos,n,visited));
        if(row-1>=0&&col-2>=0)min=Math.min(min,1+minStepsUtil(row-1,col-2,TargetPos,n,visited));

        if(row+2<n&&col+1<n)min=Math.min(min,1+minStepsUtil(row+2,col+1,TargetPos,n,visited));
        if(row-2>=0&&col+1<n)min=Math.min(min,1+minStepsUtil(row-2,col+1,TargetPos,n,visited));
        if(row+2<n&&col-1>=0)min=Math.min(min,1+minStepsUtil(row+2,col-1,TargetPos,n,visited));
        if(row-2>=0&&col-1>=0)min=Math.min(min,1+minStepsUtil(row-2,col-1,TargetPos,n,visited));
        visited[row][col]=false;
        return min;

    }
    public static int minStepToReachTarget(int[] KnightPos, int[] TargetPos, int N)
    {
        boolean[][] visited=new boolean[N][N];
        int row=KnightPos[0];
        int col=KnightPos[1];
        return minStepsUtil(row,col,TargetPos,N,visited);
    }
    public static void main(String[] args)throws IOException{
        int[] x={4,5};
        int[] y={1,1};
        System.out.println(minStepToReachTarget(x,y,6));
    }
}
*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution {
    static String chars="abcdefghijklmnopqrstuvwxyz";
    static class TrieNode{
        TrieNode[] children=new TrieNode[chars.length()];
        boolean isEndOfWord=false;
    }
    public static void insert(TrieNode root,String word){
        TrieNode trieNode=root;
        for(int i=0;i<word.length();i++){
            int index=getIndex(word.charAt(i));
            if(trieNode.children[index]==null){
                trieNode.children[index]=new TrieNode();
            }
            trieNode=trieNode.children[index];
        }
        trieNode.isEndOfWord=true;
    }
    public static int getIndex(char c){
        return chars.indexOf(c);
    }
    public static boolean find(TrieNode root,String word,int i){
        TrieNode trieNode=root;
        System.out.println(i+" "+"main");
        if(i==word.length()) {
            System.out.println("I am here");

            return true;
        }
        while(i<word.length()){
            int index=getIndex(word.charAt(i));
            if(trieNode.children[index]==null){
                return false;
            }
            boolean found=false;
            while(i<word.length()){
                index=getIndex(word.charAt(i));
                System.out.println(index+" inside "+i+" ");
                if(trieNode.children[index]==null){
                    return false;
                }
                if(trieNode.children[index].isEndOfWord){
                    System.out.println(index+" insideend "+i);
                    if(find(root,word,i+1))
                        return true;
                    found=true;
                }
                i++;
                trieNode=trieNode.children[index];
            }
            if(!found)return false;
        }
        System.out.println("I am end");
        return false;
    }













    public boolean find(TrieNode root,String word){
        TrieNode trieNode=root;
        int i=0;
        while(i<word.length()){
            int index=getIndex(word.charAt(i));
            trieNode=root;
            if(trieNode.children[index]==null)
                return false;
            System.out.println("I am inside");
            boolean found=false;
            System.out.println("outside "+index+" "+i);
            while(i<word.length()){
                index=getIndex(word.charAt(i));
                System.out.println("inside "+index+" "+i);
                if(trieNode.children[index]==null)
                    return false;
                if(trieNode.children[index].isEndOfWord){
                    //trieNode=trieNode.children[index];
                    i++;
                    found=true;
                    break;
                }
                i++;
                trieNode=trieNode.children[index];
            }
            if(!found)return false;
            System.out.println("Ouside the innder"+" "+i);
        }
        return true;
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        TrieNode root=new TrieNode();
        for(String word:wordDict){
            insert(root,word);
        }
        return find(root,s,0);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String[] arr=br.readLine().split(" ");
        List<String> arrl = Arrays.asList( arr );
        System.out.println(wordBreak(s,arrl));
    }
}