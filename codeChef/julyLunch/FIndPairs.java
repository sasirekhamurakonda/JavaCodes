package codeChef.julyLunch;

import java.util.*;
import java.lang.*;
import java.io.*;
class FIndPairs
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void findChess()throws java.lang.Exception{
        int n=Integer.parseInt(br.readLine());
        Map<Integer,Integer> hm=new LinkedHashMap<>();
        String[] sarr=br.readLine().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(sarr[i]);
            arr[i]=x;
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }
            else
                hm.put(x,1);
        }
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]!=arr[j])res+=2;
            }
        }
        System.out.println(res);

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            //findChess();
            //findArrayRotation();
            int[] arr={1,2,3};
            System.out.println(numberOfWeeks(arr));
        }
    }
        public static long numberOfWeeks(int[] milestones) {
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            long res=0;
            int n=milestones.length;
            for (int milestone : milestones) {
                pq.add(milestone);
            }
            while(!pq.isEmpty()){
                int x=pq.poll();
                if(pq.isEmpty()){
                    break;
                }
                int y=pq.poll();
                int diff=x-y;
                pq.add(diff);
                res=res+(2*y);
            }
            return res;
        }
    private static void findArrayRotation()throws java.lang.Exception {
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        LinkedList<Integer> b=new LinkedList<>();
        String[] sarr=br.readLine().split(" ");
        String[] sarr2=br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(sarr[i]);
            b.add(Integer.parseInt(sarr2[i]));
        }
        int[] min=new int[n];
        for(int i=0;i<n;i++){
            min[i]=(a[i]+b.get(i))%n;
        }
        int[] mini=new int[n];
        for(int i=0;i<n-1;i++){
            int temp=b.get(0);
            b.remove(0);
            b.add(temp);

            boolean found=false;
            for(int j=0;j<n;j++){
                int val=(b.get(j)+a[j])%n;
                if(val<min[j]){
                    min[j]=val;
                    found=true;
                }
                else if(val>min[j]){
                    if(!found)
                    break;
                    else{
                        min[j]=val;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(min[i]+" ");
        }
        System.out.println();
    }
}
/*
Sample Input 1
2
3
4 2 4
6
2 8 6 2 1 5
Sample Output 1
4
28

Sample Input 1
1
3
1 4 5
1 3 4
Sample Output 1
1 2 0
 */