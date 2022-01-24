package Trial;

class exception_handling
{
    static void throwexception() throws ArithmeticException
    {
        System.out.print("0");
        throw new ArithmeticException ("Exception");
    }
    public static void main(String args[])
    {
        try
        {
            throwexception();
        }
        catch (ArithmeticException e)
        {
            System.out.println("A");
        }
    }
}