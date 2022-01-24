package Revenge;

public class GFG
{
    static void bin(long n)
    {
        long i;
        System.out.print("0");
        int j=0;
        System.out.println("first time");
        for (i = 1 << 30; i > 0; i = i / 2)
        {
            System.out.println("j value is "+j+" i value is "+i);
            j++;
            if((n & i) != 0)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        bin(7);
        System.out.println();
        bin(4);
    }
}
