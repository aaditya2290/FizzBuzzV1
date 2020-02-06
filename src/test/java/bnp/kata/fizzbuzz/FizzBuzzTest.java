package bnp.kata.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest  {
	
	@Test
	public void shouldAllowToAccessInstanceOfFizzBuzz(){
		FizzBuzz game = new FizzBuzz();
		assertNotNull(game);
	}
	

}
