package com.ubs.opsit.interviews;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ubs.opsit.interviews.SecondsProcessor;

public class SecondsProcessorTest {

	private static SecondsProcessor processor = null;
	
	@BeforeClass
	public static void setUp()
	{
		processor = new SecondsProcessor();
	}
	
	@Test(expected = NumberFormatException.class)
	public void testStringValueForSeconds() 
	{
		processor.getSecondsRepresentation("invalid");
	}
	
	@Test(expected = NumberFormatException.class)
	public void testNegValueForSeconds() 
	{
		processor.getSecondsRepresentation("-20");
	}
	
	@Test(expected = NumberFormatException.class)
	public void testOutOfRangeValueForSeconds() 
	{
		processor.getSecondsRepresentation("90");
	}
	
	@Test
	public void testForOn() 
	{
		assertEquals("Values Dont Match", processor.getSecondsRepresentation("50"), "Y");
	}
	
	@Test
	public void testForOff() 
	{
		assertEquals("Values Dont Match", processor.getSecondsRepresentation("59"), "O");
	}
}
