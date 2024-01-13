package com.mycompany.lab1;
import java.util.*;
public class Bai6d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();         
        String replaceString = a.toLowerCase().replaceAll(" ", "");        
        int max = replaceString.length()-1;
        int count = 0;
        int str =  (int) Math.floor(replaceString.length()/2);      
        for(int i = 0 ; i < str ; i++){
            if(replaceString.charAt(i)==(replaceString.charAt(max-i))){
                count ++;                
            }
            else
                break;
        }
        if(count==str)
            System.out.print("This string is palindrome");
        else
            System.out.print("This string is not palindrome");
    }
}
