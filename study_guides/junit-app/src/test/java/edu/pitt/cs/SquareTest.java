package edu.pitt.cs;

import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class SquareTest {

	/**
	 * Write an integration test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredIntegration() {
		// TODO: Fill in!
		Square square = new Square();
		Number number = new Number();
		square.setSquared(number, 3);
		assertEquals(number.getVal(), 9);
	}

	/**
	 * Write a unit test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredUnit() {
		// TODO: Fill in!
		Square square = new Square();
		Number number = Mockito.mock(Number.class);
		
		square.setSquared(number, 3);
		Mockito.verify(number).setVal(9);
		//use below if we want to check that setSquared(3) was never called
		//can also use Mockito.times(1) to see if it was called once
		//Mockito.verify(number, Mockito.never()).setVal(9);
	}
}
