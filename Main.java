
import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException{
       /* BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        char min='z';
        for(char c:s.toCharArray()){
            if(c-'a'<min-'a'){
                min=c;
            }
        }
        int n=s.length();
        String x=Character.toString(min);
        s="";
        for(int i=0;i<n;i++)
            s=s+x;
        System.out.println(s);*/
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=br.readLine().split(" ");
        int chandler=Integer.parseInt(sarr[0]);
        int joey=Integer.parseInt(sarr[1]);
        int i=1;
        while(joey>0&&chandler>0){
            if((i&1)==1){
                if(joey<i){
                    joey=0;
                }
                else{
                    chandler=chandler+i;
                    joey=joey-i;
                }
            }
            else{
                if(chandler<i)chandler=0;
                else{
                    joey=joey+i;
                    chandler=chandler-i;
                }
            }
            System.out.println(joey+" "+chandler+" "+i);
            i++;
        }
        if(joey==0)
            System.out.println("Chandler");
        else
            System.out.println("Joey");*/

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=br.readLine().split(" ");
        int Apples=Integer.parseInt(sarr[0]);
        int Oranges=Integer.parseInt(sarr[1]);
        int expect=findExpect(Apples,Oranges);
        System.out.println(expect);


    }
    public static int findExpect(int Apples,int oranges){
        if(Apples==0||oranges==0)
            return 0;
        if(Apples<oranges)
        return 1+findExpect(Apples-1,oranges+1);
        return 1+findExpect(Apples+1,oranges-1);
    }

}