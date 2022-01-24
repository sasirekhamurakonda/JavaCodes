package Edyst;


import java.util.*;
        import java.lang.*;
        import java.io.*;
public class code1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        boolean found=false;
        Map<String,Integer> hm=new HashMap<>();
        for(int i=0;i<t;i++){
            String s=br.readLine();
            if(s.charAt(0)=='!'){
                if(hm.containsKey(s.substring(1))) {
                    System.out.println("happy");
                    found=true;
                    break;
                }
                else{
                    hm.put(s,1);
                }
            }
            else{
                if(hm.containsKey("!"+s)) {
                    System.out.println("happy");
                    found=true;
                    break;
                }
                else{
                    hm.put(s,1);
                }
            }
        }
        if(!found)
            System.out.println("unhappy");
    }
}