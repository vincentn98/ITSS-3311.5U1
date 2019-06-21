import java.util.Scanner;
public class Project1 {
	//Vincent Nguyen
	//ITSS 3311.5U1
	//Using investmentAmount=8000, annualInterestRate=0.035, numberOfYears=10,
	//the futureInvestmentValue, i.e. the accumulated value,
	//is approximately 11346.758578295065. 
	public static void main(String[] args) {
		//Importing Scanner class to read the three input variables
		Scanner input = new Scanner (System.in);
		//Entering Variables	
		System.out.println("Enter investment amount.");
		double investmentAmount = input.nextDouble();
		System.out.println("Enter annual interest rate (in percentage points).");
		double annualInterestRate = input.nextDouble();
		System.out.println("Enter number of years.");
		final int numberOfYears = input.nextInt();
		
		//Compute numberOfMonths
		int numberOfMonths = numberOfYears*12;
		//Compute monthlyInterestRate
		double monthlyInterestRate = annualInterestRate/12;
		//Compute futureInvestmentValue
		double futureInvestmentValue = investmentAmount*Math.pow(1+monthlyInterestRate,numberOfMonths);

		//Display Results
		System.out.println("Accumulated value is "+futureInvestmentValue);
		
		input.close();
	}

}
