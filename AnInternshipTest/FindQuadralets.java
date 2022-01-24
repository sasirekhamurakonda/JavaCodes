package AnInternshipTest;


import java.io.*;
import java.util.*;

class FindQuadralets {
    // [0,1,2,3,4,5,7,9]
    static boolean findArrayQuadrupletUtil(int[] arr,int s,int index,ArrayList<Integer> arrl){
        System.out.println("Inside the function  sum is="+s+" index is"+index);
        for(int i=0;i<arrl.size();i++){
            System.out.print(arrl.get(i)+" ");
        }
        System.out.println();
        if(s==0){
            return true;
        }
        if(index>=arr.length||s<0||arrl.size()==4)return false;

        for(int i=index;i<arr.length;i++){
            System.out.println("inside the for loop index="+i+" value of s="+s);
            arrl.add(arr[i]); //0 1 2 6
            if(findArrayQuadrupletUtil(arr,s-arr[i],i+1,arrl)){
                return true;
            }
            int end=arrl.size()-1;

            arrl.remove(end);

        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,7,9};
        int s=20;
        ArrayList<Integer> arrl=new ArrayList<Integer>();
        Map<Integer,Boolean> hm=new HashMap<>();
        boolean retu=findArrayQuadrupletUtil(arr,s,0,arrl);
        System.out.println(retu);
        for(int i=0;i<arrl.size();i++){
            System.out.print(arrl.get(i)+" ");
        }
        System.out.println();
    }

}
