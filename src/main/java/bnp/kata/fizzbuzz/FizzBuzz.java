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

		String fizzBuzzOutput="";

		fizzBuzzOutput+=(fizzBuzzInput%3 == 0)?fizz:"";

		fizzBuzzOutput+=(fizzBuzzInput%5 == 0)?buzz:"";

		return fizzBuzzOutput.isEmpty()?String.valueOf(fizzBuzzInput):fizzBuzzOutput;

	}

	public static void main (String args[]){

		FizzBuzz fizzBuzz=new FizzBuzz();

		for (int counter=1;counter<=100;counter++)
		{
			System.out.println("FizzBuzz conversion for "+counter+":"+fizzBuzz.convertFizzBuzz(counter));
		}
	}
}


