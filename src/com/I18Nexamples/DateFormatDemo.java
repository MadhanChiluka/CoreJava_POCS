package com.I18Nexamples;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		System.out.println("full form is "+DateFormat.getDateInstance(0).format(new Date()));
		System.out.println("long form is "+DateFormat.getDateInstance(1).format(new Date()));
		System.out.println("medium form is "+DateFormat.getDateInstance(2).format(new Date()));
		System.out.println("short form is "+DateFormat.getDateInstance(3).format(new Date()));
		
		
		DateFormat UK= DateFormat.getDateInstance(0,Locale.UK);
		System.out.println("UK date style is "+UK.format(new Date()));
		
		DateFormat US= DateFormat.getDateInstance(0,Locale.US); 
		System.out.println("US date style is "+US.format(new Date()));
		
		DateFormat Italy= DateFormat.getDateInstance(0,Locale.ITALY);
		System.out.println("Italy date style is "+Italy.format(new Date()));
		
		DateFormat canada = DateFormat.getDateTimeInstance(0, 0, Locale.CANADA);
		System.out.println("Canada date style is "+canada.format(new Date()));
		

	}

}
