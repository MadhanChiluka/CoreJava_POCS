package com.javalang;

public class AutoBoxingAutoUnBoxing {
static Integer I=100;
public static void main(String[] args) {
	long i=10;
	methodOne(i);
	
	
	Integer i1=10;
	Long l1=10L;
	
	
	
	
	/*Integer a= -128;
	Integer b= -128;
	Byte byte1= 14;
	Byte byte2= Byte.valueOf((byte) 14);
	//++a;
	System.out.println(a+"_____"+b);
	System.out.println(byte1==byte2);
	*/
}
public static void methodOne(Integer I) {
	System.out.println("Autoboxing");
	
	
}
public static void methodOne(long l) {
System.out.println("Widening");

}
public static void methodOne(int...i) {
	System.out.println("Var-args");

}
}
