package Edyst;


class FindNCR {

    static int nCr(int n, int r)
    {
        return fact(2*n) / (fact(n) *
                fact(n));
    }

    // Returns factorial of n
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 5, r = 5;
        System.out.println(nCr(n, r));
    }
}

// This code is Contributed by
// Smitha Dinesh Semwal.
