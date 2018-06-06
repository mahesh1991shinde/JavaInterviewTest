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

import com.ubs.opsit.interviews.BerlinClockTimeProcessor;

@RunWith(value=Parameterized.class)
public class BerlinClockTimeProcessorTestForValidInputs {
	
	
private static BerlinClockTimeProcessor processor = null;
	
	private String input;
	private String expcted;
	public BerlinClockTimeProcessorTestForValidInputs(String input,String expected) 
	{
		this.input = input;
		this.expcted = expected;
	}
	
	@BeforeClass
	public static void setUp()
	{
		processor = new BerlinClockTimeProcessor();
	}

	@Test
	public void testForValidTime() 
	{
		assertEquals("Values Dont Match for : "+input+"-"+expcted, processor.convertTime(input), expcted);
	}
	
	@Parameters
	public static Collection<Object[]> get()
	{
		List<Object[]> list = new ArrayList<>();
		Object[] lObject;
		lObject = new Object[]{"23:59:10","Y\r\nRRRR\r\nRRRO\r\nYYRYYRYYRYY\r\nYYYY"};
		list.add(lObject);
		
		
		lObject = new Object[]{"10:28:37","O\r\nRROO\r\nOOOO\r\nYYRYYOOOOOO\r\nYYYO"};
		list.add(lObject);
		
		lObject = new Object[]{"12:19:43","O\r\nRROO\r\nRROO\r\nYYROOOOOOOO\r\nYYYY"};
		list.add(lObject);
		
		lObject = new Object[]{"00:00:00","Y\r\nOOOO\r\nOOOO\r\nOOOOOOOOOOO\r\nOOOO"};
		list.add(lObject);
		
		lObject = new Object[]{"15:15:15","O\r\nRRRO\r\nOOOO\r\nYYROOOOOOOO\r\nOOOO"};
		list.add(lObject);
		
		lObject = new Object[]{"0:0:0","Y\r\nOOOO\r\nOOOO\r\nOOOOOOOOOOO\r\nOOOO"};
		list.add(lObject);
		
		lObject = new Object[]{"06:06:08","Y\r\nROOO\r\nROOO\r\nYOOOOOOOOOO\r\nYOOO"};
		list.add(lObject);
		
		return list;
	}
}
