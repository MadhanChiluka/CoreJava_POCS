package com.I18Nexamples;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		double d= 123456.789;
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Italy form is " +numberFormat.format(d));
		
		NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println("Italy notation is " +numberFormat1.format(d));
		
		Locale INDIA = new Locale("pa","IN");
		NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(INDIA);
		System.out.println("Indian notation is "+numberFormat2.format(d));
		
		NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK notation is "+numberFormat3.format(d));
		
		NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Us notation is "+numberFormat4.format(d));
		
		NumberFormat format= NumberFormat.getInstance();
		format.setMaximumFractionDigits(3);
		System.out.println(format.format(123.4));
		System.out.println(format.format(123.4567));
		
		format.setMinimumFractionDigits(3);
		System.out.println(format.format(123.4));
		System.out.println(format.format(123.4567));
		
		format.setMaximumIntegerDigits(3);
		System.out.println(format.format(1.234));
		System.out.println(format.format(123456.789));
		
		format.setMinimumIntegerDigits(3);
		System.out.println(format.format(1.234));
		System.out.println(format.format(123456.789));
		
	}

}