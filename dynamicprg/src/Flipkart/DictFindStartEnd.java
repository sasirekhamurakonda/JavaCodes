package Flipkart;
import java.util.*;
import java.lang.*;
import java.io.*;
public class DictFindStartEnd {
    public static int findlength(String[] arr,String start,String end){
        Queue<String> qu=new LinkedList<>();
        int n=start.length();
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i].charAt(j)!=start.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                qu.add(arr[i]);
            }
        }

        return 0;
    }
}
