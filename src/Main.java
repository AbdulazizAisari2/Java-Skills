public class Main {
	public static void main(String[] args){
		
		UserInfo user1 = new UserInfo ("Abdulaziz",21,"Abdulazizaisari06@gmail.com", true);
		UserInfo user2 = new UserInfo ("Mohammed",26,"Aisari1314@gmail.com", false);
		UserInfo user3 = new UserInfo ("Ahmed",24,"AhmedAisari@gmail.com", false);

		user1.displayInfo();
		user2.displayInfo();
		user3.displayInfo();
		
	double pay = PayrollCalculator.calculateWeeklyPay("PART_TIME", 25, 25);
	System.out.println("Pay: $" + pay);
	}
	
}