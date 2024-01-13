package com.mycompany.lab1;
import java.util.*;
public class Bai6c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();
        String a;
        String c = "";
        for(int i =0;i<=n;i++){
            a = sc.nextLine();
            c = c.concat(" "+a);
        }
        System.out.print(c);
    }
}
