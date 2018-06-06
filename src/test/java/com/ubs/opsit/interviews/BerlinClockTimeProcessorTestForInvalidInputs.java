package com.ubs.opsit.interviews;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ubs.opsit.interviews.BerlinClockTimeProcessor;


public class BerlinClockTimeProcessorTestForInvalidInputs {
	
	
private static BerlinClockTimeProcessor processor = null;
	
	
	@BeforeClass
	public static void setUp()
	{
		processor = new BerlinClockTimeProcessor();
	}

	@Test(expected=RuntimeException.class)
	public void testForEmpty() 
	{
		processor.convertTime("");
	}
	
	@Test(expected=RuntimeException.class)
	public void testForInvalidFormat_DifferentSeparator() 
	{
		processor.convertTime("23-25-59");
	}
	
	@Test(expected=RuntimeException.class)
	public void testForInvalidFormat_InvalidCharInInput() 
	{
		processor.convertTime("AA:25:59");
	}
	@Test(expected=RuntimeException.class)
	public void testForInvalidFormat_NegNumber() 
	{
		processor.convertTime("23:-5:59");
	}
}
