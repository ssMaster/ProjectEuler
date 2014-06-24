
public class Primes {
	public static void main(String[] args){
		final int LOWER_BOUND = 1,
				  HIGHER_BOUND = 7;
		
		int i, n, factors;
		double root;
		
		
		for(i = LOWER_BOUND; i <= HIGHER_BOUND; i++){
			factors = 1;
			root = Math.sqrt(i);
			for(n = 2; n <= root; n++){
				if(i % n == 0){
					factors = 0;
				}
			}
			
			if(factors == 1){
				if(i != 1){
					System.out.println(i);
				}
			}
		}
		
	}
	
	
}
