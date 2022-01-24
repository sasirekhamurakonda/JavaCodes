package ladyada.finalround;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.stream.Collectors;

public class AddCompanyTitles2 {
    static BufferedReader br;
    static BufferedReader sym;
    static BufferedWriter bw;
    public static int findAllCompanies(Map<String,String> hm,List<String> com)throws IOException{
        sym=new BufferedReader(new FileReader("symbols.txt"));
        String line;
        int max=0;
        while((line=sym.readLine())!=null){
            line=line.trim().replaceAll(" +", " ");
            String[] words=line.split(" ");
            com.add(words[0]);
            StringBuilder company= new StringBuilder();
            int len=words.length;
            if(len-1>max){
                max=len-1;
            }
            for(int i=0;i<len-1;i++){
                if(i==words.length-2){
                    company.append(words[i]);
                }
                else {
                    company.append(words[i]).append(" ");
                }
            }
            if(company.length()>5)
            hm.put(company.toString(),words[len-1]);
        }
        int i=0;
        return max;
    }
    public static void main(String[] args)throws IOException{
        br=new BufferedReader(new FileReader("input.txt"));
        bw=new BufferedWriter(new FileWriter("output.txt"));
        //extracting company names from the symbol.txt
        Map<String,String> hm=new HashMap<>();
        List<String> com=new ArrayList<>();
        int max=findAllCompanies(hm,com);


        String line;
        while((line=br.readLine())!=null){
            line = line.trim().replaceAll(" +", " ");
            String[] wordlist=line.split(" ");
            int len=wordlist.length;
            for(int i=0;i<len;i++){
                int p=wordlist[i].length();

                if(com.contains(wordlist[i])){
                    String curr=wordlist[i];
                    if(hm.containsKey(curr)){
                        bw.write(curr+" ($"+hm.get(curr)+") ");
                    }
                    else {
                        boolean found=false;
                        int j = 0;
                        for (j = i + 1; j < len && j < i + max; j++) {
                            curr += " " + wordlist[j];
                            String pp=curr.substring(0,curr.length()-1);
                            if (hm.containsKey(curr)) {
                                bw.write(curr + " ($" + hm.get(curr) + ") ");
                                found = true;
                                break;
                            }
                            else if(hm.containsKey(pp)){
                                bw.write(pp+" ($"+hm.get(pp)+")"+curr.charAt(curr.length()-1));
                                break;
                            }

                        }
                        if (!found) {
                            bw.write(curr + " ");
                        }
                        i=j;
                    }
                }
                else if(p>0&&com.contains(wordlist[i].substring(0,p-1))){
                    String curr=wordlist[i];
                    String pp=curr.substring(0,curr.length()-1);
                    if(hm.containsKey(pp)){
                        bw.write(pp+" ($"+hm.get(pp)+")"+curr.charAt(curr.length()-1));
                    }
                }

                else{
                    bw.write(wordlist[i]+" ");
                }
            }
            bw.write("\n");

        }
        br.close();
        bw.close();
        sym.close();

    }
}
