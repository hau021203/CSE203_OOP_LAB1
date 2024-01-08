package com.mycompany.lab1;
import java.util.*;
public class Bai5d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();        
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
            numbers.add(sc.nextInt());    
        System.out.println(numbers);
        for(int i = 0;i < numbers.size();i++){
            for(int j = i + 1;j < numbers.size();j++){
                if(numbers.get(i) == numbers.get(j)){
                    numbers.remove(j);
                }                               
            }          
        }        
        System.out.print(numbers);
    }
}
