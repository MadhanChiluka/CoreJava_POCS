package com.javalang;

public class WrapperClassDemo {
	public static void main(String[] args) {
		Integer integer = new Integer(10);
		Integer integer2 = new Integer("10");
		Integer integer3 = Integer.valueOf(10);
		Integer integer4 = Integer.valueOf("10");
		Integer integer5 = Integer.valueOf("353599", 36);
		String s1= Integer.toString(integer);
		int i = Integer.parseInt("14562");
		 int i2= 100;
		 String s2 = Integer.toBinaryString(7);
		System.out.println(s2 + "______" + integer4.toString() + "______" + integer5);

		System.out.println(integer.intValue());
		System.out.println(integer.byteValue());
		System.out.println(integer.shortValue());
		System.out.println(integer.longValue());
		System.out.println(integer.floatValue());
		System.out.println(integer.doubleValue());
		
		
		// Integer integer3= new Integer("ten");
		System.out.println(+integer + "____" + integer2);

		Float float1 = new Float(10.5);
		Float float2 = new Float("10.5");
		Float float3 = new Float(10.5f);
		Float float4=  Float.valueOf(10.5f);
		Float f = Float.parseFloat("10.5f");
		System.out.println(f + "______" + float2 + "______" + float3 + "_______"+ float4);

		Character character = new Character('a');
		System.out.println(character.charValue());

		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean("True");
		Boolean boolean3 = new Boolean("ashok");
		Boolean boolean4 = new Boolean(true);
		Boolean boolean5 = new Boolean("False");
		Boolean boolean6= Boolean.valueOf(false);
		Boolean b = Boolean.parseBoolean("false");
		
		System.out.println(
				boolean1.booleanValue() + "_____" + b + "______" + boolean3 + "_______" + boolean4 + "________" + boolean5 + "________" + boolean6);

	}
}
