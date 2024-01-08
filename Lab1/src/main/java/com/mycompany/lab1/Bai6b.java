package com.mycompany.lab1;
import java.util.*;
public class Bai6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 1;        
        for(int i =0;i<a.length()-1;i++){
            if(a.substring(i,i+1).equals(" ")){
                count++;
            }
        }
        System.out.print(count);
    }
}
