package Flipkart;

import java.util.*;
import java.lang.*;
import java.io.*;
public class CombinationSum1 {
    public static List<List<Integer>> findCombinations(int[] arr,int target){
        List<List<Integer>> ls=new ArrayList<List<Integer>>();
        int targetReached=0;
        List<Integer> l=new ArrayList<>();
        findCombinations(arr.length,arr,0,target,targetReached,ls,l);
        return ls;
    }

    private static void findCombinations(int length, int[] arr,int index, int target, int targetReached, List<List<Integer>> ls,List<Integer> l) {
        if(index<length) {
            for (int i = 0; i < length; i++) {
                l.add(arr[i]);
                if (targetReached + arr[i] == target) {
                    ls.add(l);
                } else if (targetReached + arr[i] < target) {
                    findCombinations(length, arr, index + 1, target, targetReached - arr[i], ls, l);
                } else {
                    l.remove(l.size() - 1);
                }
            }
            index++;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] sarr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sarr[i]);
            }

            int target = Integer.parseInt(br.readLine());
            List<List<Integer>> lists=findCombinations(arr,target);
            for(List<Integer> list:lists){
                for(int x:list){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        }
    }
}
