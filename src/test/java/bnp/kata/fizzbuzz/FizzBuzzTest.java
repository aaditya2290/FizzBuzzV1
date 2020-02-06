package bnp.kata.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest  {

	FizzBuzz game;

	@Before
	public void initializeFizzBuzz(){

		game = new FizzBuzz();
	}

	@Test
	public void shouldAllowToAccessInstanceOfFizzBuzz(){

		assertNotNull(game);
	}

	@Test
	public void fizzBuzzConverterShouldReturn1ForInput1(){

		assertEquals(1,game.convertFizzBuzz(1));
	}

	@Test
	public void fizzBuzzConverterShouldReturn2ForInput2(){

		assertEquals(2,game.convertFizzBuzz(2));
	}

}
