package Trial;

import java.util.*;
import java.lang.*;
import java.io.*;
public class FileInputting {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("src\\Trial\\a_in"));
        int k=Integer.parseInt(br.readLine());
        int t=Integer.parseInt(br.readLine());
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\Trial\\out"));
        System.out.println(k+" "+t);
        bw.write('a');
        bw.write(String.valueOf(t));
        bw.close();
        br.close();
    }
}