
public class LargestPrimeFactor {
	public static void main(String[] args){
		
		long num = 600851475143L;
		
		System.out.println(num + " has " + getFactor(num) + " prime factors");
		
		/*
		for(int i = 34; i < 45; i++){
			System.out.println(i + " :" + isPrime(i));
		}
		*/
	}
	
	public static int getFactor(long num){
		int count;
		int max;
		
		count = 0;
		max = 0;
		for(int i = 2; i < Math.sqrt(num); i++){
			if(num % i == 0){
				if(isPrime(i)){
					if(i > max){
						max = i;
					}
					System.out.println(i + " is a prime factor of " + num);
					count++;
				}
			}
		}
		
		System.out.println("The max prime factor of " + num + " is " + max);
		return count;
	}
	
	public static boolean isPrime(int num){
		int count;
		
		count = 0;
		for(int i = 2; i < Math.sqrt(num); i++){
			if(num % i == 0){
				count++;
			}
		}
		
		if(count < 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * isEven method will determine if a given number is even or odd
	 * @param num - the number to check
	 * @return - true if even, otherwise false
	 */
	public static boolean isEven(int num){
		return (num % 2 == 0);
	}

}
