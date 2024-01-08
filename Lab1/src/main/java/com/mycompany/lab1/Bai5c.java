package com.mycompany.lab1;
import java.util.*;
public class Bai5c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(sc.nextInt());        
        System.out.print(numbers);    
        System.out.print("insert :");  
        int b = sc.nextInt();
        System.out.print("position :");  
        int c = sc.nextInt();
        numbers.remove(numbers.size());  
        numbers.add(c,b);              
        System.out.println(numbers);
    }
}
