package com.mycompany.lab1;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>1){
            if(n%2==0){
                System.out.println(n+" is even, so we take n/2: "+n/2);
                n/=2;               
            }else{
                System.out.println(n+" is odd, so we take 3*n+1: "+(n*3+1));
                n =3*n+1; 
            }
        }
    }
}
