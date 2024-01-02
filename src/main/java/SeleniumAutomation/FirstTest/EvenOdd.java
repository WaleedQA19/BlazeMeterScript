package SeleniumAutomation.FirstTest;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner (System.in);
		System.out.println("Enter your number");
		int number = Scan.nextInt();
		
		if 
		(number % 2 == 0)
		{
			System.out.println("The number is even");
			
		}
		else 
			System.out.println("The number is odd");
	}

}
