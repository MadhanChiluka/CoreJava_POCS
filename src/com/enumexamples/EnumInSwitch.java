package com.enumexamples;

public class EnumInSwitch {
	
public enum Animal implements Carnivorous{
		
		LION, TIGER, LEOPARD, DEER;
		@Override
		public void carnivorous() {
			System.out.println("This is carnivorous");
		}

	}


	public static void main(String[] args) {
		
		Animal[] animal = Animal.values();
		for (Animal animal1 : animal) {
			System.out.println(animal1+"_____"+animal1.ordinal());
		}
		
		
		Animal herbivorous = Animal.DEER;
		switch (herbivorous) {
		case LION:
			System.out.println("Lion is known as king of forest and it is carnivorus");
			break;

		case TIGER:
			System.out.println("Tiger is most cruel and cornivorus animaml");
			break;

		case DEER:
			System.out.println("Deer is Herbivorous animal");
			break;

		case LEOPARD:
			System.out.println("Leopard is known for speed it runs fast and attacks quickly");
			break;

		default:
			System.out.println("No animal is matching");
		}

	}

}
