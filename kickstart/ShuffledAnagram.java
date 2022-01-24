package kickstart;


import java.util.*;
        import java.lang.*;
        import java.io.*;


class ShuffledAnagram
{
    public static boolean isPossible(int[] visited,int index,int p){
        for(int i=0;i<index;i++){
            if(visited[i]==p){
                return false;
            }
        }
        return true;
    }
    public static boolean findIfPossible(String s,char[] charr,int[] visited,int n,int index){
        if(index==n){
            for(int i=0;i<n;i++){
                if(visited[i]==-1)
                    return false;
            }
            return true;
        }
        for(int i=0;i<n;i++){
            if(isPossible(visited,index,i)&&charr[i]!=charr[index]){
                visited[index]=i;
                if(findIfPossible(s,charr,visited,n,index+1)){
                    return true;
                }
                visited[index]=-1;
            }
        }
        return false;
    }
//    public static String getShuffledAnagramUtil(String s,char[] charr,int index,String making,int n){
//        System.out.println(s+" "+index+" "+making);
//        if(making.length()==n)return making;
//        if(s.charAt(index)!=charr[index]){
//            if(getShuffledAnagramUtil(s,charr,(index+1)%n,making+String.valueOf(charr[index]),n)!=null)
//                return making;
//        }
//        return getShuffledAnagramUtil(s,charr,(index+1)%n,making,n);
//    }
    public static String getShuffledAnagram(String s){
        //StringBuilder sb=new StringBuilder(s);
       // sb.reverse();
       // s=sb.toString();
        char[] charr=s.toCharArray();
        int n=s.length();
        String making="";
        int[] visited=new int[n];
        for(int i=0;i<n;i++){
            visited[i]=-1;
        }
        if(findIfPossible(s,charr,visited,n,0)){
            char[] res=new char[n];
            for(int i=0;i<n;i++){
                //System.out.println(visited[i]);
                res[visited[i]]=charr[i];
            }
            return String.valueOf(res);
        }
        return "IMPOSSIBLE";
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String s=br.readLine();
            int n=s.length();
            System.out.println("Case #"+(i+1)+": "+getShuffledAnagram(s));
//            if(s.length()==1){
//                System.out.println("Case #"+(i+1)+": "+"IMPOSSIBLE");
//            }
//            else{
//                System.out.println(getShuffledAnagram(s));
//            }
//            else if(s.length()==2){
//                if(s.charAt(0)==s.charAt(1)){
//                    System.out.println("Case #"+(i+1)+": "+"IMPOSSIBLE");
//                }
//                else {
//                    System.out.println("Case #" + (i+1) + ": " +s.charAt(1)+""+s.charAt(0));
//                }
//            }
//            else{
//                HashSet<Character> hs=new HashSet<>();
//                for(char ch:s.toCharArray()){
//                    hs.add(ch);
//                }
//                if(n%2==0){
//                    if(hs.size()<n/2){
//                        System.out.println("Case #"+(i+1)+": "+"IMPOSSIBLE");
//                    }
//                    else{
//                        String res=getShuffledAnagram(s);
//                        System.out.println("Case #"+(i+1)+": "+res);
//                    }
//                }
//                else{
//                    if(hs.size()<(n+1)/2){
//                        System.out.println("Case #"+(i+1)+": "+"IMPOSSIBLE");
//                    }
//                    else{
//                        String res=getShuffledAnagram(s);
//                        System.out.println("Case #"+(i+1)+": "+res);
//                    }
//                }
//            }


        }

    }
}
/*
2
start
jjj
 */