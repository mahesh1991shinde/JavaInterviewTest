package com.ubs.opsit.interviews;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class MinutesProcessorTestForValidValues {

	private static MinutesProcessor processor = null;
	
	private String input;
	private String expcted;
	
	public MinutesProcessorTestForValidValues(String input,String expected) {
		this.input = input;
		this.expcted = expected;
	}
	
	@BeforeClass
	public static void setUp()
	{
		processor = new MinutesProcessor();
	}
	
	@Test
	public void testForValidHoursValue() 
	{
		assertEquals("Values Dont Match for : "+input+":"+expcted, processor.getMinutesRepresentation(input), expcted);
	}
	
	@Parameters
	public static Collection<Object[]> get()
	{
		List<Object[]> list = new ArrayList<>();
		Object[] lObject;
		lObject = new Object[]{"59","YYRYYRYYRYY\r\nYYYY"};
		list.add(lObject);
		
		lObject = new Object[]{"01","OOOOOOOOOOO\r\nYOOO"};
		list.add(lObject);
		
		lObject = new Object[]{"12","YYOOOOOOOOO\r\nYYOO"};
		list.add(lObject);
		
		lObject = new Object[]{"00","OOOOOOOOOOO\r\nOOOO"};
		list.add(lObject);
		
		lObject = new Object[]{"21","YYRYOOOOOOO\r\nYOOO"};
		list.add(lObject);
		
		lObject = new Object[]{"15","YYROOOOOOOO\r\nOOOO"};
		list.add(lObject);
		
		lObject = new Object[]{"7","YOOOOOOOOOO\r\nYYOO"};
		list.add(lObject);
		
		
		lObject = new Object[]{"05","YOOOOOOOOOO\r\nOOOO"};
		list.add(lObject);
		
		return list;
	}	
}
