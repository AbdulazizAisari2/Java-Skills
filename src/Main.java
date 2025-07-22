public class Main {
	public static void main(String[] args){
	double gross = PayrollCalculator.calculateWeeklyPay("FULL_TIME", 45, 20);
	double tax = PayrollCalculator.calculateTaxDeduction(gross, true);
	System.out.println("Gross Pay: $" + gross);
	System.out.println("Tax Deducted: $" + tax);
	System.out.println("Net Pay: $" + (gross - tax));

	}
	
}