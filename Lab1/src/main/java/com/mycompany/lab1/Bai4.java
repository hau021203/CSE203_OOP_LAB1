package com.mycompany.lab1;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            a[i]= sc.nextInt();
            if(a[i]%2==0)
                sum+=a[i];
        }
        System.out.print(sum);
    }
}
