package codeChef.starters;


import java.util.*;
        import java.lang.*;
        import java.io.*;
public class TotalCorrectSolutions{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            TreeMap<String,Long> tm=new TreeMap<>();
            for(int j=0;j<3*n;j++){
                String[] sarr=br.readLine().split(" ");
                long k=Long.parseLong(sarr[1]);
                if(tm.containsKey(sarr[0])){
                    tm.put(sarr[0],tm.get(sarr[0])+k);
                }
                else
                    tm.put(sarr[0],k);
            }
            ArrayList<Long> arrl=new ArrayList<>();
            for(String key:tm.keySet())
                arrl.add(tm.get(key));
            Collections.sort(arrl);
            for(Long l:arrl)
                System.out.print(l+" ");
            System.out.println();
        }
    }
}
/*
3
1
A 1
B 2
C 3
2
AA 1
AB 1
AB 1
AC 1
AC 1
AD 1
1
Z 100
Z 100
Z 100
 */