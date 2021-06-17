package Trial;
import java.util.*;

class Bill {
    int itemPrice;
    public Bill (int itemPrice) {
        this.itemPrice = itemPrice ;
    }
    void display ( ) {
        int itemPrice = 20 ;
        System.out.println (itemPrice) ;
    }
}
/*class Demo {
    public static void main(String [ ] args) {
        Bill billobj = new Bill (10) ;
        System.out.println(billobj.itemPrice) ;
        billobj.display ( ) ;
    }
}*/
public class Demo
{
    public static void main ( String [ ] args)
    {
        List<String> list = new ArrayList<>( ) ;
        list.add ("I");
        list.add ("Love");
        list.add("Java") ;
        Iterator<String> iter = list.iterator ( );
        while (iter.hasNext ( ) )
            System.out.print ( iter.next ( ) .toString ( ) + " ");
        System.out.println ( );
    }
}
/*
* class exception_handling
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
    }*/