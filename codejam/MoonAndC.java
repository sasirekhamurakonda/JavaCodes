package codejam;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class MoonAndC {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int[] res=new int[t];
        int x,y,count=0;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            x=Integer.parseInt(sarr[0]);
            y=Integer.parseInt(sarr[1]);
            String s=sarr[2];
            count=0;
            if(s.length()>1) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '?') {
                        if (j == 0) {
                            if (s.charAt(j+1)!='?'){
                                if (s.charAt(j+1)=='C'){
                                    s="C"+s.substring(j+1);
                                }
                                else{
                                    s="J"+s.substring(j+1);
                                }
                            }
                            else{
                                //System.out.println("I am mad");
                                int k=j+1;
                                while(k<s.length()&&s.charAt(k)=='?'){
                                    k++;
                                }
                                if(k==s.length()){
                                    break;
                                }
                                else{
                                    if (s.charAt(k)=='C'){
                                        String temp="";
                                        for(int z=0;z<(k-j+1);z++){
                                            temp=temp+"C";
                                        }
                                        j=k-1;
                                        s=temp+s.substring(j+1);
                                    }
                                    else{
                                        String temp="";
                                        for(int z=0;z<(k-j+1);z++){
                                            temp=temp+"J";
                                        }
                                        j=k-1;
                                        s=temp+s.substring(j+1);
                                    }
                                }
                            }
                        }
                        else if(j==s.length()-1){
                            if(s.charAt(j-1)=='C'){
                                s=s.substring(0,s.length()-1)+"C";
                            }
                            else{
                                s=s.substring(0,s.length()-1)+"J";
                            }
                        }
                        else{
                            if(s.charAt(j-1)=='J'&&s.charAt(j+1)=='J'){
                                s=s.substring(0,j)+'J'+s.substring(j+1,s.length());
                            }
                            else if(s.charAt(j-1)=='C'&&s.charAt(j+1)=='C'){
                                s=s.substring(0,j)+'C'+s.substring(j+1,s.length());
                            }
                            else if(s.charAt(j-1)=='J'&&s.charAt(j+1)=='C'){
                                s = s.substring(0, j) + 'C' + s.substring(j + 1, s.length());
                                count=count+y;
                            }
                            else if(s.charAt(j-1)=='C'&&s.charAt(j+1)=='J'){
                                s = s.substring(0, j) + 'J' + s.substring(j + 1, s.length());
                                count=count+x;
                            }
                            else{
                                //System.out.println("I am amd again");
                                if(s.charAt(j-1)=='C'&&s.charAt(j+1)=='?'){
                                    s = s.substring(0, j) + 'C' + s.substring(j + 1, s.length());

                                }
                               /* else if(s.charAt(j-1)=='C'&&s.charAt(j+1)=='?'&&x>y){
                                    s = s.substring(0, j) + 'J' + s.substring(j + 1, s.length());
                                    count=count+y;
                                }*/
                                if(s.charAt(j-1)=='J'&&s.charAt(j+1)=='?'){
                                    s = s.substring(0, j) + 'J' + s.substring(j + 1, s.length());

                                }
                                /*else if(s.charAt(j-1)=='J'&&s.charAt(j+1)=='?'&&y>x){
                                    s = s.substring(0, j) + 'C' + s.substring(j + 1, s.length());
                                    count=count+y;
                                }*/

                            }
                        }
                    }
                    else{
                        if(j>0){
                            if(s.charAt(j)=='C'&&s.charAt(j-1)=='J'){
                                //System.out.println("inside JC");
                                count=count+y;
                            }
                            else if(s.charAt(j)=='J'&&s.charAt(j-1)=='C'){
                                //System.out.println("count before"+count);
                                count=count+x;
                                //System.out.println("inside CJ"+count);
                            }
                        }
                    }
                }
            }
            System.out.println("final modified string is:"+s);
            res[i]=count;
        }
        for(int i=0;i<t;i++)
            System.out.println("Case #"+(i+1)+": "+res[i]);

    }
}
/*
4
2 3 CJ?CC?
4 2 CJCJ
1 3 C?J
2 5 ??J???
 */