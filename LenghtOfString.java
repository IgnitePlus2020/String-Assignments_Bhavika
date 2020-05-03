package com.tgt.igniteplus;
import java.util.*;
public class LenghtOfString {
    public static void main(String args[])
    {
      
        String str;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        str = in.nextLine();

      
        int n = str.length();

        System.out.println("Length of the string = " +n);
    }

}
