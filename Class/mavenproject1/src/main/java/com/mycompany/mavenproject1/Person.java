package com.mycompany.mavenproject1;
import java.util.*;
public class Person {
    Scanner sc = new Scanner(System.in);
    //Thuộc tính
    String firstName;
    String lastName;
    int age;
    String occupation;
    String identityCardNumber;
    //Phương thức
    //1. Khởi tạo
    Person(){
        
    }
    Person(String firstName,String lastName,int age,String occupation,String identityCardNumber ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age= age;
        this.occupation = occupation;
        this.identityCardNumber = identityCardNumber;
    }
    //2.Các phương thức khác
    void InputPerson(){
        Scanner obj = new Scanner(System.in);
        System.out.print("first name: ");
        firstName = obj.nextLine();
        System.out.print("last name: ");
        lastName = obj.nextLine();
        System.out.print("Age: ");
        age = obj.nextInt();
        
        
    }
    void OutputPerson(){
        System.out.println(" first name: " +firstName+" last name: "+lastName+" Age: "+age);
    } 
    int GetAge(){
        return age;
    }
}
