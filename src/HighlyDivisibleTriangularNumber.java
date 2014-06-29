
/*
 * Problem 12 from Project Euler
 * 
 * What is the value of the first triangle number to have over five hundred divisors
 */
public class HighlyDivisibleTriangularNumber {
	public static void main(String[] args){
		
		triangleNumber(7); // display the 7th triangle number -- should be 28
		System.out.println();
		triangleNumber(10);	// list the first 10 terms -- should end at 55
		System.out.println();
		
		// ===============================
		
		/*
		factor(1);	// 1
		factor(3);	// 1, 3
		factor(6);  // 1, 2, 3, 6
		factor(28);	// 1, 2, 4, 7, 14, 28
		*/
		
		// ===============================
		
		/*
		int i = 1;
		while(factor(i) < 10){
			i++;
		}
		displayFactors(i);
		*/
		
		// ================================
		
		/*
		// This solution seems to work, but is very slow and so not an optimal solution
		int i = 500;
		while(factor(i) < 500){
			System.out.println(i);
			i++;
		}
		//displayFactors(i);
		*/
		
		// =================================
		
		// I need to write a method to store a list of primes in an array and use it to 
		// call the primeFactorization method
		
	}
	
	// ===============================================================
	
	public static int primeFactorization(int n, int[] primes){
		int divisors = 1;
		int exponent;
		int remainder = n;
		
		for(int i = 0; i < primes.length; i++){
			if(primes[i] * primes[i] > n){
				return divisors * 2;
			}
			
			exponent = 1;
			while(remainder % primes[i] == 0){
				exponent++;
				remainder /= primes[i];
			}
			divisors *= exponent;
			
			// if no remainder, return the number of divisors
			if(remainder == 1){
				return divisors;
			}
		}
		return divisors;
	}
	
	
	// ===============================================================
	
	public static int triangleNumber(int n){
		int sum = 0;
		
		for(int i = 1; i <= n; i++){
			sum += i;
			System.out.print(sum + " ");
		}
		
		return sum;
	}
	
	/**
	 * Find the factors of the triangle number 
	 * @param triangleNumber The triangle number to check for factors
	 */
	public static int factor(int triangleNumber){
		int count = 0;
		
		for(int i = 1; i <= triangleNumber; i++){
			if(triangleNumber % i == 0){	// factor
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * Display all the factors of num
	 * @param num
	 */
	public static void displayFactors(int num){
		int count = 0;
		
		System.out.print(num + ": ");
		
		for(int i = 1; i <= num; i++){
			if(num % i == 0){	// factor
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.print(" --  Number of factors: " + count);
		System.out.println();
	}

}
