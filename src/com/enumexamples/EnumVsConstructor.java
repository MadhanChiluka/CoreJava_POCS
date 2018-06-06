package com.enumexamples;

public class EnumVsConstructor {
	
	enum Laptop {
	DELL, MACBOOK ,HP, SONY, LENOVO;
		//DELL(40000), MACBOOK(95000), HP(38000), SONY(36000), LENOVO(29000);
		
		int price;
		public int getPrice() {
			return price;
		}
		Laptop(int price){
			this.price=price;
		}
		
		Laptop() {
			System.out.println("Constructor method called");
			this.price=45000;
		}
	}

	public static void main(String[] args) {
	Laptop laptop1= Laptop.MACBOOK;
	System.out.println("Hellow "+laptop1);
	
	Laptop[] laptops = Laptop.values();
	for(Laptop laptop:laptops) {
		System.out.println(laptop+"____"+laptop.getPrice());
	}
	}

}
