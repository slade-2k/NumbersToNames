package main;

import java.util.Scanner;

public class NumbersToNames {
	
	public enum Months {
		Januar, Februar, März, April, Mai, Juni, Juli, August, September, Oktober, November, Dezember
	}
	
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		String inputString;
		Months month;
		
		System.out.println("Please enter the number of the month: ");
		inputString = scanner.nextLine();
		
		try {
			inputNumber = Integer.parseInt(inputString);
		} catch(Exception e) {
			inputNumber = 0;
		};				
		scanner.close();
		
		switch(inputNumber) {
		
		case 1: 
			month = Months.Januar;
		break;
		
		case 2:
			month = Months.Februar;
		break;
		
		case 3:
			month = Months.März;
		break;
		
		case 4:
			month = Months.April;
		break;

		case 5:
			month = Months.Mai;
		break;

		case 6:
			month = Months.Juni;
		break;

		case 7:
			month = Months.Juli;
		break;

		case 8:
			month = Months.August;
		break;

		case 9:
			month = Months.September;
		break;

		case 10:
			month = Months.Oktober;
		break;

		case 11:
			month = Months.November;
		break;

		case 12:
			month = Months.Dezember;
		break;
		
		default:
			month = null;
		}
		if(month != null) {
			System.out.println("The name of the month is " + month);			
		} else {
			System.out.println("Bad input string");
		}
		
	}
	
}
