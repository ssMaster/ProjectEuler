
// Problem #5 on Project Euler

/*
 * Expected Results:
 * 
 * From 1-10 = 2520
 * From 1-20 = 232792560
 */

public class SmallestMultiple {
	public static void main(String[] args){
		
		int smallest = getSmallestMultiple();
		
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: " + smallest);
		
	}
	
	public static int getSmallestMultiple(){
		int n = 1;
		boolean flag = false;
		
		while(true){
			for(int i = 1; i <= 20; i++){
				if(n % i != 0){
					n++;
					flag = false;
					break;
				}
				else{
					flag = true;
				}
			}
			
			if(flag){
				break;
			}
			
		}
		return n;
	}

}
