package com.tnsstu.DemoforTaxCalculation;

public class TaxCalculation {

    public void calculateTax(PersonDetail person)
	{
		if(person.getGender().equalsIgnoreCase("female")|| person.getAge()>65)
		{
			person.setTax(0);
			System.out.println("No tax");
		}
		else
		{
			if(person.getIncome()<180000)
			{
				person.setTax(0);
				System.out.println("No tax for Male");
			}
			else if(person.getIncome()>180000 && person.getIncome()<=500000)
			{
				person.setTax((person.getIncome()-180000)*10/100);
				
			}else if(person.getIncome()>500000 && person.getIncome()<=900000)
			{
				person.setTax((person.getIncome()-180000)*13/100+30000);
				
			}else if(person.getIncome()>900000)
			{
				person.setTax((person.getIncome()-180000)*25/100+54000);
				
			}
		}
	}
    
}
