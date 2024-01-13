
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class Household {
    //thuoc tinh
    String houseNumer;
    ArrayList<Person> memberOfFamily = new ArrayList<Person>();
    Household(){
        
    }
    void InputHousehold(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of family members: ");
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            Person p = new Person();
            p.InputPerson();
            memberOfFamily.add(p);
        }
        
    }
    void OutputHousehold(){
        for(int i =0;i<memberOfFamily.size();i++){
            memberOfFamily.get(i).OutputPerson();
        }
    }
    int CountOver60(){
        int count =0;
        for(int i =0;i<memberOfFamily.size();i++){
            if(memberOfFamily.get(i).GetAge()>60)
                count ++;
            
        }
        return count;
    }
       
    
}
