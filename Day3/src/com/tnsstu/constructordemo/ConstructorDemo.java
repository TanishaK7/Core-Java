package com.tnsstu.constructordemo;

import java.util.Scanner;

public class ConstructorDemo {
	public static void main(String[] args) {
		Customer cust1=new Customer(); 
		System.out.println(cust1);  //default will be called
		
		Customer cust2=new Customer("Tanisha",01,983368718,"mumbai");
		System.out.println(cust2);  //parameterized will be called
		
		//scanner class to accept user input
		Scanner sc=new Scanner(System.in);
		String name;
		int id;
		int phone;
	    String city;

		System.out.println("Enter name: ");
	    name=sc.next(); 
	    System.out.println("Enter id: ");
	    id=sc.nextInt(); 
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

		sc.close();
		
	}
	    
}
    

