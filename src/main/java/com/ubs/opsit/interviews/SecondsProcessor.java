package com.ubs.opsit.interviews;

public class SecondsProcessor 
{
	public String getSecondsRepresentation(String str)
	{
		try
		{
			int sec = Integer.parseInt(str);
			if(sec < 0 || sec > 59)
				throw new NumberFormatException();
			return sec%2 == 0 ? "Y": "O";
		}
		catch (NumberFormatException e) 
		{
			throw new NumberFormatException("Seconds should be a valid number between 0 - 59");
		}
	}
}
