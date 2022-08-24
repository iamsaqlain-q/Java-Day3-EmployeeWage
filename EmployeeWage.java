package com.bl.day3;

import java.util.Random;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		//UC4-Solving using Switch Case Statement
		Random empCheck = new Random();
	    int n = empCheck.nextInt(2);
		int workingHrs;

		
		
 switch ((int)(n)) {
		
  case 0 :
		workingHrs = 8;
		System.out.println("Employee is working Part Time");
		System.out.println("Working hours of Employee is --> " + workingHrs);
	
        break;
		
  case 1 :
			workingHrs = 8;
			System.out.println("Employee is working Full Time");
			System.out.println("Working hours of Employee is --> " + workingHrs);
			break;
			
		
		default :
			workingHrs = 0;
			break;
		
		}
		
		
		
	}
}
