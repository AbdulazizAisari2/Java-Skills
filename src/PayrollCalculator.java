public class PayrollCalculator {
    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {
        if (hoursWorked < 0 || hourlyRate < 0) {
            System.out.println("Invalid input: Hourly rate or hours worked cannot be negative");
            return 0;
        }

        double totalPay = 0;
		
		switch (employeeType.toUpperCase()){
			case "FULL_TIME":
			     if (hoursWorked <= 40) {
                    totalPay = hoursWorked * hourlyRate;
                } else {
                    double overtime = hoursWorked - 40;
                    totalPay = (40 * hourlyRate) + (overtime * hourlyRate * 1.5);
                }
                break; 

			case "PART_TIME":
				if (hoursWorked >=0 && hoursWorked <=25){
					totalPay = hoursWorked * hourlyRate;
				}
				else {
					System.out.println("Invalid! PART_TIME Hours must be between 0 and 25");
					return 0;
				}
			break;
		
			case "CONTRACTOR":
				totalPay = 200;
				break;
				
			case "INTERN":
				if (hoursWorked >=0 && hoursWorked <=20){
					totalPay = (hourlyRate * 0.8) * hoursWorked;
				}
				else{
				System.out.println("Invalid! INTERN Hours must be between 0 and 20");
				return 0;
				}
				break;
			
		}
        return totalPay;
	
	
	}
}
