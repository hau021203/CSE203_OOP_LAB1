package com.mycompany.lab1;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[3];
        for(int i =0;i<n.length;i++)
            n[i] = sc.nextInt();              
        int min = n[0];
        for(int i =0;i<n.length;i++)          
            min = Math.min(min,n[i]);        
        System.out.print(min);
    }
}
