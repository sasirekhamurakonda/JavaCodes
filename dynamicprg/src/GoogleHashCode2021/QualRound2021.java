package GoogleHashCode2021;

import java.io.*;
import java.util.*;

public class QualRound2021 {

    static class Street{
        int inS,inE,time;
        String name;
        Street(int ins,int ine,String name,int ti){
            this.inS = ins;
            this.inE = ine;
            this.time = ti;
            this.name = name;
        }
    }
    static class Cars{
        int n;
        String[] streets;
        Cars(int n,String[] s){
            this.n = n;
            this.streets = s;
        }
    }
    static class Outs{
        int id,nincoming;
        String[] names;
        int[] times;
        Outs(int id,int inc,String[] n,int[] t){
            this.id = id;
            this.nincoming = inc;
            this.names = n;
            this.times = t;
        }
        @Override
        public String toString() {
            StringBuilder ans = new StringBuilder();
            ans.append(String.valueOf(id)).append("\n");
            ans.append(String.valueOf(nincoming)).append("\n");
            for(int i=0;i<nincoming;i++) {
                ans.append(names[i]).append(" ").append(times[i]).append("\n");
            }
            return ans.toString();
        }
    }
    static void writeToFile(List<Outs> outs,String fil) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fil+"_out"));//OUT FILE
        writer.write(outs.size()+"\n");
        for(int i=0;i<outs.size();i++){
            writer.write(outs.get(i).toString());
        }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        String[] files = new String[]{"a","b","c","d","e","f"};
        for(int z = 0;z<6;z++){
            BufferedReader br = new BufferedReader(new FileReader("src\\GoogleHashCode2021\\"+files[z]+".txt"));//FileName
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int numberOfIntersections = Integer.parseInt(st.nextToken());
            int nStreets = Integer.parseInt(st.nextToken());
            int nCars = Integer.parseInt(st.nextToken());
            int POINTS = Integer.parseInt(st.nextToken());
            Street[] streetArrays = new Street[nStreets];
            for (int i = 0; i < nStreets; i++) {
                st = new StringTokenizer(br.readLine());
                streetArrays[i] = new Street(Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()),
                        st.nextToken(),
                        Integer.parseInt(st.nextToken()));
            }
            Cars[] cars = new Cars[nCars];
            for (int i = 0; i < nCars; i++) {
                st = new StringTokenizer(br.readLine());
                int q = Integer.parseInt(st.nextToken());
                String[] temp = new String[q];
                for (int j = 0; j < q; j++) {
                    temp[j] = st.nextToken();
                }
                cars[i] = new Cars(q, temp);
            }

            int max = random.nextInt(T-T/2);
//            System.out.println();
            List<Outs> result = new LinkedList<>();
            for (int i = 0; i < numberOfIntersections; i++){
                int nums = 0;
                List<String> tempNames = new LinkedList<>();
                List<Integer> tempInts = new LinkedList<>();
                for (Street s : streetArrays) {
                    if (s.inE == i) {
                        nums++;
                        tempNames.add(s.name);
                        tempInts.add(random.nextInt(max - 1) + 1);
                    }
                }
                String[] temps = new String[nums];
                int[] tempi = new int[nums];
                for (int l = 0; l < nums; l++) {
                    temps[l] = tempNames.get(l);
                    tempi[l] = tempInts.get(l);
                }
                result.add(new Outs(i, nums, temps, tempi));
            }
            writeToFile(result,files[z]);
//        System.out.println(result);


//        Street[][] map = new Street[numberOfIntersections][numberOfIntersections];
//        for(int i=0;i<numberOfIntersections;i++){
//            for(int j=0;j<numberOfIntersections;j++) {
//                map[i][j] = streetArrays[i
//            }
//        }


            System.out.println("DONE");
        }

    }
}
