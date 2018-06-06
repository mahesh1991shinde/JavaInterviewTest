package com.ubs.opsit.interviews;

public class HoursProcessor 
{
	public String getHoursRepresentation(String hourStr)
	{
		try
		{
			Integer hour = Integer.parseInt(hourStr);
			if(hour <0 || hour > 24)
				throw new NumberFormatException();
			
			return processFirstHourRow(hour)+"\r\n"+processSecondHourRow(hour);
			
		}
		catch (NumberFormatException e) 
		{
			throw new NumberFormatException("Hours should be a valid number between 0 - 23");
		}
	}
	
	//first hour row has 4 lights
	//R for ON O for off
	private String processFirstHourRow(Integer hour)
	{
		return CommonUtil.processFirstRow(hour, 5, 4, 'R', 'O');
		//return output;
	}
	
	private String processSecondHourRow(Integer hour)
	{
		return CommonUtil.processSecondRow(hour, 5, 4, 'R', 'O');
		//return output;
	}
	
}
