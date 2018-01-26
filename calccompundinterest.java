package CompundInterest;

public class calccompundinterest {

	public static void main(String[] args) {
		// A=P(1+R)^n//
		
		double amount;
		double principal = 5000;
		double rate = .05;
		//Amount after 40 years based on previous values//
		for(int year=1;year<=40;year++){
			amount=principal*Math.pow(1 + rate, year);
			System.out.println(year + "   " + amount);
		}
	}
}
