package com.tnsstu.controlstatements;

public class SwitchDemo {

    public static void main(String[] args) {

		int var = 123;
		switch (var) 
		{
		case 'L' : 
			System.out.println(var+" is a Letter");
			break;

		case 123 :
		    System.out.println(var+" is a Digit");
			break;

		case 'w':	
			System.out.println(var+" is White Space");
			break;

		case 's':
		case 12 :
			System.out.println(var+" is Special Symbol");
            
		default:
			System.out.println(var+" is other than letter, digit, space or special symbol ");
			break;
		}
	
	}
    
}
