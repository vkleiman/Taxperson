package com.sky;

public class Taxperson {

	private static double REG_TAX = 1.01;
	private static double LUX_TAX = 1.09;
	
	public static int getCost(int price, boolean luxury)
	{
		double tax = REG_TAX;
		
		if(luxury)
			tax = LUX_TAX;
		
		return (int) Math.round((price * tax));
	}
}
