package Facebook;


import javax.swing.text.AttributeSet;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ConsistentString{
    public static void findOccurences(String s,Map<Character,Integer> hm){
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.containsKey(ch)?hm.get(ch)+1:1);
        }
    }
    public static int findVowels(String s){
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                count++;
        }
        return count;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String s=br.readLine();
            int n=s.length();
            if(n==1) {
                System.out.println("Case #"+(i+1)+": 0");
            }
            else{
                Map<Character,Integer> hm=new HashMap<>();
                findOccurences(s,hm);
                int vowels=findVowels(s);
                int consonants=n-vowels;
                int minCount=findMinCount(hm,vowels,consonants,n,s);
                System.out.println("Case #"+(i+1)+": "+minCount);
            }

        }
    }

    private static int findMinCount(Map<Character, Integer> hm, int vowels, int consonants, int n, String s) {
        if(consonants==n){
            return consonants;
        }
        else if(vowels==n){
            return vowels;
        }
        int minCount=Integer.MAX_VALUE;
        int count=0;
        HashSet<Character> hs=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                if(!hs.contains(ch)){
                    hs.add(ch);
                    int remV=vowels-hm.get(ch);
                    minCount=Math.min(minCount,remV*2+consonants);
                }
            }
            else{
                if(!hs.contains(ch)){
                    hs.add(ch);
                    int remC=consonants-hm.get(ch);
                    minCount=Math.min(minCount,remC*2+vowels);
                }
            }
        }
        return minCount;
    }
}
/*
6
ABC
F
BANANA
FBHC
FOXEN
CONSISTENCY


Case #1: 2
Case #2: 0
Case #3: 3
Case #4: 4
Case #5: 5
Case #6: 12

10
ABC
F
BANANA
FBHC
FOXEN
CONSISTENCY
HAAACKEEERCUUUP
OOEUEUIUUOOAUEIOIEEUIAIUAUOOAUUIIEUUOAAIOAEAUEIAOAOOAOOAAIEOAEOEIOIAAEAAIOEEOIIIEEIOIUEIEEEAAEEEEOAA
QPQWJXRJJXBTKKGBKVXNSCQBHZTSFZRYCDZFYQJQWHWHYJVDRXSGWRLJNTHBXYBRBTVXBBPPCXRBFVXVNDQQTHHBKXZDPQZGSHWF
EDHHDGFGCFHBHCAFGHHCBDHHECAEGGAGAGDGEGGFDGBCDFDCBHFGBDBCGHEACCGFAGEFBFGECFGFCGGBEDGDBFCEHEDHEHHFGCEB

 */
