package Flipkart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class CombinationSumGeeks {
 /*   static ArrayList<ArrayList<Integer> >
    combinationSum(ArrayList<Integer> arr, int sum)
    {
        ArrayList<ArrayList<Integer> > ans
                = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        // first do hashing since hashset does not always
        // sort
        //  removing the duplicates using HashSet and
        // Sorting the arrayList

        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);

        findNumbers(ans, arr, sum, 0, temp);
        return ans;
    }

    static void
    findNumbers(ArrayList<ArrayList<Integer> > ans,
                ArrayList<Integer> arr, int sum, int index,
                ArrayList<Integer> temp)
    {
        System.out.println(sum+" "+index);
        if (sum == 0) {

            // Adding deep copy of list to ans

            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < arr.size(); i++) {

            // checking that sum does not become negative

            if ((sum - arr.get(i)) >= 0) {

                // adding element which can contribute to
                // sum

                temp.add(arr.get(i));

                findNumbers(ans, arr, sum - arr.get(i), i,
                        temp);

                // removing element from list (backtracking)
                temp.remove(arr.get(i));
            }
        }
    }*/

    // Driver Code
    static List<List<Integer>> combinationSum(int[] A, int val) {
        // add your logic here
        List<Integer> arrl=new ArrayList<Integer>();
        for(int a:A){
            arrl.add(a);
        }
        //Set<Integer> hs=new HashSet<>(arrl);
        //arrl.clear();
        //arrl.addAll(hs);
        Collections.sort(arrl);
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<>();
        findNumbers(res,arrl,val,0,temp);
        return res;
    }
    static void findNumbers(List<List<Integer>> res,List<Integer> arrl,int sum,int index,List<Integer> temp){
        if(sum==0){
            for(int i=0;i<temp.size();i++)
                System.out.print(temp.get(i)+" ");
            System.out.println();
            if(!res.contains(temp))
                res.add(new ArrayList<>(temp));

            return;
        }
        for(int i=index;i<arrl.size();i++){
            if(sum-arrl.get(i)>=0){
                temp.add(arrl.get(i));
                findNumbers(res,arrl,sum-arrl.get(i),i+1,temp);
                temp.remove(arrl.get(i));
            }
        }
    }
    public static void main(String[] args)
    {
        /*ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(5);
        arr.add(3);*/
        int[] arr={10, 1, 2, 7, 6, 1, 5};
        String[] w={"a","b","c"};
        List<String> ll=Arrays.asList(w);
        int sum = 8;
        int z=1234;
        String zs=String.valueOf(z);
        System.out.println(zs);

        List<List<Integer> > ans
                = combinationSum(arr, sum);

        // If result is empty, then
        if (ans.size() == 0) {
            System.out.println("Empty");
            return;
        }

        // print all combinations stored in ans

        for (int i = 0; i < ans.size(); i++) {

            System.out.print("(");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print(") ");
        }
    }
   /* public static List<List<Integer>> findCombinations(int[] arr,int target){
        List<List<Integer>> ls=new ArrayList<List<Integer>>();
        int targetReached=0;
        //List<Integer> l=new ArrayList<Integer>();
        Integer[] a=new Integer[];
        List<Integer> l=Arrays.asList(a);
        //findCombinations(arr.length,arr,0,target,targetReached,ls,l);
        return ls;
    }
    public static void main(String[] args) throws IOException {
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
    }*/
}
