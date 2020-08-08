import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorCalc {
	private static int firstNum = 0;
	private static int secondNum = 0; 
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Enter first positive number: ");
				firstNum = scan.nextInt();
			System.out.print("Enter second positive number: ");
				secondNum = scan.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Not an integer.");
		}
		
		System.out.println("The gcd of " + firstNum + " and " + secondNum + " is " + gcd(firstNum,secondNum));
	}
	public static int gcd(int num1, int num2){
		if(num2 <= num1 && num1 % num2 == 0)
			return num2;
		else if (num1 < num2)
			return gcd(num2,num1);
		else 
			return gcd(num2, num1 % num2); 
	}
}