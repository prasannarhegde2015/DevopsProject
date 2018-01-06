package com.example.numtowrod;

public class NumbertoWord {
	
	String[] unitarray = { "one","two","three","four","five","six","seven","eight","nine","ten"};
	String[] teenarray = { "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	String[] tensarray = {"ten","twenty","thirty","forty","fifty","sxity","seventy","eigthy","ninty"};
	String[] hundredarray = {"one hundred","two hundred","three hundred","four hundred","five hundred","six hundred",
			 "seven hundred","eight hundred","nine hundred"};
	
	public String numbertoword(int intnum)
	{
		String dunit = "";
		String tens = "";
	//	String hundreds = "";
		String retval = "";
		
		switch(String.valueOf(intnum).length())
		{
		case  1 : 
		{
		     dunit = unitarray[intnum-1];
			 retval = dunit;
			 break;
		}
		case  2 : 
		{
			int tenval = intnum/10;
			int tenremminder = intnum % 10;
			if (tenval == 1)
			{
				tens= teenarray[tenremminder-1];
				
			}
			else
			{
				tens = tensarray[tenval-1];
			}	
			dunit = unitarray[tenremminder-1];
			//tens = tensarray[tenval-1];
			if (tenval == 1)
			{
				retval = tens;
			}
			else
			{
			retval = tens + " " + dunit;
			}
			break;
		}
		case  3 : 
		{
		
			int hunval = intnum/100;
			int hunreminder = intnum % 100;
			
			int tenval = hunreminder / 10;
			int tenremminder = hunreminder % 10;
			String huns = hundredarray[hunval -1];
			if (tenval == 0)
			{
				tens = "";
				
			}
			else if (tenval == 1)
			{
				tens = teenarray[tenremminder-1];
				
			}
			else
			{
				tens = tensarray[tenval-1];
			}
			dunit = unitarray[tenremminder-1];
			if (hunreminder < 10 )
			{
				retval =  huns+" " + dunit;
			}
			else if (tenval == 1)
			{
				retval =  huns+" "+tens;
			}
			else 
			{
			retval =  huns+" "+tens + " " + dunit;
			}
			break;
			
		}
		default:
		{
			retval = "Error";
		}
		}
		
		return retval;
	}

}
