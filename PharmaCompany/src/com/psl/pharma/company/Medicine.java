package com.psl.pharma.company;

public class Medicine {
	private String CompanyName = "Ranbaxy";
	private String CompanyAddress = "457, B.R. Ambedkar Road, Hyderabad, India";
	
	public void displayLabel() {
		System.out.println(this.CompanyName);
		System.out.println(this.CompanyAddress);
	}
}