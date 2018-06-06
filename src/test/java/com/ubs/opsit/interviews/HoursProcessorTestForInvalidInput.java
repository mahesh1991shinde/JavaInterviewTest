package com.ubs.opsit.interviews;



import org.junit.BeforeClass;
import org.junit.Test;

import com.ubs.opsit.interviews.HoursProcessor;

public class HoursProcessorTestForInvalidInput {

	private static HoursProcessor processor = null;
	
	@BeforeClass
	public static void setUp()
	{
		processor = new HoursProcessor();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testOutOfRangeUpperLimit()
	{
		processor.getHoursRepresentation("25");
	}
	
	@Test(expected=NumberFormatException.class)
	public void testOutOfRangeLowerLimit()
	{
		processor.getHoursRepresentation("-1");
	}
	
	@Test(expected=NumberFormatException.class)
	public void testForInvalidChar()
	{
		processor.getHoursRepresentation("ABC");
	}
	
}