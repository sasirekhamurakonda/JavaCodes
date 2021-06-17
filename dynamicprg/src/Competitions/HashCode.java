package Competitions;

import java.io.*;
import java.util.*;
import java.lang.*;
class Pizza{
    LinkedHashMap<ArrayList<String>,Integer> lhs=new LinkedHashMap<>();
    public void makePizza(String s){
        ArrayList<String> arl=new ArrayList<>();
        String[] sarr=s.split(" ");
        Arrays.sort(sarr);
        arl.addAll(Arrays.asList(sarr));
        if(lhs.containsKey(arl)){
            lhs.put(arl,lhs.get(arl)+1);
        }
        else
            lhs.put(arl,1);
    }
    public void showPizzasAndFreq(){
        //for(LinkedHashMap<ArrayList<String>,Integer> ele:lhs.entrySet()){

        //}
    }
}
public class HashCode {
    public static int n;
    public static int t2;
    public static int t3;
    public static int t4;
    public static Pizza pizza;
    public static void allocateGroups(int n){

    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=br.readLine().split(" ");
        int n=Integer.parseInt(sarr[0]);
        int t2=Integer.parseInt(sarr[1]);
        int t3=Integer.parseInt(sarr[2]);
        int t4=Integer.parseInt(sarr[3]);
        pizza=new Pizza();
        for(int i=0;i<n;i++){
            pizza.makePizza(br.readLine());
        }
    }
}
