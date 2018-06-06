package com.ubs.opsit.interviews;

public class MinutesProcessor 
{
	public String getMinutesRepresentation(String minStr)
	{
		try
		{
			Integer min = Integer.parseInt(minStr);
			if(min <0 || min > 59)
				throw new NumberFormatException();
			
			return processFirstMinRow(min)+"\r\n"+processSecondMinRow(min);
			
		}
		catch (NumberFormatException e) 
		{
			throw new NumberFormatException("Seconds should be a valid number between 0 - 59");
		}
	}
	
	//first min row has 11 lights
	//Y/R for ON O for off
	private String processFirstMinRow(Integer min)
	{
		return CommonUtil.processFirstRow(min, 5, 11, 'Y', 'O').replaceAll("YYY","YYR");
		//return output;
	}
	
	private String processSecondMinRow(Integer min)
	{
		return CommonUtil.processSecondRow(min, 5, 4, 'Y', 'O');
	}
}