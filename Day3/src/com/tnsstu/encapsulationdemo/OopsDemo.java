package com.tnsstu.encapsulationdemo;

public class OopsDemo {

    //declaration of data members-private
	private int serialNo;
	private String Name;
	private int age;
    private String City;

    //getters and setters
    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    } 

    //Object class method
    @Override
    public String toString() {
        return "OopsDemo [serialNo=" + serialNo + ", Name=" + Name + ", age=" + age + ", City=" + City + "]";
    }
  
}
