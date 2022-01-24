package ladyada;

import java.util.*;
import java.lang.*;
import java.io.*;
public class CountIdentifiers{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        String line="";
        int count=0;
        while((line=br.readLine())!=null){
            String curr="";
            for(int i=0;i<line.length();i++){
                if(Character.isAlphabetic(line.charAt(i))){
                    curr+=line.substring(i,i+1);
                }
                else{
                    if(curr.length()>0){
                        count++;
                        curr="";
                    }
                }
            }
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }
}