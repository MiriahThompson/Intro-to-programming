/*
Author: Miriah Thompson
Date: 12/6/18

Checks to see if number is a palindrome
*/
import java.util.Scanner;

class Exercise_6_3 {
	
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		int num  = 0;
		int remain  = 0;
		int reverse = 0;
		
		// Prompt user
		System.out.print("Enter a number: ");
		user = input.nextInt();
		
		// Copy user to a mutable variable
		num = user;
		while (num != 0) {
			remain = num % 10;
			reverse = (reverse * 10) + remain;
			num /= 10;
		}
		
		if (user == reverse) {
			System.out.println(user + " is a palindrome");
		}
		else {
			System.out.println(user + " is not a palindrome");
		}
	}
}
