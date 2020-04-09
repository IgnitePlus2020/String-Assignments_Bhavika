package com.tgt.igniteplus;
import java.util.*;
public class RemoveOccurrance {
    public static void main( String [] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter a String. ");
        String str1 = in.nextLine();
        System.out.println("Enter  character to be removed ");
        char c = in.next().charAt(0);
        int j;

        char []charArrayOfString = str1.toCharArray();
        char []result = new char[str1.length()];
        for (int i = j = 0; i < str1.length(); i++)
        {
            if (charArrayOfString[i] != c)
                result[j++] = charArrayOfString[i];
        }
        System.out.println(result);
    }


}

