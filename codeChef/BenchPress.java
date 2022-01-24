package codeChef;


import java.util.*;
        import java.lang.*;
        import java.io.*;


class BenchPress
{
    static int findWays(List<Integer> nums, int S)
    {
        return dfs(nums, S, 0, 0);
    }

    // Function to count the number of ways
    static int dfs(List<Integer> nums, int S,
                   int curr_sum, int index)
    {
        // Base Case: Reached the
        // end of the array
        if (index == nums.size()) {

            // Sum is equal to the
            // required sum
            if (S == curr_sum)
                return 1;
            else
                return 0;
        }

        // Recursively check if required sum
        // can be obtained by adding current
        // element or by subtracting the
        // current index element
        return dfs(nums, S, curr_sum + nums.get(index),
                index + 1)
                + dfs(nums, S, curr_sum -  nums.get(index),
                index + 1);
    }
    static int knapSack(List<Integer> nums, int S)
    {
        int sum = 0;
        for (int i : nums)
            sum += i;

        // If target + sum is odd or S exceeds sum
        if (sum < S || -sum > -S || (S + sum) % 2 == 1)

            // No sultion exists
            return 0;

        int[] dp = new int[(S + sum) / 2 + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int i = dp.length - 1; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }



        // Return the answer
        return dp[dp.length - 1];
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,w,wr;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            w=Integer.parseInt(sarr[1]);
            wr=Integer.parseInt(sarr[2]);
            sarr=br.readLine().split(" ");
            if(w<=wr)
                System.out.println("YES");
            else if((w-wr)%2!=0)
                System.out.println("NO");
            else{
                w=w-wr;
                w=w/2;
                HashMap<Integer,Integer> hm=new HashMap<>();
                for(int j=0;j<n;j++){
                    int z=Integer.parseInt(sarr[j]);
                    if(hm.containsKey(z)){
                        hm.put(z,hm.get(z)+1);
                    }
                    else{
                        hm.put(z,1);
                    }
                }
                List<Integer> res=new ArrayList<>();
                for(Integer ele:hm.keySet()){
                    if(hm.get(ele)>1){
                        int z=hm.get(ele)/2;
                        for(int j=0;j<z;j++)
                            res.add(ele);
                    }
                }
                int result=knapSack(res,w);
                if(result>0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

    }
}

