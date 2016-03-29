import java.text.NumberFormat;
import java.util.Scanner;

public class LoanCalc {
/*
 * Welcome to the Loan Calculator 
DATA ENTRY 
Enter loan amount: ten 
Error! Invalid decimal. Try again. 
Enter loan amount: -1 
Error! Number must be greater than 0.0 
Enter loan amount: 100000000000 
Error! Number must be less than 1000000.0 
Enter loan amount: 500000 
Enter yearly interest rate: 5.6 
Enter number of years: thirty 
Error! Invalid integer value. Try again. 
Enter number of years: -1 
Error! Number must be greater than 0 
Enter number of years: 100 
Error! Number must be less than 100 
Enter number of years: 30 
FORMATTED RESULTS 
Loan amount: $500,000.00 
Yearly interest rate: 5.6% 
Number of years: 30 
Monthly payment: $2,870.39 
Continue? (y/n): 
Error! This entry is required. Try again. 
Continue? (y/n): x 
Error! Entry must be 'y' or 'n'. Try again. 
Continue? (y/n): n

 * 
 * 
	*/
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Loan Calculator");
		System.out.println();
		System.out.println("DATA ENTRY");
		System.out.println();
		
		
		Scanner userInput = new Scanner(System.in);
		String choice = "y";
		//loop/enter loan amount
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter loan amount: ");
			double enterLoanAmount = 0;
					enterLoanAmount = Double.parseDouble(userInput.nextLine());
			
	//		try {
	//			String line = userInput.nextLine();
	//			enterLoanAmount = Double.parseDouble(line);
	//		}
	//		catch (NumberFormatException e) 
	//		{
	//			System.out.println("Error! Invalid number. Try again.\n");
		//	}
			if (enterLoanAmount <0){
				System.out.println("Error! Invalid number. Try again.\n");
			}
			if (enterLoanAmount > 1000000){
				System.out.println("Error! Number must be less than 1000000.0");
			}
				
			

		//Yearly interest rate
			double yearlyInterestRate = 0;
			NumberFormat percent = NumberFormat.getPercentInstance();
			String interestRate = percent.format(yearlyInterestRate);
			interestRate = (userInput.nextLine());
		System.out.println(interestRate);
		}
			System.out.print("Continue? (y/n): ");
			choice = userInput.nextLine();
			
	}

}
