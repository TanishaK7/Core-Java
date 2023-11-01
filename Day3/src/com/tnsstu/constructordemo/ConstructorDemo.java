package com.tnsstu.constructordemo;

import java.util.Scanner;

public class ConstructorDemo {

    public static void main(String[] args) {
		Customer cust1 = new Customer();    //default
		System.out.println(cust1);
		
		Customer cust2 = new Customer("Tanisha",20,87539742,"Mumbai");   //Parameterized
		System.out.println(cust2);
		
		try (//scanner class to accept user input
		Scanner sc = new Scanner(System.in)) {
			String name;
			int id;
			float phone;
			String city;
			
			System.out.println("Enter name: ");
			name=sc.next();
			System.out.println("Enter id: ");
			id=sc.nextInt(); //id
			System.out.println("Enter Phone no: ");
			phone=sc.nextInt(); 
			System.out.println("Enter city: ");
			city=sc.next(); 

			
			Customer cust3=new Customer(name,id,phone,city);
			System.out.println(cust3);
   
			Customer cust4=new Customer();
			cust4.setCustomerName(name);
			cust4.setCustomerId(id);
			cust4.setCustomerPh(phone);
			cust4.setCustomerCity(city);
			
			System.out.println(cust4);
		}
	    
    }
    
}
