
package com.tnsstu.constructordemo;

public class Customer {
    // data members
    private String customerName;
	private int customerId;
	private float customerPh;
    private String customerCity;

    // default Constructor
	public Customer() {
		System.out.println("Default constructor");
    }    

    //Parameterized Constructor
	public Customer(String customerName, int customerId, float customerPh, String customerCity ) {
		this();             //to call default constructor
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerPh = customerPh;
        this.customerCity = customerCity;
    }

    //getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public float getCustomerPh() {
        return customerPh;
    }

    public void setCustomerPh(float customerPh) {
        this.customerPh = customerPh;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    //tostring object class
    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerPh=" + customerPh
                + ", customerCity=" + customerCity + "]";
    }
}
