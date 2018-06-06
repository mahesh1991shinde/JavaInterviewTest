package com.ubs.opsit.interviews;


import org.junit.BeforeClass;
import org.junit.Test;

public class MinutesProcessorTestForInvalidValues {
	
	private static MinutesProcessor processor;
	
	@BeforeClass
	public static void setUp()
	{
		processor = new MinutesProcessor();
	}

	@Test(expected=NumberFormatException.class)
	public void testOutOfRangeUpperLimit()
	{
		processor.getMinutesRepresentation("60");
	}
	
	@Test(expected=NumberFormatException.class)
	public void testOutOfRangeLowerValue()
	{
		processor.getMinutesRepresentation("-1");
	}

}
