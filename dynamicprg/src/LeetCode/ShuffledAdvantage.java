package LeetCode;

import java.util.*;
import java.lang.*;
import java.io.*;
public class ShuffledAdvantage {
    public static int[] advantageCount(int[] A, int[] B) {
        int n=A.length;
        ArrayList<Integer> c=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            c.add(A[i]);
        }
        Collections.sort(c);
        for(int i=0;i<n;i++){
            int x=B[i];
            System.out.println(x);
            int index=Collections.binarySearch(c,x);
            System.out.println("index="+index);
            if(index>=0){
                if(c.size()-1>=index+1){
                    A[i]=c.get(index+1);

                    c.remove(index+1);
                }
                else{
                    A[i]=c.get(0);
                    c.remove(0);
                }
            }
            else if(index<0){
                index=-index;
                index=index-1;
                System.out.println("Changed index value is "+index+"size is "+c.size());
                if(index>=0&&index<c.size()){
                    A[i]=c.get(index);
                    c.remove(index);
                }
                else{
                    if(c.size()==1){
                        A[i]=c.get(0);
                        c.remove(0);
                    }
                    if(c.size()==index){
                        A[i]=c.get(index-1);
                        c.remove(index-1);
                    }
                }
            }

        }
        return A;
    }
    public static void main(String[] args) throws IOException{
        int[] A={15448,14234,13574,19893,6475};
        int[] B={14234,6475,19893,15448,13574};
        int[] C=advantageCount(A,B);
        for(int i=0;i<5;i++)
            System.out.println(C[i]+" ");

    }
}
/*
import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class ShuffledAdvantage {
    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(2);
        al.add(4);

        // 10 is present at index 3.
        int index = Collections.binarySearch(al, 3);
        System.out.println(index);

        // 13 is not present. 13 would have been inserted
        // at position 4. So the function returns (-4-1)
        // which is -5.
        index = Collections.binarySearch(al, 13);
        System.out.println(index);
    }

    1
index=1
3
index=-4
0
index=0
0
index=0
2
index=-2
}*/