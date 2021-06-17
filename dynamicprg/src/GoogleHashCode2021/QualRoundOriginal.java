package GoogleHashCode2021;

import java.io.*;
import java.util.*;


public class QualRoundOriginal {

    static class Street{
        int inS,inE,time;
        int density =0;
        boolean last=true;
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
    static void writeToFile(List<Outs> outs, String fil) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\GoogleHashCode2021\\"+fil+"_out"));//OUT FILE
        writer.write(outs.size()+"\n");
        for(int i=0;i<outs.size();i++){
            writer.write(outs.get(i).toString());
        }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        String[] files = new String[]{"a","b","c","d","e","f"};
        //String[] files = new String[]{"a"};
        for(int z = 0;z<files.length;z++){
            BufferedReader br = new BufferedReader(new FileReader("src\\GoogleHashCode2021\\"+files[z]+".txt"));//FileName
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int numberOfIntersections = Integer.parseInt(st.nextToken());
            int nStreets = Integer.parseInt(st.nextToken());
            int nCars = Integer.parseInt(st.nextToken());
            int POINTS = Integer.parseInt(st.nextToken());

            Street[] streetArrays = new Street[nStreets];
            Map<String,Integer> nameToId = new HashMap<>();
            for (int i = 0; i < nStreets; i++) {
                st = new StringTokenizer(br.readLine());
                int one = Integer.parseInt(st.nextToken());
                int two = Integer.parseInt(st.nextToken());
                String tempname =st.nextToken();
                nameToId.put(tempname,i);
                streetArrays[i] = new Street(one,two,tempname,Integer.parseInt(st.nextToken()));
            }
            Cars[] cars = new Cars[nCars];
            for (int i = 0; i < nCars; i++) {
                st = new StringTokenizer(br.readLine());
                int q = Integer.parseInt(st.nextToken());
                String[] temp = new String[q];
                for (int j = 0; j < q; j++) {
                    temp[j] = st.nextToken();
                    streetArrays[nameToId.get(temp[j])].density++;
                    if(j<q-1){
                        streetArrays[nameToId.get(temp[j])].last=false;
                    }
                }
                cars[i] = new Cars(q, temp);
            }
            //for(Street s:streetArrays){
            //    System.out.println(s.name+" "+s.last);
            //}
            List<Outs> result = new LinkedList<>();
            for(int i=0;i<numberOfIntersections;i++){
                int nums =0;
                List<String> tempNames = new LinkedList<>();
                List<Integer> tempInts = new LinkedList<>();
                int countz=0;
                for (Street s : streetArrays) {
                    if (s.inE == i) {
                        if(s.density!=0) {
                            nums++;
                            tempNames.add(s.name);
                            tempInts.add(s.density);
                            //tempInts.add(s.density%T==0?1:s.density%T);
                            //tempInts.add(1);

                            if(s.last){
                                countz++;
                            }
                        }

                    }

                }
                if(nums>0&&countz!=nums) {
                    String[] temps = new String[nums];
                    int[] tempi = new int[nums];
                    for (int l = 0; l < nums; l++) {
                        temps[l] = tempNames.get(l);
                        tempi[l] = tempInts.get(l);
                    }
                    result.add(new Outs(i, nums, temps, tempi));
                }
            }
            writeToFile(result,files[z]);

            System.out.println(files[z]+" DONE");
        }

    }


}