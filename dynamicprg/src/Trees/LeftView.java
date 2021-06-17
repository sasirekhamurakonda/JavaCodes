package Trees;
import java.util.*;
import java.io.*;
import java.lang.*;
class Movie {
    public int licenseCost;
    public int ticketPrice;

    Movie(int licenseCost, int ticketPrice) {
        this.licenseCost = licenseCost;
        this.ticketPrice = ticketPrice;
    }
}
public class LeftView{
   /* class Node {
        public Node left;
        public Node right;
        public int data;

        public Node(int data) {
            this.data = data;
        }
    }
    int getMeanestLevel(Node root) {
        // add logic here
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        int max_level=-1;
        int level=-1;
        double max_avg=0;
        while(!queue.isEmpty()){
            level++;
            int sum=0;
            int n=queue.size();
            for(int i=1;i<=n;i++){
                Node temp=queue.poll();
                sum=sum+temp.data;
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            double avg=(double)sum/n;
            if(max_avg>avg){
                max_avg=avg;
                max_level=level;
            }

        }
        return max_level;
    }
    int[] leftView(Node root) {
        // add your logic here
        ArrayList<Integer> arl=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            // number of nodes at current level
            int n = queue.size();

            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();

                // Print the left most element at
                // the level
                if (i == 1)
                    arl.add(temp.data);

                // Add left node to queue
                if (temp.left != null)
                    queue.add(temp.left);

                // Add right node to queue
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
        int[] arr=new int[arl.size()];
        for(int i=0;i<arl.size();i++){
            arr[i]=arl.get(i);
        }
        return arr;
    }

    int max_level=0;
    public static ArrayList<String> getOriginalWords(String word) {
		// add your logic here
		int len=word.length();
		ArrayList<String> arls=new ArrayList<String>();
		String temp=word+"aeiou";
		char[] chaArr=temp.toCharArray();
		Arrays.sort(chaArr);
		String s=String.valueOf(chaArr);
		Map<Character,Integer> hm=new HashMap<>();
		int i=0;
		for(Character c:word.toCharArray()){
		    hm.put(c,i);
		    i++;
        }
		getPerm(arls,hm,s,len,s.length(),"");
		return arls;
	}

    private static void getPerm(ArrayList<String> arls, Map<Character,Integer> hm, String s, int k, int n, String prefix) {
        if(k==0){
            for(int i=0;i<prefix.length();i++){
                char c=prefix.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){

                }
                else{
                    if(i!=hm.get(c)){
                        return;
                    }
                }
            }
            arls.add(prefix);
            return;
        }
        for(int i=0;i<n;i++){
            String newPrefix=prefix+s.charAt(i);
            getPerm(arls,hm,s,k-1,n,newPrefix);
        }
    }
    public static Map<Integer,Integer> hm=new HashMap<>();
    public static void leaderBoard(int[] scores) {
        //add initialization logic here
        int n=scores.length;
        int[] indices=new int[n];
        for(int i=0;i<n;i++){
            int max=scores[i];
            int maxi=i;
            for(int j=i+1;j<n;j++){
                if(max<scores[j]){
                    max=scores[j];
                    maxi=j;
                }
            }
            int temp=scores[i];
            scores[i]=scores[maxi];
            scores[maxi]=temp;
            indices[i]=maxi;
        }
        int rank=1;
        for(int i=0;i<n;i++){
            System.out.println(scores[i]+" "+ indices[i]);

        }
        for(int i=0;i<n;i++){
            int x=i;
            while(i+1<n&&scores[i]==scores[i+1]){
                i++;
            }
            for(int z=x;z<=i;z++){
                hm.put(indices[z],rank);
            }
            rank=rank+(i-x+1);

        }
        int n=scores.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=scores[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        for(int i=0;i<n;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
        int rank=1;
        for(int i=0;i<n;i++){
            int x=i;
            while(i+1<n&&arr[i][0]==arr[i+1][0]){
                i++;
            }
            for(int z=x;z<=i;z++){
                hm.put(arr[z][1],rank);
            }
            rank=rank+(i-x+1);
        }
        hm.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

    }

    //Expected Complexity: O(1)
    public static int getRank(int playerId) {
        //add getRank logic here
        return hm.get(playerId);
    }
    int[] leftView(Node root) {
        // add your logic here
        max_level=0;
        List<Integer> ls=new ArrayList<>();
        leftView(root,1,ls);
        int[] res=new int[ls.size()];
        int j=0;
        for(int i:ls){
            res[j]=i;
            j++;
        }
        return res;
    }
    void leftView(Node root,int level,List<Integer> res){
        if(root==null){
            return;
        }
        if(max_level<level){
            res.add(root.data);
            max_level=level;
        }
        leftView(root.left,level+1,res);
        leftView(root.right,level+1,res);
    }*/
  /*  class sortByLicense implements Comparator<Movie>{
       public int compare(Movie m1,Movie m2){
           return m1.licenseCost-m2.licenseCost;
       }
   }*/

   /* public int getMaxCapital(int S, int R, int n, Movie[] movies)  {
        Arrays.sort(movies,)
       // ArrayList<Movie> moviesl=Arrays.asList(movies);
       // Collections.sort(movies,new sortByLicense());
        return 0;
    }*/
    public static void main(String[] args) throws IOException{
       /* BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arl=getOriginalWords("fk");
        for(String s:arl){
            System.out.print(s+", ");
        }
        System.out.println();
        int[] scores={6,4,6,8};
        leaderBoard(scores);
        System.out.println(getRank(4));*/

    }
}
/*
aa, ae, ai, ak, ao, au, ea, ee, ei, ek, eo, eu, fa, fe, fi, fk, fo, fu, ia, ie, ii, ik, io, iu, oa, oe, oi, ok, oo, ou, ua, ue, ui, uk, uo, uu
aa ae ai ak ao au ea ee ei ek eo eu fa fe fi fk fo fu ia ie ii ik io iu oa oe oi ok oo ou ua ue ui uk uo uu
 */
