package com.mycompany.lab1;
import java.util.*;
public class Bai5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
            numbers.add(sc.nextInt());        
        System.out.print(numbers);    
        System.out.print("insert :");  
        int b = sc.nextInt();
        System.out.print("position :");  
        int c = sc.nextInt();
        numbers.remove(n-1);  
        numbers.add(c,b);              
        System.out.println(numbers);
    }
}
