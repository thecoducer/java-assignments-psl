package com.psl.pharma.company.test;

import java.util.Random;

import com.psl.pharma.company.Medicine;
import com.psl.pharma.company.Ointment;
import com.psl.pharma.company.Syrup;
import com.psl.pharma.company.Tablet;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] medicines = new Medicine[10];
		Random random = new Random();
		
		for(int i=0;i<10;i++) {
			int type = random.nextInt(3) + 1;
			
			switch(type) {
			case 1:
				medicines[i] = new Tablet();
				break;
				
			case 2:
				medicines[i] = new Syrup();
				break;
				
			case 3:
				medicines[i] = new Ointment();
				break;
			}
		}
		
		for(Medicine m : medicines) {
			m.displayLabel();
			System.out.println();
		}
		
				
		
	}

}
