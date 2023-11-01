package com.tnsstu.DemoforTaxCalculation;

import java.util.Scanner;

public class MainOutputForCal {

    public static void main(String[] args) {
		
        //to accept user input
        Scanner sc=new Scanner(System.in);
		String name,gender;
		int age,income;

		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Gender: ");
		gender=sc.next();
		System.out.println("Enter Age: ");
		age=sc.nextInt();
		System.out.println("Enter Income: ");
		income=sc.nextInt();
		
		PersonDetail person1=new PersonDetail(name,age,gender,income);
	
		System.out.println(person1);
		
		TaxCalculation tax1=new TaxCalculation();
		tax1.calculateTax(person1);

		System.out.println(person1);
		
		sc.close();
		

	}
    
}
