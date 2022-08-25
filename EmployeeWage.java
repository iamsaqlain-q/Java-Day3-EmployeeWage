package com.bl.day3;

import java.util.Random;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		int workingHrs, dailyWage;
		int empRatePerHr = 20;
		int monthlyWage;
		int workingDays = 20;
		
      //Master-Branch
	  System.out.println("Welcome to Employee Wage Computation Program :)");
				
	  //UC-1-Check Employee is Present or Absent
	  Random empCheck = new Random();
      int n = empCheck.nextInt(2);
	  if (n == 1)
			System.out.println("Employee is Present");
		     else
				System.out.println("Employee is Absent");
				        
	//UC2-Calculate Daily Employee Wage
			workingHrs = 8;
			dailyWage = workingHrs * 20 ;
			System.out.println("Daily wage of employee is --> $" + dailyWage );

	//UC3-Add Part time Employee & Wage
			workingHrs = 8;
			dailyWage = workingHrs * 20 ;
			System.out.println("Part time wage of employee is --> $" + dailyWage );
			
   //UC4-Solving using Switch Case Statement
 switch ((int)(n)) {
		
  case 0 :
		workingHrs = 8;
		dailyWage = empRatePerHr * workingHrs;
		monthlyWage = dailyWage * workingDays;
		System.out.println("Employee is working Part Time");
		System.out.println("Daily wage of employee is --> $" + dailyWage );
	    break;
		
  case 1 :
			workingHrs = 8;
			dailyWage = empRatePerHr * workingHrs;
			monthlyWage = dailyWage * workingDays;
			System.out.println("Employee is working Full Time");
			System.out.println("Daily wage of employee is --> $" + dailyWage );

			//UC5-Calculating Wages for a Month
			System.out.println("Monthly wage of Employee is --> $" + monthlyWage);
			break;
			
//UC6-Calculating Wages for a Month till a condition of total working hours or days is reached for a month	
  case 2 :
	   workingHrs = 100;
	   monthlyWage = workingHrs * workingDays;
	   System.out.println("Monthly wage for 100 Hrs & 20 Days  --> $" + monthlyWage);
		
		default :
			workingHrs = 0;
			break;
		
		}
		
		
		
	}
}
