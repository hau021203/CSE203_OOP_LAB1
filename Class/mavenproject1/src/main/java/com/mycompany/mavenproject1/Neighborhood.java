package com.mycompany.mavenproject1;
import java.util.*;
public class Neighborhood {
    public static void main(String[] args) {
        Neighborhood nei = new Neighborhood();        
        nei.InputNeighborhood();
        nei.OutputNeighborhood();
        
        
    }
    ArrayList<Household> house = new ArrayList<Household>();
    Neighborhood(){
        
    }
    void InputNeighborhood(){
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of family members: ");
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            Household p = new Household();
            p.InputHousehold();
            house.add(p);}
    }
    void OutputNeighborhood(){
         for(int i =0;i<house.size();i++){
            house.get(i).OutputHousehold();
         } 
    }
}
