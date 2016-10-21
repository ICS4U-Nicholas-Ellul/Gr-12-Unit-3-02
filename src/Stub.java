/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Oct 2016
 * This program uses recursion to calculate factorials;
 ****************************************************************************/

import java.util.Scanner;

public class Stub {
	
	public static int calculateFactorial(int factValue){
		//Calculate Factorial Recursively
		
		if(factValue > 0){
			
			int factoralTotal = factValue * calculateFactorial(factValue - 1);
			return factoralTotal;
			
		}
		
	return 1;	
		
	}
	
	public static int checkForInt(String message){
		// gets the user to input an integer
		// continues to ask until a valid input is given
		
		@SuppressWarnings("resource")
		
		// input
		Scanner methodReader = new Scanner(System.in);
		
		boolean valid = false;
		int userInput = 0;
		
		// process
		while(valid == false){
			try {
				
				System.out.println(message);
				userInput = Integer.parseInt(methodReader.nextLine());
				valid = true;
			
			} 
			
			catch (NumberFormatException e) {
				
				System.err.println("Invalid input. Please enter integer.");
		    
			}
		}
		
		// output
		return userInput;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		

		
		//check for valid input
		int userNumber = checkForInt("What number do you want to calculate the factorial of?");
	
		//calculate factorial
		System.out.println(calculateFactorial(userNumber));
	}
	
}
