package day17;

public interface IAnimal {
	 public static final String Catogory = "Living Being";
	 
	  static boolean isMammal( String animalName) {
		 return (animalName.equalsIgnoreCase("dog")) || (animalName.equalsIgnoreCase("cat")) || (animalName.equalsIgnoreCase("human"));
	  }
		default void speak() {
		 System.out.println("animal is making sound");
	 }
				abstract void move(); 
	 }
	 
