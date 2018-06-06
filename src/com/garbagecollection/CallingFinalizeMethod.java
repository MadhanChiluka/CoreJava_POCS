package com.garbagecollection;

public class CallingFinalizeMethod {

	public static void main(String[] args) {
		String string = new String("Madhan");
	CallingFinalizeMethod finalizeMethod= new CallingFinalizeMethod();
	
	finalizeMethod.finalize();
	finalizeMethod.finalize();  // ----> executes as a normal method and object wont be destroyed 
	                            //but after calling System.gc() finalize() will executes once compulsory
	
	/*
	 * string=null; --->here System.gc() calls String class finalize() if available else executes Object class finalize();
	 * 
	 * */
	
	finalizeMethod=null; //----> Here System.gc() calls overridden finalize() present in CallingFinalizeMethod class  
	System.gc();
	System.out.println("End of Main");
	}
	public void finalize() {
		System.out.println("Finalize Method Called");
		//System.out.println(10/0);-->If finalize() called as a normal method exception is raised else no exception.
	}

}
