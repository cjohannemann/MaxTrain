import java.math.BigDecimal;
import java.util.Scanner;

public class CalculateInterestMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the interest calculator");
		System.out.println();
		
		Scanner userInput = new Scanner(System.in);
		
		BigDecimal loanAmount;
		BigDecimal interestAmount;
		String choice = "y";
		
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter loan amount: ");
			BigDecimal increment = new BigDecimal(userInput.nextLine());
			System.out.println("Enter interest amount: ");
			BigDecimal percent = new BigDecimal(userInput.nextLine());
			
			BigDecimal totalInterest = increment.multiply(percent);
			BigDecimal totalSum = totalInterest.add(increment);
			
			System.out.println(totalInterest);
			System.out.println(totalSum);
			
			
			
		}
		
		
		
		
		
		
		/*double loanAmount;
		double interestAmount = 0;
		double choice = 0;
		String decision = "y";

		while (decision.equalsIgnoreCase("y")) {
			
	
			// User input		
				System.out.println("Enter loan amount:     " );
				//loanAmount = userInput.nextInt();
				loanAmount = Double.parseDouble(userInput.nextLine());
				System.out.println("Enter interest rate:   " );
				interestAmount = Double.parseDouble(userInput.nextLine());
				//interestAmount = userInput.nextDouble();

				//double subtotal = choice;
		
			// calculating interest
				BigDecimal interestAmountApplied = new BigDecimal(loanAmount);
				BigDecimal discountPercent = new BigDecimal(interestAmount);
				BigDecimal totalInterest = multiply(interestAmount * loanAmount);
				//BigDecimal intrestLoan = add(totalInterest, interestAmountApplied);
				BigDecimal interesteLoan = totalInterest.add();
				
				
				
				
				//interestAmount *= .01;
			//	double totalInterest = ((loanAmount * interestAmount) + loanAmount);
				System.out.println();
				
				
			// display output
				System.out.println("Loan amout:        " + loanAmount);
				System.out.println("Interest amount:   " +interestAmount);
				System.out.println("Interest:          " +totalInterest);
				
		        System.out.print("Continue? (y/n): ");
		        decision = userInput.nextLine();
		        System.out.println();
				}
				userInput.close();
		System.out.println("Bye!");
	}
	*/
	}
}
