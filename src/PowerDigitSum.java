
/*
 * Project Euler Problem #16 - Power Digit Sum
 * 
 * What is the sum of the digits of the number 2^1000?
 */
public class PowerDigitSum {
	public static void main(String[] args){
		System.out.println("The sum of the digits of 2^15 is: " + powerDigitSum(2, 15));
		System.out.println("The sum of the digits of 2^1000 is: " + powerDigitSum(2, 1000));
	}
	
	public static int powerDigitSum(int base, int power){
		int powerDigit = (int) Math.pow(base, power);
		
		return sumDigits(powerDigit);
	}
	
	public static int sumDigits(int num){
		int sum = 0;
		
		System.out.println(num);
		
		String strNum = String.valueOf(num);
		char[] list = strNum.toCharArray();
		
		for(int i = 0; i < list.length; i++){
			sum += (list[i] - 48);
		}
		
		return sum;
	}

}
