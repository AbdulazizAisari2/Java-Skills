public class Main {
	public static void main(String[] args){
<<<<<<< HEAD
	double gross = PayrollCalculator.calculateWeeklyPay("FULL_TIME", 45, 20);
	double tax = PayrollCalculator.calculateTaxDeduction(gross, true);
	System.out.println("Gross Pay: $" + gross);
	System.out.println("Tax Deducted: $" + tax);
	System.out.println("Net Pay: $" + (gross - tax));

=======
		
		UserInfo user1 = new UserInfo ("Abdulaziz",21,"Abdulazizaisari06@gmail.com", true);
		UserInfo user2 = new UserInfo ("Mohammed",26,"Aisari1314@gmail.com", false);
		UserInfo user3 = new UserInfo ("Alaa",24,"AhmedAisari@gmail.com", false);

		user1.displayInfo();
		user2.displayInfo();
		user3.displayInfo();
		
>>>>>>> UserInfo
	}
	
}