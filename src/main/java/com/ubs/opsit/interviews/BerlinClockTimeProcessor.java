package com.ubs.opsit.interviews;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.ubs.opsit.interviews.HoursProcessor;
import com.ubs.opsit.interviews.MinutesProcessor;
import com.ubs.opsit.interviews.SecondsProcessor;

public class BerlinClockTimeProcessor implements TimeConverter
{
	private SecondsProcessor secProcessor = new SecondsProcessor();
	private MinutesProcessor minProcessor = new MinutesProcessor();
	private HoursProcessor hourProcessor = new HoursProcessor();
	private static SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
	
	public String convertTime(String time)
	{
		//check for format of input time
		if(time == null || time.isEmpty())
			throw new RuntimeException("Input Time is empty");
		try 
		{
			df.parse(time);
		} 
		catch (ParseException e) {
			throw new RuntimeException("Time Format should be HH:mm:ss. Found :"+time);
		}
		String timeParts[] = time.split(":"); 
		return secProcessor.getSecondsRepresentation(timeParts[2])+"\r\n"+hourProcessor.getHoursRepresentation(timeParts[0])+"\r\n"+minProcessor.getMinutesRepresentation(timeParts[1]);
	}
}
