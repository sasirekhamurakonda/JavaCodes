package Walmart;


import java.io.*;
import java.util.*;

public class DemoByBlesan{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException {
        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            ArrayList<Integer[]> a = new ArrayList<>();
            int[] dp = new int[n];
            int[] lastday = new int[n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                Integer[] t = new Integer[2];
                t[0] = Integer.parseInt(st.nextToken());
                t[1] = Integer.parseInt(st.nextToken());
                a.add(t);
            }
            Collections.sort(a, (o1, o2) -> {
                if (o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            });
            System.out.println();
            for (Integer[] t : a) {
                System.out.println(t[0] + " " + t[1]);
            }
            dp[0] = 1;
            lastday[0] = a.get(0)[1];
            for (int i = 0; i < n; i++) {
                dp[i] = 0;
                //dp    --> 1 1
                //lastday-> 6 3
                lastday[i] = a.get(i)[1] + a.get(i)[0] - 1;
                for (int j = i - 1; j >= 0; j--) {
                    if (dp[i] < dp[j] && a.get(i)[1] + lastday[j] <= l) {
                        dp[i] = dp[j];
                        if (a.get(i)[0] > lastday[j]) {
                            lastday[i] = a.get(i)[1] + a.get(i)[0] - 1;
                        } else {
                            lastday[i] = a.get(i)[1] + lastday[j];
                        }
                    }
                }
                dp[i] = dp[i] + 1;
            }
            int max = 0;
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.println(dp[i] + " " + lastday[i]);
                if (max < dp[i]) max = dp[i];
            }
            System.out.println(max);
        }
    }
}