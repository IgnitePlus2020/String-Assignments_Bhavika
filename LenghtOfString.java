package com.tgt.igniteplus;
import java.util.*;
public class LenghtOfString {
    public static void main(String args[])
    {
        int i = 0;
        String str;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        str = in.nextLine();

        char ch [] = str.toCharArray();
        int n = ch.length;

        System.out.println("Length of the string = " +n);
    }

}
