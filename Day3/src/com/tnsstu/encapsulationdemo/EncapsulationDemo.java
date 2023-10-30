package com.tnsstu.encapsulationdemo;

public class EncapsulationDemo {

    public static void main(String[] args) {
		OopsDemo oop=new OopsDemo();
		oop.setSerialNo(01);
		oop.setName("ARJUN");
		oop.setAge(20);
        oop.setCity("Mumbai");

        System.out.println(oop);


        OopsDemo oop1=new OopsDemo();
		oop1.setSerialNo(02);
		oop1.setName("SHRUTI");
		oop1.setAge(21);
        oop1.setCity("Navi-Mumbai");

        System.out.println(oop1);
        
    }
    
}
