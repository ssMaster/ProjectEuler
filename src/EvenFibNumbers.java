
public class EvenFibNumbers {	
	public static void main(String[]args){
		int total = 0;
		
		int i = 0;
		while(fib(i) < 4000000){
			if((fib(i) % 2) == 0){
				System.out.println(fib(i));
				total += fib(i);
			}
			i++;
		}
		System.out.println("And the total is: " + total);
	}
	
	public static int fib(int num){
		if(num < 2){
			return 1;
		}
		else{
			return fib(num-1) + fib(num - 2);
		}
	}
	
	
	public static boolean isEven(int num){
		return (num % 2 == 0);
	}

}
