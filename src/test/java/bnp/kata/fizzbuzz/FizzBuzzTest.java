package bnp.kata.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest  {

	FizzBuzz game;
	private static final String fizz="Fizz";
	private static final String buzz="Buzz";

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

	@Test
	public void fizzBuzzConverterShouldReturnBuzzForInput5(){

		assertEquals(buzz,game.convertFizzBuzz(5));
	}

	@Test
	public void fizzBuzzConverterShouldReturnBuzzForInput10(){

		assertEquals(buzz,game.convertFizzBuzz(10));
	}

	@Test
	public void fizzBuzzConverterShouldReturnBuzzForInput100(){

		assertEquals(buzz,game.convertFizzBuzz(100));
	}

	@Test
	public void fizzBuzzConverterShouldReturnFizzBuzzForInput15(){

		assertEquals(fizz+buzz,game.convertFizzBuzz(15));
	}

	@Test
	public void fizzBuzzConverterShouldReturnFizzBuzzForInput90(){

		assertEquals(fizz+buzz,game.convertFizzBuzz(90));
	}

}
