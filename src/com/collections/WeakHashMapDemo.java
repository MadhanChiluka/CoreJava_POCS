package com.collections;

import java.util.HashMap;
import java.util.WeakHashMap;

import javax.sound.midi.SysexMessage;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap hashMap = new WeakHashMap();
		Temp temp = new Temp();
		hashMap.put(temp, "Madhan");
		System.out.println(hashMap);
		temp=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hashMap);
		
	}

}
class Temp {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Temp []";
	}
	public void finalize() {
		System.out.println("finalize() method called");
	}
}