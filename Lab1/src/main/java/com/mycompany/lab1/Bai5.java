package com.mycompany.lab1;
import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
        numbers.add(sc.nextInt());
        }
        System.out.print(numbers);
        boolean flag = false;
        int b = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(numbers.get(i)==b){
                flag = true;
                numbers.remove(i);
                break;
            }                 
        }
        System.out.println(numbers);
        System.out.print(flag);
    }
}
