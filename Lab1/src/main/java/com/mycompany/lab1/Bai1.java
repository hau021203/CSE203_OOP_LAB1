package com.mycompany.lab1;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastDigit = n%10;
        int firstDigit=n;
        while( firstDigit > 10 ){
            firstDigit = firstDigit / 10;
        }
        int sum = lastDigit+firstDigit;
        System.out.println(sum);
    
    }
}
