
/*
 * Problem #8 - Largest Product In A Series
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 * 9 * 8 * 9 = 5832
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product? 
 */

public class LargestProductInASeries {
	
	public static void main(String[] args){
		/*
		// test
		String str = "123456789";
		int list[] = new int[9];
		for(int i = 0; i < 9; i++){
			list[i] = str.charAt(i) - 48;	// parses to an integer
			System.out.println("The num is: " + (list[i] + 10));
		}
		*/
		
		testA();
	}
	
	// Should yield a product of 1680
	public static void testA(){
		int[] list = new int[10];
		int max = 0;
		String s = "1458673654";	// the four adjacent digits in this 10-digit number with the largest product is 5 x 8 x 6 x 7
		
		for(int i = 0; i < 10; i++){
			list[i] = s.charAt(i) - 48;
		}
		for(int count = 0; count < 6; count++){
			int product = list[count] * list[count + 1] * list[count + 2] * list[count + 3];
			
			if(product > max){
				max = product;	// the new max is the current product
			}
		}
		System.out.println("The max product is: " + max);
	}
	
	public static void getLargestProductSeries(){
		int list[]  = new int[1000];
		int max = 0;
		String bigNum = "73167176531330624919225119674426574742355349194934" + 
						"96983520312774506326239578318016984801869478851843" + 
						"85861560789112949495459501737958331952853208805511" +
						"12540698747158523863050715693290963295227443043557" +
						"66896648950445244523161731856403098711121722383113" +
						"62229893423380308135336276614282806444486645238749" +
						"30358907296290491560440772390713810515859307960866" + 
						"70172427121883998797908792274921901699720888093776" +
						"65727333001053367881220235421809751254540594752243" +
						"52584907711670556013604839586446706324415722155397" +
						"53697817977846174064955149290862569321978468622482" +
						"83972241375657056057490261407972968652414535100474" +
						"82166370484403199890008895243450658541227588666881" +
						"16427171479924442928230863465674813919123162824586" +
						"17866458359124566529476545682848912883142607690042" +
						"24219022671055626321111109370544217506941658960408" +
						"07198403850962455444362981230987879927244284909188" +
						"84580156166097919133875499200524063689912560717606" +
						"05886116467109405077541002256983155200055935729725" +
						"71636269561882670428252483600823257530420752963450";
	}

}
