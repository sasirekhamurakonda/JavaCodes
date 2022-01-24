package AnInternshipTest;

import java.util.*;
import java.lang.*;
import java.io.*;
public class FindAllPossiblePatternsandUnique {
    public static void findAllPossiblePatterns(String s,LinkedHashSet<String> hs){
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=s.length()-i;j++){
                if(!hs.contains(s.substring(j,j+i))){
                    hs.add(s.substring(j,j+i));
                }
            }
        }
    }
    private static void findAllUniquePatterns(ArrayList<String> arrl) {

        for(int i=0;i<arrl.size();i++){
            String s=arrl.get(i);
            int len=s.length();
            for(int j=i+1;j<arrl.size();j++){
                if (arrl.get(j).length() > len && arrl.get(j).substring(0,len).compareTo(s)==0) {
                    arrl.remove(s);
                    i--;
                    break;
                }
            }
        }
    }
    private static void findAllSubstrings(String string) {
        System.out.print("Appling 123 steps for all substrings:");
        for(int i=0;i<string.length();i++){
            String inputString=string.substring(0,i+1);
            LinkedHashSet<String> hs=new LinkedHashSet<>();
            findAllPossiblePatterns(inputString,hs);
            ArrayList<String> arrl=new ArrayList<>();
            for(String s:hs){
                arrl.add(s);
            }
            findAllUniquePatterns(arrl);
            System.out.print(arrl.size());
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the input String:");
        String inputString=br.readLine();
        LinkedHashSet<String> hs=new LinkedHashSet<>();
        findAllPossiblePatterns(inputString,hs);
        System.out.println("Logic 1:Printing all the possible patterns without repetition");
        for(String s:hs)
            System.out.println(s);
        System.out.println("Logic 2:Printing all the unique patterns without repetition");
        ArrayList<String> arrl=new ArrayList<>();
        for(String s:hs){
            arrl.add(s);
        }
        findAllUniquePatterns(arrl);
        for(int i=0;i<arrl.size();i++){
            System.out.println(arrl.get(i));
        }
        System.out.println("Logic 3:Printing the number of the unique patterns without repetition");
        System.out.println("The number of unique patterns without repetition are: "+arrl.size());
        System.out.println("Logic 4:Create all possible substrings and apply logic123 and print output of 3");
        inputString=br.readLine();
        findAllSubstrings(inputString);
        System.out.println("Logic 5:Taking input from input.txt and writing it to profile.txt");
        br=new BufferedReader(new FileReader("src\\AnInternshipTest\\input.txt"));
        inputString=br.readLine();
        ArrayList<String> arrlf=new ArrayList<>();
        while(inputString!=null){
            if(isValid(inputString))
                arrlf.add(inputString);
            inputString=br.readLine();
        }
        findUniqueAndWriteTofile(arrlf);


    }

    private static void findUniqueAndWriteTofile(ArrayList<String> arrlf)throws IOException {
        BufferedWriter writer=new BufferedWriter(new FileWriter("src\\AnInternshipTest\\profile.txt"));
        for(int i=0;i<arrlf.size();i++){
            String inputString=arrlf.get(i);
            LinkedHashSet<String> hs=new LinkedHashSet<>();
            findAllPossiblePatterns(inputString,hs);
            ArrayList<String> arrl=new ArrayList<>();
            for(String s:hs){
                arrl.add(s);
            }
            findAllUniquePatterns(arrl);
            writer.write("Finding all input patterns for "+inputString+"\n");
            for(int j=0;j<arrl.size();j++)
                writer.write(arrl.get(j)+"\n");
        }
        System.out.println("Written to the file profile.txt");
        writer.close();
    }

    private static boolean isValid(String inputString) {
        for(Character c:inputString.toCharArray())
            if(c-'0'>1)
                return false;
        return true;
    }
}
