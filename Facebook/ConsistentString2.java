package Facebook;


import java.util.*;
import java.lang.*;
import java.io.*;
public class ConsistentString2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("src\\Facebook\\input.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\Facebook\\output.txt"));
        int t=Integer.parseInt(br.readLine());
        System.out.println(t);
        for(int i=0;i<t;i++) {
            String s=br.readLine();
            int n=s.length();
            Set<Character> hs=new HashSet<>();
            for(char c:s.toCharArray()){
                hs.add(c);
            }
            int k=Integer.parseInt(br.readLine());
            Map<Character,List<Character>> hm=new HashMap<>();
            for(int j=0;j<k;j++){
                String temp=br.readLine();
                char A=temp.charAt(0);
                char B=temp.charAt(1);
                hs.add(B);
                List<Character> l;
                if(hm.containsKey(A)){
                    l = hm.get(A);
                }
                else{
                    l = new ArrayList<>();
                }
                l.add(B);
                hm.put(A,l);

            }
            System.out.println(s);
            for(char c:hm.keySet()){
                System.out.println(c+" "+hm.get(c));
            }
            for(char c:hs){
                System.out.print(c+" ");
            }
            System.out.println();
            int count=Integer.MAX_VALUE;
            if(n==1){
                count=0;
            }
            else{
                count=timeToBeConsistent(hs,hm,s,n);
            }
            System.out.println("I am here");

            bw.write("Case #"+(i+1)+": "+count+"\n");

        }
        bw.close();
        br.close();
    }

    private static int timeToBeConsistent(Set<Character> hs, Map<Character, List<Character>> hm, String s, int n) {
        int minCount=Integer.MAX_VALUE;
        boolean found=false;
        for(char c:hs){
            System.out.println("char selected is "+c);
            int count=canConsistent(hs,hm,s,c,n);
            if(count!=-1){
                minCount=Math.min(count,minCount);
                found=true;
            }
        }
        if(!found)return -1;
        return minCount;
    }

    private static int canConsistent(Set<Character> hs, Map<Character, List<Character>> hm, String s, char c, int n) {
        int counts=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=c){
                Set<Character> hsx=new HashSet<>();
                hsx.add(s.charAt(i));
                int count=canCovert(hm,c,s.charAt(i),hsx);
                if(count==-1)
                    return -1;
                else{
                    counts+=count;
                }
            }
        }
        return counts;
    }

    private static int canCovert(Map<Character, List<Character>> hm, char c,char x,Set<Character> hsx) {
        int minCount=Integer.MAX_VALUE;
        System.out.println("value of x"+x);
        if(hm.containsKey(x)){
            List<Character> l=hm.get(x);
            boolean found=false;
            for (Character character : l) {
                System.out.println("corresponding char "+character);
                if (character == c) {
                    System.out.println("found");
                    return 1;
                }
                if(hsx.contains(character))
                    return -1;
                else {
                    hsx.add(character);
                    int count=canCovert(hm, c, character,hsx);
                    if(count!=-1) {
                        found=true;
                        minCount = Math.min(1 + count, minCount);
                    }
                }
            }
            return found?minCount:-1;
        }

        return -1;
    }
}
/*
Case #1: 2
Case #2: -1
Case #3: 0
Case #4: 3
Case #5: -1
Case #6: 8
Case #7: 100



7
ABC
2
BA
CA
ABC
2
AB
AC
F
0
BANANA
4
AB
AN
BA
NA
FBHC
4
FB
BF
HC
CH
FOXEN
8
NI
OE
NX
EW
OI
FE
FN
XW
CONSISTENCY
26
AB
BC
CD
DE
EF
FG
GH
HI
IJ
JK
KL
LM
MN
NO
OP
PQ
QR
RS
ST
TU
UV
VW
WX
XY
YZ
ZA

 */