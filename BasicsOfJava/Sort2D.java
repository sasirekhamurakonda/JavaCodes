package BasicsOfJava;

import java.net.CookieHandler;
import java.util.*;
import java.lang.*;
import java.io.*;
class Student implements Comparable<Student>{
    int rollno;
    String name;
    int marks;
    int age;
    public Student(int roolno,String name,int marks,int age){
        this.rollno=roolno;
        this.name=name;
        this.marks=marks;
        this.age=age;
    }
    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}
public class Sort2D {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        /*****************************************************************
         * Sorting a 2d array.
         */
//        int n=Integer.parseInt(br.readLine());
//        int[][] arr=new int[n][2];
//        for(int i=0;i<n;i++){
//            String[] sarr=br.readLine().split(" ");
//            arr[i][0]=Integer.parseInt(sarr[0]);
//            arr[i][1]=Integer.parseInt(sarr[1]);
//        }
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0]<o2[0]){
//                    return -1;
//                }
//                else if(o1[0]>o2[0])
//                    return 1;
//                if(o1[1]<o2[1])return -1;
//                else if(o1[1]>o2[1])return 1;
//                return 0;
//            }
//        });
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i][0]+" "+arr[i][1]);
//        }
        /********************************************************
         * Sorting a 2d ArrayList
         */


//            n = Integer.parseInt(br.readLine());
//            List<ArrayList<Integer>> arrl=new ArrayList<>();
//            String[] sarr;
//            for (int j = 0; j < n; j++) {
//                sarr = br.readLine().split(" ");
//                ArrayList<Integer> array = new ArrayList<>();
//                array.add(Integer.parseInt(sarr[0]));
//                array.add(Integer.parseInt(sarr[1]));
//                arrl.add(array);
//            }
//            Collections.sort(arrl, new Comparator<ArrayList<Integer>>() {
//                @Override
//                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
//                    if(o1.get(0)<o2.get(0))return -1;
//                    else if(o1.get(0)>o2.get(0))return 1;
//                    else{
//                        if(o1.get(1)<o2.get(1))return -1;
//                        else if(o1.get(1)>o2.get(1))return 1;
//                    }
//                    return 0;
//                }
//            });
//            for(ArrayList<Integer> array:arrl){
//                System.out.println(array.get(0)+" "+array.get(1));
//            }

        /************************************************
         * Sort a  array of class Student based on marks in desc order
         */
        Student s1=new Student(1,"aarthi",555,17);
        Student s2=new Student(2,"aishwarya",560,16);
        Student s3=new Student(3,"AnushaG",540,17);
        Student s4=new Student(4,"AnushaM",540,18);
        Student s5=new Student(5,"Bhargavi",565,20);
        Student[] stdarr=new Student[5];
        stdarr[0]=s1;
        stdarr[1]=s2;
        stdarr[2]=s3;
        stdarr[3]=s4;
        stdarr[4]=s5;


        //using comparable belongs to java.lang, changes the structure of class, only one parameter is checked against,
        Arrays.sort(stdarr);
        for(Student std:stdarr){
            System.out.println(std.marks+" "+std.name+" "+std.rollno+" "+std.age);
        }
        System.out.println("using compare");
        //using comparator belongs to java.util, does not change the structure of class, more than one param can be compared to
        Arrays.sort(stdarr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.marks>o2.marks)return -1;
                else if(o1.marks<o2.marks)return 1;
                else{
                    if(o1.name.compareTo(o2.name)<0)return -1;
                    else if(o1.name.compareTo(o2.name)>0)return 1;
                    return 0;
                }
            }
        });
        for(Student std:stdarr){
            System.out.println(std.marks+" "+std.name+" "+std.rollno);
        }
    }
}
