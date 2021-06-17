package Revenge;


import java.util.*;
import java.lang.*;
import java.io.*;
public class FinalScore {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        HashMap<String,Integer> hm=new HashMap<>();
        HashMap<String,List<Integer>> hlist=new HashMap<>();
        String[][] str=new String[n][2];
        for(int i=0;i<n;i++){
            String[] temp=br.readLine().split(" ");
            int score=Integer.parseInt(temp[1]);
            if(hm.containsKey(temp[0])){
                hm.put(temp[0],hm.get(temp[0])+score);
                hlist.get(temp[0]).add(score);
            }
            else{
                hm.put(temp[0],score);
                hlist.put(temp[0],new LinkedList<>());
                hlist.get(temp[0]).add(score);
            }
            str[i]=temp;
        }
        int max=-1;
        String maxs="";
        for(String s:hm.keySet()){
            System.out.println("final scores "+s+" "+hm.get(s));
            System.out.println("final scores "+s+" "+hlist.get(s));
            if(max<hm.get(s)){
                max=hm.get(s);
                maxs=s;
            }
            else if(max==hm.get(s)){
                /*LinkedList<Integer> prev=new LinkedList<>(hlist.get(maxs));
                LinkedList<Integer> news=new LinkedList<>(hlist.get(s));
                int i=0,j=0;
                int maxa=0,maxb=0;
                while(i<prev.size()&&j<news.size()){
                    maxa=maxa+prev.get(i);
                    maxb=maxb+news.get(j);
                    if(maxa==max){
                        break;
                    }
                    else if(maxb==max){
                        maxs=s;
                        max=maxb;
                    }
                    i++;
                    j++;
                }*/
                int maxa=0,maxb=0;
                for(int i=0;i<n;i++){
                    if(str[i][0].equals(s)){
                        maxa=maxa+(Integer.parseInt(str[i][1]));
                    }
                    else if(str[i][0].equals(maxs)){
                        maxb=maxb+(Integer.parseInt(str[i][1]));
                    }
                    if(maxa>=max){
                        maxs=s;
                        break;
                    }
                    else if(maxb>=max){
                        break;
                    }
                }
            }
        }
        System.out.println(maxs);
    }
}