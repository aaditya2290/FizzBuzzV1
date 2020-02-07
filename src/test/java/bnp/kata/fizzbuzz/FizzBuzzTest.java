package bnp.kata.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest  {

	FizzBuzz game;
	private static final String fizz="Fizz";

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

		assertEquals("1",game.convertFizzBuzz(1));
	}

	@Test
	public void fizzBuzzConverterShouldReturn2ForInput2(){

		assertEquals("2",game.convertFizzBuzz(2));
	}

	@Test
	public void fizzBuzzConverterShouldReturnFizzForInput3(){

		assertEquals(fizz,game.convertFizzBuzz(3));
	}

	@Test
	public void fizzBuzzConverterShouldReturnFizzForInput6(){

		assertEquals(fizz,game.convertFizzBuzz(6));
	}

	@Test
	public void fizzBuzzConverterShouldReturnFizzForInput99(){

		assertEquals(fizz,game.convertFizzBuzz(99));
	}

}
