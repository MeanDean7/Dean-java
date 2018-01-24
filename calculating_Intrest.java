import java.util.Scanner;

package banking;

public class calculating_Intrest {
		
	public static void main(String[], args){
		Scanner input = new Scanner(System.in);
		// Interest = (principal * rate) / time
		int time= 0;
		double interest=0.0, principal=0.0;
		
		System.out.println("Enter the amount of money you wish to contribute: ");
		principal = input.nextInt();
		
		
		System.out.println("Enter the rate of interest you will to obtain: ");
		rate = input.nextInt();
		
		
		System.out.println("Enter the amount of time you wish to invest for: ");
		time = input.nextInt();
		
		interest = (principal*rate)/time;
		System.out.println("Interest earned is: " + (principal*rate)/time );
		
	}

}
