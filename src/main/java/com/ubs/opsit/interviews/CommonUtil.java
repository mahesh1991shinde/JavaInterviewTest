package com.ubs.opsit.interviews;

public class CommonUtil 
{
	private CommonUtil(){}
	

	public static String processSecondRow(int time,int mod,int rowLength,char onChar,char offChar)
	{
		String output = "";
		int redCount = time%mod;
		for (int i = 0; i < redCount; i++) 
		{
			output = output + onChar;
		}
		int len = rowLength - output.length();
		for (int i = 0; i < len; i++) 
		{
			output = output + offChar;
		}
		return output;
	}
	
	public static String processFirstRow(int time,int div,int rowLength,char onChr,char offChar)
	{
		String output = "";
		int redCount = time/div;
		for (int i = 0; i < redCount; i++) 
		{
			output = output + onChr;
		}
		int len = rowLength - output.length();
		for (int i = 0; i < len; i++) 
		{
			output = output + offChar;
		}
		return output;
	}
}
