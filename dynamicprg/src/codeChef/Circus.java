package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Circus {
    public static boolean dist(double a1,double b1,double a2,double b2,double a3,double b3){
        double dist1=Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
        double dist2=Math.sqrt((a2-a3)*(a2-a3) + (b2-b3)*(b2-b3));
        if(Double.compare(dist1,dist2)==0)
            return true;
        return false;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=br.readLine().split(" ");
        double a1=Double.parseDouble(sarr[0]);
        double b1=Double.parseDouble(sarr[1]);
        sarr=br.readLine().split(" ");
        double a2=Double.parseDouble(sarr[0]);
        double b2=Double.parseDouble(sarr[1]);
        sarr=br.readLine().split(" ");
        double a3=Double.parseDouble(sarr[0]);
        double b3=Double.parseDouble(sarr[1]);
        if(dist(a1,b1,a2,b2,a3,b3)){
            findSolution(a1,b1,a2,b2,a3,b3);
        }
        else {
            System.out.println("I am from second");
            findSolution(a1, b1, a3, b3, a2, b2);
        }
    }

    private static void findSolution(double a1, double b1, double a2, double b2, double a3, double b3) {
        double pi=3.14;
        double angle1 = Math.atan2(b2-b1,a2-a1);
        angle1=angle1*180/pi;
        System.out.println("angle1="+angle1);
        double angle2 = Math.atan2(b3-b2,a3-a2);
        angle2=angle2*180/pi;
        System.out.println("angle2="+angle2);
        double inangle= angle1+angle2;
        System.out.println("exterior"+inangle);
        double side=Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
        int n=Math.abs((int)360/(int)inangle);

        double radianAngle=Math.toRadians((double)180/n);
        System.out.println(n+" "+radianAngle+" "+side);
        double area=(n*side*side)/4*Math.tan(radianAngle);
        System.out.format("%.6f", area);
    }
}