package com.tgt.igniteplus;
import java.util.*;
public class RemoveHyphen { 
    public static void main(String[] args) {
    
     Scanner in = new Scanner(System.in);
   
     System.out.println("Enter the string: ");
    
     String str;
     str = in.nextLine();
    
     char array[]=str.toCharArray();
   
     char temp[]=new char[str.length()];
   
        int j = 0;
   
        for (int i = 0; i <str.length() ; i++) {
       
            if (array[i] == '-' && Character.isDigit(array[i - 1]) && Character.isDigit(array[i + 1])) ;
       
            else
           
                temp[j++] = array[i];
   
       }
    System.out.println(temp);

}

}
