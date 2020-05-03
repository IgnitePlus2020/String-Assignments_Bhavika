package com.tgt.igniteplus;
import java.util.*;
public class ComparingStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string");
             String str1 = in.nextLine();
        System.out.println("Enter the second string");
             String str2 = in.nextLine();
       
            if( str1.compareTo(str2) == 0) {
                System.out.println("The strings are equal");
            }
            else
                System.out.println(" The strings are not equal");

        }
    }


