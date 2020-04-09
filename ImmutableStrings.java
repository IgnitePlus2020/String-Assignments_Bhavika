package com.tgt.igniteplus;
import java.util.*;
public class ImmutableStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = in.nextLine();
        str1.concat("extension");
        System.out.println(str1);
    }
}
