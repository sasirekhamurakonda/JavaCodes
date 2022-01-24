package codeChef.starters12102021;


import java.util.*;
        import java.lang.*;
        import java.io.*;


class NicePairs
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n;
        for(int i=0;i<t;i++){
            n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            int count=0;
            char[] digits=s.toCharArray();
            Map<Integer,List<Integer>> hm=new HashMap<>();

            for(int j=n-1;j>=0;j--){
                int ele= digits[j]-'0';
                if(j<n-1) {
                    for (int k = 1; k <= 9; k++) {
                        if (hm.containsKey(ele - k)) {
                            if (hm.get(ele - k).contains(k+j)) {
                                //System.out.println(ele+" "+j);
                                count++;
                            }
                        }
                        if (hm.containsKey(ele + k)) {
                            //System.out.println(ele+" "+j+" "+"I am herer");
                            if (hm.get(ele + k).contains(j + k)) {
                                //System.out.println(ele+" "+j);
                                count++;
                            }
                        }
                    }
                }
                List<Integer> temp=hm.get(ele);
                if(temp==null){
                    List<Integer> temps=new ArrayList<>();
                    hm.put(ele,temps);
                }
                hm.get(ele).add(j);

            }
            System.out.println(count);

        }

    }
}
/*
1≤T≤1000
2≤N≤105
String S contains only numeric characters
The sum of N over all test cases does not exceed 2⋅105
Sample Input 1
3
3
123
5
13492
8
94241234
Sample Output 1
3
2
9

                List<Integer> temp=hm.get(ele);
                if(temp==null){
                    List<Integer> temps=new ArrayList<>();
                    hm.put(ele,temps);
                }
                hm.get(ele).add(j);

for(Integer element:hm.keySet()){
                    List<Integer> arl=hm.get(element);
                    System.out.println("i am "+element);
                    for(Integer x:arl){
                        System.out.print(x+" ");
                    }
                    System.out.println();
                }
 */