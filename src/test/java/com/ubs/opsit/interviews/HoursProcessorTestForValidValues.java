package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;

import com.ubs.opsit.interviews.HoursProcessor;

@RunWith(value=Parameterized.class)
public class HoursProcessorTestForValidValues {

	private static HoursProcessor processor = null;
	
	private String input;
	private String expcted;
	public HoursProcessorTestForValidValues(String input,String expected) {
		this.input = input;
		this.expcted = expected;
	}
	
	@BeforeClass
	public static void setUp()
	{
		processor = new HoursProcessor();
	}
	
	@Test
	public void testForValidHoursValue() 
	{
		assertEquals("Values Dont Match for : "+input+":"+expcted, processor.getHoursRepresentation(input), expcted);
	}
	
	@Parameters
	public static Collection<Object[]> get()
	{
		List<Object[]> list = new ArrayList<>();
		Object[] lObject;
		lObject = new Object[]{"23","RRRR\r\nRRRO"};
		list.add(lObject);
		
		lObject = new Object[]{"1","OOOO\r\nROOO"};
		list.add(lObject);
		
		lObject = new Object[]{"12","RROO\r\nRROO"};
		list.add(lObject);
		
		lObject = new Object[]{"0","OOOO\r\nOOOO"};
		list.add(lObject);
		
		lObject = new Object[]{"15","RRRO\r\nOOOO"};
		list.add(lObject);
		
		return list;
	}	
}