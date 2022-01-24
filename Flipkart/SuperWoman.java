package Flipkart;

import java.util.*;
import java.lang.*;
import java.io.*;
public class SuperWoman {
    public static int getNumTowers(int[] A) {
        // add your logic here
        double[] tan=new double[A.length];
        int n=A.length;
        int count=0;
        for(int i=0;i<A.length;i++){
            tan[i]=Math.atan(((double)A[i])/(i+1));
            System.out.println(tan[i]);
        }
        int maxi=0;
        double max=0;
        for(int i=0;i<A.length;i++){
            if(max<tan[i]){
                max=tan[i];
                maxi=i;
            }
        }
        System.out.println("outside loop "+maxi+" "+max);
        count=1;
        int tempmaxi=maxi;
        double tempmax=max;
        max=Integer.MIN_VALUE;
        while(tempmaxi!=n+1){
            int i=0;
            max=Integer.MIN_VALUE;
            for(i=tempmaxi+1;i<A.length;i++){
                System.out.println("lower="+(i-tempmaxi)+"upr "+(Math.abs(A[tempmaxi]-A[i])));
                double temp=Math.atan(((double)(A[i]-A[tempmaxi]))/(i-tempmaxi));
                System.out.println(i+" "+temp);
                if(max<temp){
                    max=temp;
                    maxi=i;
                }

            }
            System.out.println(maxi+" "+max);
            if(Math.atan((double)(-A[tempmaxi])/(i-tempmaxi))>max){
                System.out.println(Math.atan((double)(A[tempmaxi])/(i-tempmaxi)));
                System.out.println("inside");
                return count;
            }

            tempmax=max;
            tempmaxi=maxi;
            count++;
            System.out.println("***count***"+count+" "+tempmaxi);
        }
        return count;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr={3,6,5,7,5,2};
        System.out.println("45="+Math.atan(1));
        System.out.println(getNumTowers(arr));
    }
}
/*
 Vowel Spellchecker

Solution
Given a wordlist, we want to implement a spellchecker that converts a query word into a correct word.

For a given query word, the spell checker handles two categories of spelling mistakes:

Capitalization: If the query matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the case in the wordlist.
Example: wordlist = ["yellow"], query = "YellOw": correct = "yellow"
Example: wordlist = ["Yellow"], query = "yellow": correct = "Yellow"
Example: wordlist = ["yellow"], query = "yellow": correct = "yellow"
Vowel Errors: If after replacing the vowels ('a', 'e', 'i', 'o', 'u') of the query word with any vowel individually, it matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the match in the wordlist.
Example: wordlist = ["YellOw"], query = "yollow": correct = "YellOw"
Example: wordlist = ["YellOw"], query = "yeellow": correct = "" (no match)
Example: wordlist = ["YellOw"], query = "yllw": correct = "" (no match)
In addition, the spell checker operates under the following precedence rules:

When the query exactly matches a word in the wordlist (case-sensitive), you should return the same word back.
When the query matches a word up to capitlization, you should return the first such match in the wordlist.
When the query matches a word up to vowel errors, you should return the first such match in the wordlist.
If the query has no matches in the wordlist, you should return the empty string.
Given some queries, return a list of words answer, where answer[i] is the correct word for query = queries[i].



Example 1:

Input: wordlist = ["KiTe","kite","hare","Hare"], queries = ["kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"]
Output: ["kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"]


Note:

1 <= wordlist.length <= 5000
1 <= queries.length <= 5000
1 <= wordlist[i].length <= 7
1 <= queries[i].length <= 7
All strings in wordlist and queries consist only of english letters.*/