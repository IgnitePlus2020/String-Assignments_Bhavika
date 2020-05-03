package com.tgt.igniteplus;
import java.util.*;
public class ContainOnlyDigits {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter a String. ");
        String str = in.nextLine();
        if(str.matches("[0-9]+")) {
            System.out.println("String contains only digits!");
        }
        else
            System.out.println("String contains both digits and characters.");
    }

}
