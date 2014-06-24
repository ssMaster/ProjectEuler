
import java.util.Scanner;

public class Multiplesof3and5 {
	public static void main(String[] args){
		int index,	// the current number to test
			bound,	// the last number to check in the loop
			sum;	// the sum of all the numbers that are multiples 
		
		//System.out.println("What bound do you wish to check?");
		bound = 1000;
		
		index = 0;
		sum = 0;
		while(index < bound){
			if((index % 3 == 0) || (index % 5 == 0)){
				System.out.println("index: " + index + ", sum: " + sum);
				sum += index;
			}
			index++;
		}
		
		System.out.println();
		System.out.println("The sum of all numbers below " + bound + " that are multiples of 3 or 5 is: " + sum);
	}
	
	public static boolean isEven(int num){
		return (num % 2 == 0);
	}

}
