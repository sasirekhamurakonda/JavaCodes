package BasicsOfJava;

import java.util.*;
import java.io.*;
class Solution
{
    static class Pair{
        int vertex;
        int left;
        public Pair(int vertex,int left){
            this.vertex=vertex;
            this.left=left;
        }
        @Override
        public boolean equals(Object obj) {
            if(this==obj)return true;
            if(obj==null||obj.getClass()!=this.getClass())return false;
            Pair p=(Pair)obj;

            return p.vertex==vertex&&p.left==left;
        }
        public int hashCode(){
            int hash=7;
            hash=31*hash+vertex;
            hash=31*hash+left;
            return hash;
        }
    }
    public static long findForgiven(int index,ArrayList<Integer>[] numpad,int N,int curr,Map<Pair,Long> memo){
        if(N==curr)return 1;
        if(memo.containsKey(new Pair(index,N-curr))){
            Long x=memo.get(new Pair(index,N-curr));
            if(x==null){
                System.out.println("I am here"+N+" "+curr+" "+index);
                return 0;
            }
            else
                return x;
        }
        long res=0;
        for(int i=0;i<numpad[index].size();i++){
            res+=findForgiven(numpad[index].get(i),numpad,N,curr+1,memo);

        }
        memo.put(new Pair(index,N-curr),res);
        return res;
    }
    public static long getCount(int N)
    {
        ArrayList<Integer>[] numpad=(ArrayList<Integer>[])new ArrayList[10];
        for(int i=0;i<10;i++){
            numpad[i]=new ArrayList<Integer>();
        }
        //for 0
        numpad[0].add(0);
        numpad[0].add(8);
        //for 1
        numpad[1].add(1);
        numpad[1].add(2);
        numpad[1].add(4);
        //for 2
        numpad[2].add(2);
        numpad[2].add(1);
        numpad[2].add(3);
        numpad[2].add(5);
        //for 3
        numpad[3].add(3);
        numpad[3].add(2);
        numpad[3].add(6);
        //for 4
        numpad[4].add(4);
        numpad[4].add(1);
        numpad[4].add(5);
        numpad[4].add(7);
        //for 5
        numpad[5].add(5);
        numpad[5].add(2);
        numpad[5].add(4);
        numpad[5].add(6);
        numpad[5].add(8);
        //for 6
        numpad[6].add(6);
        numpad[6].add(3);
        numpad[6].add(5);
        numpad[6].add(9);
        //for 7
        numpad[7].add(7);
        numpad[7].add(4);
        numpad[7].add(8);
        //for 8
        numpad[8].add(8);
        numpad[8].add(0);
        numpad[8].add(5);
        numpad[8].add(7);
        numpad[8].add(9);
        //for 9
        numpad[9].add(9);
        numpad[9].add(8);
        numpad[9].add(6);
        long res=0;
        Map<Pair,Long> memo=new HashMap<>();

        for(int i=0;i<10;i++){
            res+=findForgiven(i,numpad,N,1,memo);
        }
        for(Pair p:memo.keySet()){
                System.out.println(p.vertex+" "+p.left+" "+memo.get(p));
        }
        return res;

    }
    public static void main(String[] args)throws Exception{
        System.out.println(getCount(5));
    }
}
