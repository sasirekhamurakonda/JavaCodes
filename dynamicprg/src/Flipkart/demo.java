package Flipkart;

import java.util.*;
import java.io.*;
class DanceCoach{
    int coachId;
    private static int counter = 1010;
    public DanceCoach(String coachName){
        String coachNameStr = coachName;
        this.coachId = DanceCoach.counter++;
    }
}
public class demo{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;
    public static void main(String[] args)throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[] pos = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            pos[i] = Integer.parseInt(st.nextToken());
        }
        int max = Integer.MAX_VALUE;
        int lastIndex = pos[n-1];
        long v = lastIndex+y;
        int dropped = 0;
        for(int i=n-2;i>=0;i--){
            v+= (pos[i+1]-pos[i])*(long)Math.pow(n-i-dropped,2);
            long tpick = y+pos[i]*(long)Math.pow((n-i-dropped+1),2)+y;
            long tNoPick = pos[i]+(long)Math.pow(n-i-dropped,2)*pos[i]+y+y+pos[i]*(long)Math.pow((n-i -dropped),2)+y;
            if(tpick<tNoPick){
                v+=y;
            }else{
                v+=tNoPick;
                dropped++;
            }
        }



        System.out.println(v);
    }
}