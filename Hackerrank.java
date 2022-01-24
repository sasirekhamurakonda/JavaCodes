
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'abbreviation' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */
//    public static boolean abbr(String a,String b){
//        if(a==null)
//    }
    public static boolean abb(String a,String b){
        int m=a.length();
        int n=b.length();
        if(m==0){
            a=null;
        }
        if(n==0){
            b=null;
        }
        if(a==null&&b==null)return true;
        if(a!=null&&b==null){

            for(int i=0;i<a.length();i++){
                if(!Character.isLowerCase(a.charAt(i)))
                    return false;
            }
            return true;
        }
        if(a==null&&b!=null)return false;
        //System.out.println(a+" "+b+" "+a.length()+" "+b.length());
        if(a.charAt(m-1)==b.charAt(n-1)){
            return abb(a.substring(0,m-1),b.substring(0,n-1));
        }
        else if(a.charAt(m-1)!=b.charAt(n-1)&&Character.isLowerCase(a.charAt(m-1))){
            if(Character.toUpperCase(a.charAt(m-1))==b.charAt(n-1)){
                //if(m!=1&&n!=1)
                return abb(a.substring(0,m-1),b.substring(0,n-1))||abb(a.substring(0,m-1),b);

            }
            else{
                return abb(a.substring(0,m-1),b);
            }
        }
        return false;

    }
    public static String abbreviation(String a, String b) {
        if(abb(a,b))
            return "YES";
        return "NO";
        //     if(a==null||b==null)return "NO";
        //    int m=a.length();
        //    int n=b.length();
        //    int i=m-1,j=n-1;
        //    boolean foundSmall=false;
        //    while(i>=0&&j>=0){
        //     if(a.charAt(i)==b.charAt(j)){
        //         foundSmall=false;
        //         i--;
        //         j--;
        //     }
        //     else if(Character.toUpperCase(a.charAt(i))==b.charAt(j)){
        //         foundSmall=true;
        //         i--;
        //         j--;
        //     }

        //     else{
        //         if(Character.isLowerCase(a.charAt(i))){
        //             i--;
        //         }
        //         else{
        //             if(j+1<n&&foundSmall&&a.charAt(i)==b.charAt(j+1)){
        //                 foundSmall=false;
        //                 i--;
        //             }
        //             else
        //                return "NO";
        //         }
        //     }
        //    }
        //    if(j<0&&i<0)return "YES";
        //    else if(i>=0){
        //        while(i>=0&&Character.isLowerCase(a.charAt(i)))
        //          i--;
        //        if(i<0)
        //          return "YES";
        //    }
        //    return "NO";






     /*
       int[][] res=new int[m+1][n+1];
       for(int i=1;i<=m;i++){
           for(int j=1;j<=n;j++){
               if(a.charAt(i-1)==b.charAt(j-1)||Character.toUpperCase(a.charAt(i-1))==b.charAt(j-1))
                res[i][j]=1+res[i-1][j-1];
               else{
                   //if(Character.isLowerCase(a.charAt(i-1)))
                     res[i][j]=Math.max(res[i-1][j],res[i][j-1]);
                   //else
                   //  return "NO";
               }
           }
       }
       for(int i=0;i<=m;i++){
           for(int j=0;j<=n;j++){
               System.out.print(res[i][j]+" ");
           }
           System.out.println();
       }
       if(res[m][n]==b.length()){
           int i=0,j=0;
           i=m;
           j=n;
           int index=b.length()-1;
           char[] chArr=new char[b.length()];
           while(i>0&&j>0){
               if(a.charAt(i-1)==b.charAt(j-1)||Character.toUpperCase(a.charAt(i-1))==b.charAt(j-1)){
                   chArr[index]=b.charAt(j-1);
                   i--;
                   j--;
                   index--;
               }
               else if(res[i-1][j]>res[i][j-1]){
                   if(Character.isLowerCase(a.charAt(i-1)))
                      i--;
                    else
                      return "NO";
               }
               else{
                   if(Character.isLowerCase(a.charAt(i-1)))
                      j--;
                    else
                      return "NO";
               }
           }
           String resString=String.valueOf(chArr);
           if(resString.compareTo(b)==0)return "YES";

       }
       return "NO";
       */

       /*while(i<m&&j<n){
           System.out.println(i+" "+j);
           System.out.println(a.charAt(i)+" "+b.charAt(j));
           if(a.charAt(i)==b.charAt(j)||Character.toUpperCase(a.charAt(i))==b.charAt(j)){
               i++;
               j++;
           }
           else{
               while(i<m&&(a.charAt(i)!=b.charAt(j)&&Character.toUpperCase(a.charAt(i))!=b.charAt(j))&&Character.isLowerCase(a.charAt(i))){
                   i++;
               }
               if(i==m)return "NO";
              if(a.charAt(i)==b.charAt(j)||Character.toUpperCase(a.charAt(i))==b.charAt(j)){
                   i++;
                   j++;
               }
               else
               return "NO";
           }
       }
       if(j==n&&i==m)return "YES";
       else if(j==n&&i<m){
           while(i<m&&Character.isLowerCase(a.charAt(i)))
              i++;
            if(i==m)return "YES";
       }
       return "NO";
       */


    }

}

/*
NO
NO
YES
YES
YES
NO
YES
NO
YES
YES
*/

public class Hackerrank {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String a = bufferedReader.readLine();

            String b = bufferedReader.readLine();

            String result = Result.abbreviation(a, b);

            System.out.println(result);
        }

        bufferedReader.close();

    }
}
/*
YES
YES
YES
NO
YES
YES
YES
YES
NO
YES
 */