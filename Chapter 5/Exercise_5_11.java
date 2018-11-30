/* 
Author: Miriah Thompson
date:11/13/18
*/
import java.util.Scanner;
class Exercise_5_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int run = 100;
		int count = 0;
		while (run <=200){
			if (run %5 == 0 ^ run %6 == 0){
				System.out.print(run + " ");
				count++;
				
			}
			
			if (count == 10){
				System.out.println();
				count = 0;
			}
			run++;
		}
	}
}