/**
 * 
 */
package bnp.kata.fizzbuzz;

/**
 * @author G46362
 *
 */
public class FizzBuzz {

	private static final String fizz="Fizz";
	private static final String buzz="Buzz";

	public String convertFizzBuzz(int fizzBuzzInput) {
		// TODO Auto-generated method stub

		return (fizzBuzzInput%3 == 0)? fizz:(fizzBuzzInput%5 == 0)?buzz:String.valueOf(fizzBuzzInput);
	}

}
