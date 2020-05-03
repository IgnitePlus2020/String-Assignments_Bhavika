package com.tgt.igniteplus;
import java.util.Scanner;
public class EmptyString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if(str.isEmpty())
        {
            System.out.println( " The string is empty");
        }
        else{
            System.out.println(str);
        }
    }
}
