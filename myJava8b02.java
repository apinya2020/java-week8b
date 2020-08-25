package week8b;

public class myJava8b02 {
	public static void main(String[]arg) {
		//Adding Parameters to Methods
		double hours = 25;
		double yourHoursWorked = 37.5;
		final double STD_RATE = 13.75;
		System.out.println("Adding Parameters to Methods");
		System.out.println("==========");
		calculateGross(12,10);//loop 1
		calculateGross(hours,STD_RATE);//loop 2
		calculateGross(yourHoursWorked,15);//loop3
	}
	//create methods that return values
	public static void calculateGross(double hours, double rate) {
		System.out.println("calculateGross");
		//final double STD_RATE = 13.75;
		double gross;
		gross = hours*rate;
		System.out.println(hours+" hours at $"+rate
		+ " per hour is $"+gross);
	}
}
