/*
Author:Miriah Thompson
Date:11/1/18
*/

import java.util.Scanner;
class Exercise_3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b,c,d,e,f,x,y = 0.0;
		System.out.print("Enter A: ");
		a = input.nextDouble();
			
			System.out.print("Enter B: ");
		b = input.nextDouble();
		
		System.out.print("Enter C: ");
		c = input.nextDouble();
			
			System.out.print("Enter D: ");
		d = input.nextDouble();
		
		System.out.print("Enter E: ");
		e = input.nextDouble();
		
		System.out.print("Enter F: ");
		f = input.nextDouble();
		
		x = ((e * d) - (b * f))	/ ((a * d) - (b * c));	
		System.out.println(x);
		
		y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		System.out.println(y);
		
	}
}