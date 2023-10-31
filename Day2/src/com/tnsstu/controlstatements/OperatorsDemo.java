
//Program to demonstrate  different operators(ternary,arithmetic,pre/post incrementation/decrementation)
package com.tnsstu.controlstatements;

public class OperatorsDemo {

    public static void main(String args[]) {
		int a = 15;
		int b = 5;
		int c = 20;
		System.out.println("a, b and c value before the operations: " + a + " " + b + " " + c);

		++a; // Pre Increment    //16
		int y = ++a + b + a--;   //17+5+17  a=16  17+5+17=39
		System.out.println("y value after the operations: " + y); 

		int z = y++ + a + b--;   //39+16+5  y=40 b=4   40+16+4=60
		System.out.println("z value after the operations: " + z);

		System.out.println("a, b, c, y any z values after the operations: " + a + " " + b + " " + c + " " + y + " " + z);

		// Ternary operator demonstration

		c = (20 == c) ? 1 : 0;
		System.out.println(c);

	}
    
}
