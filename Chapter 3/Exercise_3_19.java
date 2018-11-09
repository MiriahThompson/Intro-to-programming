/*Author: Miriah Thompson
Date: 11/9/18

*/
import java.util.Scanner;
class Exercise_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sideA = 0.0;
		double sideB = 0.0;
		double sideC = 0.0;
		System.out.print("Enter Side A: ");
		sideA = input.nextDouble();
		System.out.print("Enter Side B: ");
		sideB = input.nextDouble();
		System.out.print("Enter Side C: ");
		sideC = input.nextDouble();
		if(sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB){
			System.out.print(sideA + sideB + sideC);
			
		}
		else {
			System.out.print("Error, not valid");
		}
	}
}