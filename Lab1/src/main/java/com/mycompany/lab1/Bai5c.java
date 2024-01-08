package com.mycompany.lab1;
import java.util.*;
public class Bai5c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> duplicate = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
            numbers.add(sc.nextInt());    
        System.out.println(numbers);
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j++){
                if(numbers.get(i)==numbers.get(j))
                    if(duplicate.contains(numbers.get(i)))
                        break;
                    else
                        duplicate.add(numbers.get(i));            
            }           
        }
        System.out.print("duplicate values :");
        System.out.print(duplicate);
    }
}
