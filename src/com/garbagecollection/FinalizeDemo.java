package com.garbagecollection;

public class FinalizeDemo {

	static FinalizeDemo fd;

	public static void main(String[] args) throws InterruptedException {
		FinalizeDemo finalizeDemo = new FinalizeDemo();
		System.out.println(finalizeDemo.hashCode());
		finalizeDemo = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(fd.hashCode());
		fd = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("End of main");
	}

	public void finalize() {
		System.out.println("Finalize method called");
		fd = this;
	}

}
