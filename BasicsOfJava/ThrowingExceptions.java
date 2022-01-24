package BasicsOfJava;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.*;
import java.lang.*;
import java.io.*;
public class ThrowingExceptions{
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static void testMethod() throws Exception {
        String test = null;
        test.toString();
    }
    public static void main(String[] args) throws IOException,Exception{
        int n=Integer.parseInt(br.readLine());
        throw new Exception("I am a new Exception");

    }
}