package Flipkart;

import java.util.*;
import java.lang.*;
import java.io.*;
public class EnvironmentVariables {
    public static String MakeEnvi(String s,Map<String,String> hm) {
        int n = s.length();
        int left = -1, right = -1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '%') {
                if (left == -1)
                    left = i;
                else {
                    right = i;
                    String temp = s.substring(left + 1, right);
                    if (hm.containsKey(temp)) {
                        s = s.substring(0, left) + hm.get(temp) + s.substring(right + 1, n);
                    } else {
                        System.out.println("Error!!Not found");
                        flag = false;
                        break;
                    }
                    left = -1;
                    right = -1;
                }
            }
        }

        if (left != -1 || !flag) {
            System.out.println("Error");
        }
        return s;
    }

}
