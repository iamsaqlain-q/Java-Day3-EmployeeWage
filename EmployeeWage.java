package com.bl.day3;

import java.util.Random;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		//UC5-Calculating Wages for a Month
		Random empCheck = new Random();
	    int n = empCheck.nextInt(2);
	    int workingHrs;
		int dailyWage;
		int empRatePerHr = 20;
		int isFullTime;
		int isPartTime;
		int monthlyWage;
		int workingDays = 20;


		
		
 switch ((int)(n)) {
		
  case 0 :
		workingHrs = 8;
		dailyWage = empRatePerHr * workingHrs;
		monthlyWage = dailyWage * workingDays;
		System.out.println("Employee is working Part Time");
		System.out.println("Monthly wage of Employee is --> $" + monthlyWage);
	
        break;
		
  case 1 :
			workingHrs = 8;
			dailyWage = empRatePerHr * workingHrs;
			monthlyWage = dailyWage * workingDays;
			System.out.println("Employee is working Full Time");
			System.out.println("Monthly wage of Employee is --> $" + monthlyWage);
			break;
			
		
		default :
			workingHrs = 0;
			break;
		
		}
		
		
		
	}
}
